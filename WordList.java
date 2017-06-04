
public class WordList {
	private Word list[] ;
	private int index;
	private String print;
	private static final int DEFAULT_SIZE = 300000;
	private boolean empty;
	
	public WordList(){
		this.list = new Word[DEFAULT_SIZE];
		this.index = 0;
		empty = true;
	}
	
	public WordList(int size){
		this.list = new Word[size];
		this.index = 0;
		empty = true;
	}
	
	public void add(Word newWord){
		list[index]= newWord;
		this.index++;
		empty = false;
	}
		
	public Word getWord(int i){
		return list[i];
	}
	
	public String display(){
		for(int i=0;i<index;i++){
			this.print = this.print + this.list[i] + "\n";
		}
		return this.print;
	}
	
	public boolean isEmpty(){
		return this.empty;
	}
	
}
