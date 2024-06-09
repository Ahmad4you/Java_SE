package string_builder;

public class StringTools {
	String text;
	private String inverseText;
	private String texts[];
	
	public StringTools(String text) {
		this.text = text;
	} 
	
	public StringTools(String texts[]) {
		this.texts = texts;        // this.texts from Class and not from parameter
	}
	public void PrintCharByChar() {
		for(char c: text.toCharArray())
			System.out.println(c);
	}
	public void PrintCharByCharInverse() {
		StringBuilder sb = new StringBuilder(text);
		inverseText = sb.reverse().toString();
		for(char c : inverseText.toCharArray()) {
			System.out.println(c);
		}
	}
	public void printStringArray() {
		for(String s : texts) {
			System.out.println(s);
		}
	}
}
