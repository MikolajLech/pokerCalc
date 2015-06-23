package pokerMaven;
import java.util.ArrayList;

public class PokerGame {
	private Deal mDeal;
	private Reader mReader;
	private Viewer<Deal> mViewer;
	private DealEvaluator mDealEvaluator;
	private int mDealEvaluation;
	private ArrayList<Integer> handsWinsNum = new ArrayList<Integer>();

	public PokerGame() {
		//TODO change project settings so that I don't have to put whole source location
		mDeal = new Deal();
		mReader = new FileReader("C:/Users/milech/workspace/PokerMaven/src/main/resources/poker.txt");
		mViewer = new DealViewer();
		mDealEvaluator = new DealEvaluator();
	}
	public int getHandsWinsNum(int i) {
		return handsWinsNum.get(i);
	}
	public void loadNextDeal() {
		mDeal = mReader.loadNextDeal();
	}
	public void prtDeal() {
		mViewer.prt(mDeal);
	}
	public Deal getDeal() {
		return mDeal;
	}
	public void evalDeal() {
		mDealEvaluation = mDealEvaluator.getBestHand(mDeal);
	}
	public int getDealEvaluation() {
		return mDealEvaluation;
	}
}
