import java.util.Random;
import javax.swing.*;
import java.io.IOException;

public class WordGenerator {
	private static Random r = new Random();
	private static ListCreator lc;
	private static WordList localWordList;
	private static final int RNDM_RNG = 300000;
	private static Word localWord;
	
	public static void main(String[] args) throws IOException{
			lc = new ListCreator();
			localWordList = lc.getWordList();
			localWord = localWordList.getWord(r.nextInt(RNDM_RNG));
			JOptionPane.showMessageDialog(null, localWord.display());
	}

}
