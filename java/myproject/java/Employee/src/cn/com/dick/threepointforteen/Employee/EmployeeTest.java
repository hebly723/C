//exam 3.14
//create an employee information project
package cn.com.dick.threepointforteen.Employee;
import javax.swing.JOptionPane;
public class EmployeeTest {
	//main method begins execution of Java application
	public static void main(String args[])
	{
		//prompt user to enter information
		String name = 
				JOptionPane.
				showInputDialog("输入名");//name input by user
		String surName = 
				JOptionPane.showInputDialog("输入姓");//surname input by user
		double salary = 
				Double.parseDouble(JOptionPane.
						showInputDialog("输入月薪"));//salary input by user
		
		//create Employee object
		Employee employee1 = new Employee(name, surName, salary);
		
		//prompt user to enter information
		name = 
				JOptionPane.
				showInputDialog("输入名");//name input by user
		surName = 
				JOptionPane.showInputDialog("输入姓");//surname input by user
		salary = 
				Double.parseDouble(JOptionPane.
						showInputDialog("输入月薪"));//salary input by user
				
		//create Employee object
		Employee employee2 = new Employee(name, surName, salary);
		
		//create message
		String Message1 = 
				String.format("%s%s的年薪是%.2f", employee1.getSurname(),
						employee1.getName(), employee1.getSalary()*12);
		String Message2 = 
				String.format("%s%s的年薪是%.2f", employee2.getSurname(),
						employee2.getName(), employee2.getSalary()*12);
		
		//display message
		JOptionPane.showMessageDialog(null, Message1+"\n"+Message2);
		
	}

}
