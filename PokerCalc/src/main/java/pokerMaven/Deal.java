package pokerMaven;
import java.util.ArrayList;

public class Deal {
	private int mHandsNum;
	private ArrayList<Hand> mHands = new ArrayList<Hand>();

    public Deal() {	
    }
    Deal(Deal deal) {
    	mHands = new ArrayList<Hand>(deal.mHands);
    	mHandsNum = deal.mHandsNum;
    }
    public void clear() {
    	mHands.clear();
    }
    public void add(Hand inHand) {
    	mHands.add(inHand);
    }
	public ArrayList<Hand> getHands() {
		return mHands;
	}
	public Hand getHand(int i) {
		return mHands.get(i);
	}
	
}
