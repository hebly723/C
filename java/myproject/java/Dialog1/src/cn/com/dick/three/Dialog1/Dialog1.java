//Fig. 3.17:Dialog1.java
//Printing multiple lines in dialog box
package cn.com.dick.three.Dialog1;
import javax.swing.JOptionPane;//import the class JOptionPane

public class Dialog1 {

	public static void main(String[] args) {
//		//display a dialog with the message
//		JOptionPane.showMessageDialog(null, "Welcome\nto\njava");
		//prompt user to enter name
		String name = 
				JOptionPane.showInputDialog("what is your name?");
		
		//create the message
		String message = 
				String.format("Welcome %s to Java programming", name);
		
		//display the message to welcome user by name
		JOptionPane.showMessageDialog(null, message);
		
		//prompt user to enter number
		int number1 = 
				Integer.parseInt(JOptionPane.showInputDialog("第一个数字"));
		int number2 = 
				Integer.parseInt(JOptionPane.showInputDialog("第二个数字"));
		
		//calculate the sum of numbers
		int sum = number1 + number2;
		
		//create the message2
		String message2 = 
				String.format("相加后的结果是%d", sum);
		
		//display the message2
		JOptionPane.showMessageDialog(null, message2);
		
		

	}//end main method

}//end class Dialog1
