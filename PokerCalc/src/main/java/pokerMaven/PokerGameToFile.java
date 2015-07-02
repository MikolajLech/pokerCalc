package pokerMaven;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PokerGameToFile implements Viewer<PokerGame>{
	private PrintWriter outFile;
	PokerGameToFile() {
		try {
			outFile = new PrintWriter("pokerResults");
		}
		catch(FileNotFoundException exception) {
			System.out.println(exception);
		}		
	}
	@Override
	public void prt(PokerGame pokerGame) {
		prtDealEvaluation(pokerGame);
		prtHandsConfigs(pokerGame);
		System.out.printf("%5s", "");
		for(Hand hand : pokerGame.getDeal().getHands()) {
			for(Card card : hand.getCards()) {
				System.out.printf("%-6s%-10s", card.getValue(), card.getSuite());
			}
			System.out.printf("%10s", "");
		}
		System.out.println();
	}
	public void prtHandsConfigs(PokerGame pokerGame) {
		for(Hand hand : pokerGame.getDeal().getHands()) {
			System.out.printf("%-10s", hand.getHandConfType());
		}
	}
	public void prtDealEvaluation(PokerGame pokerGame) {
		System.out.printf("%-3s", pokerGame.getDealEvaluation());
	}
}
