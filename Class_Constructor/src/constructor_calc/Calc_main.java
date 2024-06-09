package constructor_calc;

import java.util.Scanner;

public class Calc_main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number1: ");
		Double num1 = s.nextDouble();
		System.out.println("Enter the Number2: ");
		Double num2 = s.nextDouble();
		Calc c = new Calc(num1, num2);
//		Calc c = new Calc(10, 5);
		System.out.println(c.Add());
		System.out.println(c.Sub());
		System.out.println(c.Multi());
		System.out.println(c.Div());
	}

}
