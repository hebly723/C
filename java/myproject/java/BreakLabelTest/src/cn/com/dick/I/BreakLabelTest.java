//Fig. K. 1:BreakLabelTest.java
//Labeled break statement exiting a nested for statement
package cn.com.dick.I;

/**
 * @author ���Ƚ�
 * BreakLabelTest.java
 * 2016��2��3������8:36:23
 */
public class BreakLabelTest {
	private final static int FIRSTBOUND = 5,
							 SECONDBOUND = 10;

	public static void main(String[] args) {
		
		stop://label block
		{
			//count 10 rows
			for (int row = 1; row <= SECONDBOUND; row++) 
			{
				//column BOUND columns
				for (int column = 1; column <= FIRSTBOUND; column++) 
				{
					if (row==5)//if row is 5
						break stop;
					System.out.print("* ");
					
				}//end inner for
				
				System.out.println();//outputs a newline
			}//end outer for
			
			//following line is skipped
			System.out.println("Loops terminated normally");
		}//end labeled block

	}//end main

}//end class BreakLabelTest
