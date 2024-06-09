package encapsulationEx;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmEmp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8241372846529008570L;
	private JPanel contentPane;
	private JTextField txtNum;
	private JTextField txtName;
	private JTextField txtAdress;
	

	/**
	 * Create the frame.
	 */
	public FrmEmp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeName = new JLabel("Employee Number");
		lblEmployeeName.setBounds(33, 35, 127, 15);
		contentPane.add(lblEmployeeName);
		
		JLabel lblEmployeeName_1 = new JLabel("Employee Name");
		lblEmployeeName_1.setBounds(33, 68, 112, 15);
		contentPane.add(lblEmployeeName_1);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setBounds(33, 97, 49, 15);
		contentPane.add(lblAdress);
		
		txtNum = new JTextField();
		txtNum.setBounds(172, 33, 246, 19);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(172, 66, 246, 19);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAdress = new JTextField();
		txtAdress.setBounds(172, 95, 246, 19);
		contentPane.add(txtAdress);
		txtAdress.setColumns(10);
		
		Emp emp = new Emp();
		
		JButton btnSet = new JButton("set");
		btnSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emp.setEmpNo(Integer.parseInt(txtNum.getText()));
				emp.setEmpName(txtName.getText());
				emp.setAdress(txtAdress.getText());
			}
		});
		btnSet.setBounds(90, 141, 117, 25);
		contentPane.add(btnSet);
		
		JButton btnGet = new JButton("get");
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strMsg = String.valueOf(emp.getEmpNo());
				strMsg += "\n" + emp.getEmpName();
				strMsg += "\n" + emp.getAdress();
				JOptionPane.showMessageDialog(null, strMsg);
			}
		});
		btnGet.setBounds(269, 141, 117, 25);
		contentPane.add(btnGet);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnExit.setBounds(321, 226, 117, 25);
		contentPane.add(btnExit);
	}
}
