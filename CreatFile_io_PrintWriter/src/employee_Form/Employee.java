package employee_Form;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

//@SuppressWarnings("serial")
public class Employee extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAdress;
	private JTextField txtPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
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
	public Employee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployyeForm = new JLabel("Employye Form");
		lblEmployyeForm.setFont(new Font("DejaVu Serif", Font.BOLD, 20));
		lblEmployyeForm.setBounds(122, 12, 207, 38);
		contentPane.add(lblEmployyeForm);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setFont(new Font("DejaVu Serif", Font.BOLD, 12));
		lblEmployeeName.setBounds(28, 71, 135, 15);
		contentPane.add(lblEmployeeName);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setFont(new Font("DejaVu Serif", Font.BOLD, 12));
		lblAdress.setBounds(28, 98, 70, 15);
		contentPane.add(lblAdress);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("DejaVu Serif", Font.BOLD, 12));
		lblPhone.setBounds(28, 125, 70, 15);
		contentPane.add(lblPhone);
		
		txtName = new JTextField();
		txtName.setBounds(164, 69, 228, 19);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAdress = new JTextField();
		txtAdress.setBounds(164, 96, 228, 19);
		contentPane.add(txtAdress);
		txtAdress.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(164, 123, 228, 19);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					PrintWriter pw = new PrintWriter(txtName.getText() + ".txt");
					pw.println("Employee Name: " + txtName.getText());
					pw.println("Adress: " + txtAdress.getText());
					pw.println("Phone: " + txtPhone.getText());
					pw.println("-------");
					pw.close();
					JOptionPane.showMessageDialog(null, "Informations Saved...");
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnSave.setBounds(28, 226, 117, 25);
		contentPane.add(btnSave);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(275, 226, 117, 25);
		contentPane.add(btnExit);
	}
}
