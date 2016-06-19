//Fig. 5.26:Shapes.java
//Demonstrates drawing different shapes 

package cn.com.dick.Shapes;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * @author 张钊晋
 * 
 * 2016年1月26日下午5:19:20
 */
public class Shapes extends JPanel {
	private int choice;//user's choice of which shape to draw
	private int graphWidth;
	private int graphHeight;
	
	//constructor sets the user's choice
	public Shapes(int userChoice, int graphWidth, int graphHeight)
	{
		choice = userChoice;
		this.graphWidth = graphWidth;
		this.graphHeight = graphHeight;
	}//end Shapes constructor
	
	//draws a cascade of shapes starting from the top left corner
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		for (int i = 0; i < 10; i++) 
		{
			//pick the shape based on the user's choice
			switch (choice) {
			case 1://draw rectangles
				g.drawRect(10+i*10, 10+i*10,
						graphWidth+i*10, graphHeight+i*10);
				break;
			case 2://draw ovals
				g.drawOval(10+i*10, 10+i*10,
						graphWidth+i*10, graphHeight+i*10);
				break;
			case 3://draw ovals with the same center
				g.drawOval(10+i*10, 10+i*10,
						width - 2*(graphWidth+i*10),
						height - 2*(graphHeight+i*10));

			default:
				break;
			}//end switch
		}//end for
	}//end method paintComponent

}//end class Shapes
