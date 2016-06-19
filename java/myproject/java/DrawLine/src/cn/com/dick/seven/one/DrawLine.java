package cn.com.dick.seven.one;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawLine extends JPanel
{
	//line changes use in the window, starting from the center
	final Color VIOLET = new Color(128, 0, 128);
	final Color INDIGO = new Color( 75, 0, 130);
	
	private int lines[][]  = { {0, 1}, { -1, 0}, {0, -1}, { 1, 0}};
	private Color colors[] = {VIOLET, INDIGO, Color.BLUE,Color.GREEN,
							  Color.YELLOW, Color.ORANGE, Color.RED};
	
	//constructor
	public DrawLine()
	{
		setBackground(Color.WHITE);
	}
	
	//draws a line using single line
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int equalLength = (getWidth()/2-30)/3;
		
		int beginLength = 0;
		
		int onX = getWidth()/2;
		int onY = getHeight()/2;
		int nextX = getWidth()/2;
		int nextY = getHeight()/2;
		
		//g.drawArc(0, 0, 100, 100, -0, -180);
		
		for (int counter = 0; counter < 13; counter++) 
		{
			g.setColor(colors[counter%7]);
			if (counter%2==0)
				beginLength += equalLength;
			
			nextX = onX+lines[counter%4][0] * beginLength;
			nextY = onY+lines[counter%4][1] * beginLength;
			
			g.drawLine(onX, onY, nextX,nextY);
			
			onX = nextX;
			onY = nextY;
			
		}
	}

}