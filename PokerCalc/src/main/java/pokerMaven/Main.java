package pokerMaven;

//TODO Create Adapter, Controller class responsible for printing data, gui etc.
/**
 * @author MILECH
 *
 */
public class Main {

	public static void main(String[] args) {
		PokerGame pokerGame = new PokerGame();
		Viewer<PokerGame> viewer = new PokerGameViewer();
		for(int i = 0; i < 1000; i++) {
			pokerGame.loadNextDeal();	
			pokerGame.evalDeal();
//			pokerGame.prtDeal();
			viewer.prt(pokerGame);
		}
		pokerGame.prtGameResults();
	}
}
