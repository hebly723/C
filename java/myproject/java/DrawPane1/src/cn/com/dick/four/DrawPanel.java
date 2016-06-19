//Fig. 4.19:DrawPane1.java
//Draws two crossing lines on a Panel.
package cn.com.dick.four;
import java.awt.Graphics;
import javax.swing.JPanel;;

/**
 * @author 张钊晋
 * 
 * 2016年1月25日上午11:26:27
 */
public class DrawPanel extends JPanel {
//draws an X from the corners of the panel
	private int number;
	public DrawPanel(int number)
	{
		this.number = number;
	}
	public void paintComponent(Graphics g) {
		// call pointComponent to ensure the panel  displays correctly
		super.paintComponent(g);
		
		int width = getWidth();//total width
		int height = getHeight();//total height
		int pacex = width/(number);//x level pace
		int pacey = height/(number);//y level pace
		for (int i = 0; i <= number; i++) {
//			g.drawLine(0, 0, width-i*pacex, i*pacey);
//			g.drawLine(width, height, width-i*pacex, i*pacey);
//			g.drawLine(0, height, i*pacex, i*pacey);
//			g.drawLine(width, 0, i*pacex, i*pacey);
			g.drawLine(0, i*pacey, height-i*pacex, 0);
			g.drawLine(0, i*pacey, i*pacex, height);
			g.drawLine(width, i*pacey, i*pacex, 0);
			g.drawLine(width, i*pacey, width-i*pacex, height);
			
		}
		
//		//draw a line from the upper-left to the lower-right
//		g.drawLine(0, 0, width, height);
//		
//		//draw a line from the lower-left to the upper-right
//		g.drawLine(0, height, width, 0);

	}//end method paintComponent

}//end class DrawPanel
