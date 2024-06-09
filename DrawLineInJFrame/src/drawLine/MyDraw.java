package drawLine;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyDraw {
	private JFrame form;
	private int wForm;
	private int hForm;
	
	public MyDraw(JFrame form) {
		this.form = form;
		wForm = form.getWidth();
		hForm = form.getHeight();
	}
	public int border = 1;
	public Color color = Color.BLACK;  //the default color is black "null value"
	
	public void DrawLine(int x1, int y1, int x2, int y2) {
		//@SuppressWarnings("serial")   // Anonymous
		JPanel pnl = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				g2.setStroke(new BasicStroke(border)); // to draw Fett border Line
				g2.setColor(color);
				g2.drawLine(x1, y1, x2, y2);
			}
		};
		form.add(pnl);
//		pnl.setBounds(x, y, width, height);
		pnl.setBounds(0, 0, wForm, hForm);
	}
	
	public void DrawRectangel(int x, int y, int width, int height) {
		//@SuppressWarnings("serial")
		JPanel pnl = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				g2.setColor(color);
				g2.setStroke(new BasicStroke(border)); // to draw Fett border Line
				g2.drawRect(x, y, width, height);
			}
		};
		form.add(pnl);
		pnl.setBounds(0, 0, wForm, hForm);
	}
	
	public void DrawOval(int x, int y, int width, int height) {
		//@SuppressWarnings("serial")
		JPanel pnl = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				g2.setColor(color);
				g2.setStroke(new BasicStroke(border)); // to draw Fett border Line
				g2.drawOval(x, y, width, height);
			}
		};
		form.add(pnl);
		pnl.setBounds(0, 0, wForm, hForm);	
	}
	public void drawPolygon(int[] xPoints,int[] yPoints, int nPoints) {
		//@SuppressWarnings("serial")
		JPanel pnl = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				g2.setColor(color);
				g2.setStroke(new BasicStroke(border)); // to draw Fett border Line
				g2.drawPolygon(xPoints, yPoints, nPoints);
			}
		};
		form.add(pnl);
		pnl.setBounds(0, 0, wForm, hForm);
	}
	public void drawPolyline(int[] xPoints,int[] yPoints, int nPoints) {
		//@SuppressWarnings("serial")
		JPanel pnl = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				g2.setColor(color);
				g2.setStroke(new BasicStroke(border)); // to draw Fett border Line
				g2.drawPolyline(xPoints, yPoints, nPoints);
			}
		};
		form.add(pnl);
		pnl.setBounds(0, 0, wForm, hForm);
	}
	
	public void drawString(int x, int y, String text, String fontName, int fontSize) {
		//@SuppressWarnings("serial")
		JPanel pnl = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				g2.setColor(color);
				Font font = new Font(fontName, Font.BOLD, fontSize);
				g2.setFont(font);
				g2.drawString(text, x, y);
			}
		};
		form.add(pnl);
		pnl.setBounds(0, 0, wForm, hForm);
	}
	public void drawImage(int x, int y, String path) {
		//@SuppressWarnings("serial")
		JPanel pnl = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				g2.setColor(color);
				try {
					File imgFile = new File(path);
					Image img = ImageIO.read(imgFile);
					g2.drawImage(img, x , y, form);
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
			}
		};
		form.add(pnl);
		pnl.setBounds(0, 0, wForm, hForm);
	}
	public void drawRoundRect(int x, int y, int width, int height, int borderRadius) {
		//@SuppressWarnings("serial")
		JPanel pnl = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				g2.setColor(color);
				g2.setStroke(new BasicStroke(border));
				g2.drawRoundRect(x, y, width, height, borderRadius, borderRadius);
			}
		};
		form.add(pnl);
		pnl.setBounds(0, 0, wForm, hForm);
	}
	
}
