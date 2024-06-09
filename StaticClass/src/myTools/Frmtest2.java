package myTools;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

//@SuppressWarnings("serial")
public class Frmtest2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtFileName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frmtest2 frame = new Frmtest2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */                                 
	public Frmtest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFrmtest_1 = new JLabel("Frmtest2");
		lblFrmtest_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblFrmtest_1.setBounds(179, 0, 105, 34);
		contentPane.add(lblFrmtest_1);
		
		txtFileName = new JTextField();
		txtFileName.setText("Empty");
		txtFileName.setBounds(194, 46, 189, 19);
		contentPane.add(txtFileName);
		txtFileName.setColumns(10);
		
		JButton btnCreatEmptyFile = new JButton("Creat Empty File");
		btnCreatEmptyFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tools.createEmptyFile(txtFileName.getText() + ".txt");
			}
		});
		btnCreatEmptyFile.setBounds(194, 77, 189, 25);
		contentPane.add(btnCreatEmptyFile);
		
		JLabel lblNewLabel = new JLabel("File Name");
		lblNewLabel.setBounds(22, 48, 89, 15);
		contentPane.add(lblNewLabel);
		
		JButton btncustom = new JButton("Create custom File");
		btncustom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object myData[] = {"welcom Back...", 155, 'w', true, 1.5 };
//				Tools.createFile(txtFileName.getText() + ".txt", myData);
				Tools.createFile(txtFileName.getText() + ".docx", myData);
			}
		});
		btncustom.setBounds(194, 146, 189, 25);
		contentPane.add(btncustom);
		
		JButton btnTestInputbox = new JButton("Test InputBox");
		btnTestInputbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object objEingabe = Tools.InputBox("Enter Your Name: ");
				Tools.msgBox( "welcom Back " + objEingabe);
//				Tools.InputBox("Enter Name: ");
			}
		});
		btnTestInputbox.setBounds(194, 211, 189, 25);
		contentPane.add(btnTestInputbox);
		
		JButton btnGetnumber = new JButton("getNumber");
		btnGetnumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tools.msgBox(Tools.getNumber("g7hk9kk0dd5e31jjk03"));
				Tools.msgBox(String.valueOf(Tools.getNumberToInteger("7hk9kt0")));
			}
		});
		btnGetnumber.setBounds(22, 77, 139, 25);
		contentPane.add(btnGetnumber);
		
		JButton btnRemoveNum = new JButton("remove Num");
		btnRemoveNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tools.msgBox(Tools.removeNumber("g7hA9ky0dx5e31jsk03"));
			}
		});
		btnRemoveNum.setBounds(22, 103, 139, 25);
		contentPane.add(btnRemoveNum);
		
		JButton btnCreatEmptyFiles = new JButton("Creat Empty Files");
		btnCreatEmptyFiles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String names[] = {"Ahmad", "Leen", "new File"};
				Tools.createEmptyFiles(names);
			}
		});
		btnCreatEmptyFiles.setBounds(194, 103, 189, 25);
		contentPane.add(btnCreatEmptyFiles);
		
		JButton btncustoms = new JButton("Create custom Files");
		btncustoms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String names1[] = {"Ahmad11", "Ahmad111", "Ahmad1111"};
				String names2[] = {"Diana22", "Diana222", "Diana2222"};
				String names3[] = {"Leen33", "Leen333", "Leen3333"};
				Object allNames[][] = {names1, names2, names3};
				
				String fileNames[] = {"File1", "File2", "File3"};
				Tools.createFiles(fileNames, allNames);
			}
		});
		btncustoms.setBounds(194, 170, 189, 25);
		contentPane.add(btncustoms);
		
		JButton btnPrintScreen = new JButton("print Screen");
		btnPrintScreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Tools.printScreen("my image", new Frmtest2());
				printScreen("my image");
			}
		});
		btnPrintScreen.setBounds(22, 146, 139, 25);
		contentPane.add(btnPrintScreen);
	}
	public void printScreen(String Imagename) {
		try {
			this.setState(1);   // to minimize form
			Robot r = new Robot();
			Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());   // to getScreenSize
			BufferedImage img = r.createScreenCapture(rec);
			ImageIO.write(img, "jpg", new File(Imagename + ".jpg")  );
			this.setState(0);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
