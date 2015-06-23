package pokerMaven;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

import com.google.common.io.Files;

public class FileReader implements Reader {
	private File mFile;
	private String mData;
	private Scanner mScanner;
	private int mCardsInHand = 5;
	private int mHandsNum = 2;
	public FileReader(String fileName) {
		try {
			mFile = new File(fileName);
		}
		catch(NullPointerException exception) {
			System.out.println(exception);
		}
		try {
			mData = Files.toString(mFile, Charset.forName("UTF-8"));
		}
		catch(IOException exception) {
			System.out.println(exception);
		}
		try {
			mScanner = new Scanner(mData);
		}
		catch(NullPointerException exception) {
			System.out.println(exception);
		}
//		scanner.close(); where to close this scanner
		
	}
    public Deal loadNextDeal() {
    	String inHand = "";
    	Deal outDeal = new Deal();
    	for(int i = 0; i < mHandsNum; i++) {
  	        for(int j = 0; j < mCardsInHand; j++) {
  	        	inHand += mScanner.next() + " ";
	        }
  	        outDeal.add(new Hand(inHand));
  	        inHand = "";
    	}
    	return outDeal;
	}
}
