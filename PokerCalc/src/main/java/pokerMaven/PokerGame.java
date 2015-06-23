package pokerMaven;
import java.util.ArrayList;

public class PokerGame {
	private Deal mDeal;
	private Reader mReader;
	private Viewer<Deal> mViewer;
	private DealEvaluator mDealEvaluator;
	private int mDealEvaluation;
	private ArrayList<Integer> handsWinsNum = new ArrayList<Integer>();
	private int mFirstPlayerWinNum;
	private int mSecondPlayerWinNum;

	public PokerGame() {
		//TODO change project settings so that I don't have to put whole source location
		mDeal = new Deal();
		mReader = new FileReader("C:/Users/milech/git/pokerCalc/PokerCalc/src/main/resources/poker.txt");
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
		if((mDealEvaluation = mDealEvaluator.getBestHand(mDeal)) == 1)
			mFirstPlayerWinNum++;
		else
			mSecondPlayerWinNum++;
	}
	public int getDealEvaluation() {
		return mDealEvaluation;
	}
	public void prtGameResults() {
		System.out.println("First player wins: " + mFirstPlayerWinNum + " times.");
		System.out.println("Second player wins: " + mSecondPlayerWinNum + " times.");
	}
}
