package string_builder;

public class Main_Char {

	public static void main(String[] args) {
//		StringTools c = new StringTools("Hallo");
//		c.PrintCharByChar();
//		c.PrintCharByCharInverse();
		String str[] = new String[3];
		str[0] = "Ahmad";
		str[1] = "Amr";
		str[2] = "Diana";
		StringTools c = new StringTools(str);
				c.printStringArray();

	}

}
