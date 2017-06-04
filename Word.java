
public class Word {
	private String text="";
	private String print="";
	
	public Word(){}
	
	public Word(String newText){
		this.text = newText;
	}
	
	public void setText(String tempText){
		this.text=tempText;
	}
		
	public String display(){
		this.print = "Text: " + this.text + "\n ";
		System.out.println(this.print);
		return this.print;
	}
	
	public Word get(){
		return this;
	}
	
	public void set(String tempWord){
		this.text = tempWord;
	}

}
