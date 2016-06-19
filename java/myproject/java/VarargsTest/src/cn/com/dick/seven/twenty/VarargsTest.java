//Fig. 7.20:VarargsTest.java
//using variable length argument lists
package cn.com.dick.seven.twenty;
/**
 * @author ���Ƚ�
 * VarargsTest.java
 * 2016��2��5������8:26:20
 */
public class VarargsTest {
	
	//calculate average
	public static double average(double...numbers)
	{
		double total = 0.0;//initialize total
		
		//calculate total using the enhanced for statement
		for (double d : numbers) 
		{
			total += d;
		}
		
		return total/numbers.length;
	}//end method average

	public static void main(String[] args) 
	{
		double d1 = 10.0;
		double d2 = 20.0;
		double d3 = 30.0;
		double d4 = 40.0;
		
		System.out.printf("d1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n\n",
						  d1, d2, d3, d4);
		
		System.out.printf("Average of d1 and d2 is %.1f\n",
						  average( d1, d2));
		System.out.printf("Average of d1, d2 and d3 is %.1f\n",
						  average( d1, d2, d3));
		System.out.printf("Average of d1, d2, d3 and d4 is %.1f\n",
				  		  average( d1, d2, d3, d4));
		
	}//end main

}//end class VarargsTest