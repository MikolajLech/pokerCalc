package pokerMaven;
import java.util.ArrayList;
import java.util.Collections;

public class CardHistogram {
	private ArrayList<Integer> mCardHistogram = new ArrayList<Integer>(); // A,K,Q,J,10,9,8,7,6,5,4,3,2
	public CardHistogram() {
		for (int i = 0; i < 13; i++) {
			mCardHistogram.add(0);
		}
	}
	public CardHistogram(CardHistogram cardHist) {
		this.mCardHistogram = new ArrayList<Integer>(cardHist.mCardHistogram);
	}
	public void incr(int index) {
		mCardHistogram.set(index, mCardHistogram.get(index) + 1);
	}
	public void sortHist() {
		Collections.sort(mCardHistogram, Collections.reverseOrder());
	}
	public void prtHist() {
		for(int i: mCardHistogram) {
			System.out.printf(i + " ");
		}
	}
	public int getField(int i) {
		return mCardHistogram.get(i);
	}
	public void clearHist() {
		for(int i = 0; i < mCardHistogram.size(); i++) {
			mCardHistogram.set(i, 0);
		}
	}
	public int getFourRank() {
		for(int i = 0; i < mCardHistogram.size(); i++) {
			if(mCardHistogram.get(i) == 4)
				return mCardHistogram.size() - i;
		}
		return 0;
	}
	public int getTripletRank() {
		for(int i = 0; i < mCardHistogram.size(); i++) {
			if(mCardHistogram.get(i) == 3)
				return mCardHistogram.size() - i;
		}
		return 0;
	}
	public int getPairRank() {
		for(int i = 0; i < mCardHistogram.size(); i++) {
			if(mCardHistogram.get(i) == 2)
				return mCardHistogram.size() - i;
		}
		return 0;
	}
	public int getHistSize() {
		return mCardHistogram.size();
	}
}
