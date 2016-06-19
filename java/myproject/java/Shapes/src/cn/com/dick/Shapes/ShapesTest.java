//Fig 5.27:ShapesTest.java
//Test application that displays class Shapes
package cn.com.dick.Shapes;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author ���Ƚ�
 * 
 * 2016��1��26������5:38:13
 */
public class ShapesTest {

	public static void main(String[] args) {
		
		//obtain user's choice
		String input = JOptionPane.showInputDialog(
				"Enter 1 to draw rectangles\n" + 
				"Enter 2 to draw ovals\n" + 
				"Enter 3 to draw ovals with the same center");
		int inputWidth = Integer.
				parseInt(JOptionPane.showInputDialog("Input width"));
		int inputHeight = Integer.
				parseInt(JOptionPane.showInputDialog("Input height"));
		
		int choice = Integer.parseInt(input);//convert input to integer
		
		//create panel with the user's input
		Shapes panel = new Shapes(choice, inputWidth, inputHeight);
		
		JFrame application = new JFrame();//creates a new JFrame
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);//add the panel to the frame
		application.setSize(300, 300);//set the desire size
		application.setVisible(true);//show the frame
		
	}//end main

}//end class ShapesTest
