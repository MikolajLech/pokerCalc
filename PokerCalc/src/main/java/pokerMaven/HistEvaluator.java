package pokerMaven;

public class HistEvaluator {
	public HandConfigType evalConfType(CardHistogram cardHist, Hand hand) {
		cardHist = new CardHistogram(cardHist);
		cardHist.sortHist();
		//System.out.println();
		int fMaxC = cardHist.getField(0); // first max count
		int sMaxC = cardHist.getField(1); // second max count
		switch(fMaxC) {
			case 4: // four of a kind (quads)
				return HandConfigType.FOUROFKIND ;
			case 3: {
				if(sMaxC == 2) // full house (boat)
					return HandConfigType.FULLHOUSE;
				else // three of a kind (set)	
					return HandConfigType.THREEOFKIND;
			}
			case 2: {
				if(sMaxC == 2) // two pairs
					return HandConfigType.TWOPAIRS;
				else // one pair
					return HandConfigType.ONEPAIR;
			}
			default: {
				if(ifFlush(hand))
					if(ifStraight(hand))
						return HandConfigType.STRAIGHTFLUSH; // straight flush
					else
						return HandConfigType.FLUSH; // flush
				else if(ifStraight(hand))
					return HandConfigType.STRAIGHT; // straight
				else if(ifWheel(hand))
					return HandConfigType.STRAIGHT; // worst straight (wheel : A, 2, 3, 4, 5)
				else // highest card
					return HandConfigType.HIGHCARD;
			}
		}
	}
	private boolean ifFlush(Hand hand) {
		for(int i = 0; i < hand.handSize() - 1; i++) {
			if(hand.getCardEnumSuite(i) != hand.getCardEnumSuite(i+1))
				return false;
		}
		return true;
	}
	private boolean ifStraight(Hand hand) {
		if((hand.getCardIntVal(0) - hand.getCardIntVal(4)) == 4)
			return true;
		return false;
	}
	private boolean ifWheel(Hand hand) {
		if(hand.getCardEnumVal(0) == Value.ACE && hand.getCardEnumVal(1) == Value.FIVE)
			return true;
		return false;
	}

}
