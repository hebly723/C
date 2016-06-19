package cn.com.dick.seven.one;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class DrawArc extends JPanel
{
	final Color VIOLET = new Color(128, 0, 128);
	final Color INDIGO = new Color( 75, 0, 130);
	private Color colors[] = {VIOLET, INDIGO, Color.BLUE,Color.GREEN,
			  Color.YELLOW, Color.ORANGE, Color.RED};
	//private int arcsNext[] = {2, -2};
	//private int arcsCenter[] = {0, -2};
	
	//constructor
	public DrawArc()
	{
		setBackground(Color.GRAY);
	}
	
	//draws  circles using single line
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int radius = getWidth()/8;
		
		int xUse = 0;
		int angleUse = 1;
		
		int centerX = getWidth()/2;
		int centerY = getHeight()/2;
		
		for (int counter = 1; counter <= 9; counter++) 
		{
			g.setColor(colors[counter%7]);
			
			if (counter % 2 == 0)
				xUse += radius;
			
			g.drawArc(centerX - xUse, centerY - counter * radius/2,
					counter * radius, counter*radius,
					0, angleUse*180);
			
			angleUse = -angleUse;
			
		}
		
	}

}
