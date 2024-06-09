package drawLine;
import java.awt.Color;
import java.awt.EventQueue;

public class MyDrawLine {

	public static void main(String[] args) {
		
		/**
		 * Launch the application.
		 */
		
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Frm f = new Frm();
						MyDraw d = new MyDraw(f);
						d.border = 5;   // to draw Fett border Line
						d.color = Color.orange;
						
//						d.DrawLine(10, 30, 150, 30);
//						d.DrawLine(10, 30, 250, 50);
//						d.DrawRectangel(20, 50, 150, 50);
//						d.DrawRectangel(20, 50, 150, 150);
//						d.DrawOval(10, 20, 150, 150);
//						d.DrawOval(10, 20, 90, 150);
						
//						int x[]= {100, 170, 250};
//						int y[]= {200, 130, 300};
//						d.drawPolygon(x, y, 3);
						
//						int x[]= {10, 300, 300};
//						int y[]= {30, 30, 200};
//    					d.drawPolygon(x, y, 3);
    					
//    					int x1[]= {10, 10, 300};
//						int y1[]= {30, 200, 200};
//    					d.drawPolygon(x1, y1, 3);
						
//						int x[]= {100, 170, 170, 280, 280, 170, 170};
//						int y[]= {135, 80, 100, 100, 170, 170, 190};
//						d.drawPolygon(x, y, 7);
						
//						d.drawString(120, 60, "Ahmad", "Tahoma", 60);
//						d.drawString(120, 150, "Welcom", "Arial", 40);
						
//						d.drawImage(30, 50, "img1.png");
//						d.drawImage(30, 50, "img2.png");
	
//						d.drawRoundRect(50, 70, 150, 90, 0);
//						d.drawRoundRect(50, 70, 150, 90, 40);
						
						f.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	

}
