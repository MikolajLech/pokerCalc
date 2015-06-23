package pokerMaven;

import java.util.Collections;
import java.util.ArrayList;

public class DealEvaluator {
	public int getBestHand(Deal deal) {
		ArrayList<Hand> sortedHands = sortHands(deal.getHands());
		return deal.getHands().indexOf(sortedHands.get(0)) + 1; // get index of first hand from sorted deal in original deal, +1 so that it's a natural indexing
	}
	public ArrayList<Hand> sortHands(ArrayList<Hand> originalHands) {
		ArrayList<Hand> sortedHands = new ArrayList<Hand>(originalHands);
		Collections.sort(sortedHands, Collections.reverseOrder(new HandComparator()));
		return sortedHands;
	}
}
