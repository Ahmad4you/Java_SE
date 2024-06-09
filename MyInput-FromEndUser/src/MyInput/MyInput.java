package MyInput;

public class MyInput {

	public static void main(String[] args) {
		
		System.out.println("Enter your Name: ");
		@SuppressWarnings("resource")
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String strName = scan.nextLine();
		
		System.out.println("Enter your Age: ");
		int age = scan.nextInt();
		
		System.out.println("your name is: " + strName);
		System.out.println("your Age is: " + age);

	}

}
