package cn.com.dick.square;
import javax.swing.JOptionPane;
//import java.util.Scanner;
public class SquareTest {

	public static void main(String[] args) {
		double radius;//radius user input
		
		//create scanner to obtain input from command window
		//Scanner input = new Scanner(System.in);
		
		//System.out.print("input radius:");//prompt for input
		//radius = input.nextDouble();//input
		
		Square square = new Square();
		
		square.determineVolume();
		
		//radius =  Double.parseDouble(JOptionPane.showInputDialog("����뾶"));
		
		//JOptionPane.showMessageDialog(null, "volume = " + radius);
//		System.out.printf("volume = %f", Square.sphereVolume(radius));
		
	}

}
