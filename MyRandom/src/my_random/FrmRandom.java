package my_random;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//@SuppressWarnings("serial")
public class FrmRandom extends JFrame {

	private JPanel btnRandom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmRandom frame = new FrmRandom();
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
	public FrmRandom() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		btnRandom = new JPanel();
		btnRandom.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(btnRandom);
		btnRandom.setLayout(null);
		
		JLabel lblGeneratRandom = new JLabel("Generate random");
		lblGeneratRandom.setFont(new Font("DejaVu Serif", Font.BOLD, 20));
		lblGeneratRandom.setBounds(104, 0, 229, 34);
		btnRandom.add(lblGeneratRandom);
		
		JButton btnGeneratRandomNumber = new JButton("Generate random Number");
		btnGeneratRandomNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int s = 90;
				int i = 10;   //Increment   from 90 to 99 (90 + 10 = 99)
				int r = s + (int) (Math.random() *i);  //Typ Casting to Int
				JOptionPane.showMessageDialog(null, r);
			}
		});
		btnGeneratRandomNumber.setBounds(90, 135, 229, 25);
		btnRandom.add(btnGeneratRandomNumber);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(321, 226, 117, 25);
		btnRandom.add(btnExit);
	}
}
