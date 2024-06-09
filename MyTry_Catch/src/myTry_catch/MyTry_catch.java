package myTry_catch;

import javax.swing.JOptionPane;

public class MyTry_catch {

	public static void main(String[] args) {
		
		try {
			int num1 = 4;
			int num2 = 0;
			int r = num1 / num2;
			System.out.println(r);
			
			String str[]= new String[5];
			str[0] = "123";
			str[1] = "456";
			System.out.println(str[8]);
			
		}catch(Exception ex) {
//			System.out.println(ex.getMessage());
//			JOptionPane.showMessageDialog(null, ex);
//			JOptionPane.showMessageDialog(null, "/ by zero");
//			JOptionPane.showMessageDialog(null, ex.getMessage());
			if(ex.getMessage().equals("/ by zero")) {
				JOptionPane.showMessageDialog(null, "es darf nicht auf 0 dividieren");
			}else {
//				System.out.println("another fehler!!!!!");
				JOptionPane.showMessageDialog(null, "another fehler!!!!!");
				System.out.println(ex.getMessage());
			}
		}
	}

}
