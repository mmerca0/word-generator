import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ListCreator {
	
	private Scanner s;
	private Word w;
	private WordList wl;
	private int i = 0;
	private static final int LIST_SIZE = 300000;
	private static final String FILE_PATH = "C:/Users/Michael/workspace/Random_Word/src/englishWords.txt";
	
	public ListCreator() throws IOException{
		this.wl = new WordList(LIST_SIZE);
		try {
			s = new Scanner(new BufferedReader(new FileReader(FILE_PATH)));
			while (s.hasNext() && i< LIST_SIZE){
				w = new Word(s.next());
				wl.add(w);
				i++;
			}
		}
		finally {
			if (s!=null){
				s.close();
			}
		}
	}
	
	public WordList getWordList(){
		if(!this.wl.isEmpty()){
			return this.wl;
		}
			return null;
	}

}
