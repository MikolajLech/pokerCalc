package pokerMaven;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class PokerGameViewer implements Viewer<PokerGame> {
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

