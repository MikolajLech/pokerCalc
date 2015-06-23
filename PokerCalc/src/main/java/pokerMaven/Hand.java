package pokerMaven;
import java.util.ArrayList;
import java.util.Collections;

public class Hand {
	private ArrayList<Card> mCards = new ArrayList<Card>();
	private HandConfigType mHandConfType;
	public Hand(String inHand) {
		String inCard;
		int k = 0;
		for(int i = 0; i < 5; i++) {
			if(i == 4 )
				inCard = inHand.substring(k, k + 2);
			else
				inCard = inHand.substring(k, k + 3);
			mCards.add(new Card(inCard));
			k += 3;
		}
	}
	public HandConfigType getHandConfType() {
		return mHandConfType;
	}
	public void setHandConfigType(HandConfigType handConfType) {
		mHandConfType = handConfType;
	}
	public ArrayList<Card> getCards() {
		return mCards;
	}
	public void sortHand() {
		Collections.sort(mCards, Collections.reverseOrder(new CardValueComparator()));
	}
	public int handSize() {
		return mCards.size();
	}
	public Value getCardEnumVal(int i) {
		return mCards.get(i).getValue();
	}
	public int getCardIntVal(int i) {
		return mCards.get(i).getValue().getValue();
	}
	public Suite getCardEnumSuite(int i) {
		return mCards.get(i).getSuite();
	}
}
