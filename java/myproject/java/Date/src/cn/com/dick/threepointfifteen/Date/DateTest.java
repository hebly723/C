//exam: 3.15
//show date
package cn.com.dick.threepointfifteen.Date;

import javax.swing.JOptionPane;

/**
 * @author ���Ƚ�
 * 
 * 2016��1��24������10:59:15
 */
public class DateTest {
	//method begins execution of Java application
	public static void main(String args[])
	{
		//prompt user to enter date
		int date = 
				Integer.
				parseInt(JOptionPane.showInputDialog("����"));
		int month = 
				Integer.
				parseInt(JOptionPane.showInputDialog("�·�"));
		int year = 
				Integer.
				parseInt(JOptionPane.showInputDialog("���"));
			
		//create Date object
		Date myDate = new Date(year, month, date);
		
		//display message
		myDate.displayDate();
		
	}

}
