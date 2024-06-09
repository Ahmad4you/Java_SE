package myErsteFile;

import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class My_io_file {

	public static void main(String[] args)  {
		try {
			PrintWriter pw = new PrintWriter("myFile.txt");
			pw.println("Hallo");
			pw.println("Welcom");
			pw.close();
			
			
		} catch (Exception ex) {
//			e.printStackTrace();
			JOptionPane.showMessageDialog(null, ex);
		}
		
	}

}
