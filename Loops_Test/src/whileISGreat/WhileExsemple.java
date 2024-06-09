package whileISGreat;

public class WhileExsemple {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		java.util.Scanner s= new java.util.Scanner(System.in);
		int num1;
		int num2;
		char ope;
		int result= 0;
		char confirm = 'y';
		
		while(confirm == 'y') {
			System.out.println("Enter number1: ");
			num1 = s.nextInt();
			System.out.println("Enter number2: ");
			num2 = s.nextInt();
			System.out.println("Enter The Operation: +, -, *, / ");
			ope = s.next().charAt(0);
			switch(ope) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = num1 / num2; break;
			}
			System.out.println("result is: " + result + "\n---------------------");
			System.out.println("if you want continu with another operation press (y) :");
			confirm = s.next().charAt(0);
			System.out.println();
		}
				
				
	}

}
