//Fig. 6.7:RandomIntergers.java
//Shifted and scaled random integers
package cn.com.dick.fig.sixpointseven;
import java.util.Random;//program uses class random

/**
 * @author 张钊晋
 * RandomIntergers
 * 2016年1月31日下午9:21:32
 */
public class RandomIntergers {

	public static void main(String[] args) {
		Random RandomNumber = new Random();//random number generator
		int face;//stores each random number generated
		
		//loop 20 times
		for (int counter = 1; counter <= 20; counter++) 
		{
			//pick random integer from 1 to 6
			face = 1 + RandomNumber.nextInt(6);
			
			System.out.printf("%d\t",face);//display generated value
			
			//if counter is divisible by 5, start a new line of output
			if (counter%5==0)
				System.out.println();
			
		}//end for

	}//end main

}//end class randomIntegers
