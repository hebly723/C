//Fig. 7. 2:InitArray.java
//Creating an array
package cn.com.dick.seven.two;

public class InitArray {
//	private final static int BOUND = 10;

	public static void main(String[] args) {
//		int array[];//declare array named array
//		
//		array = new int[BOUND];//create the space for array
		
		//initializer list specifies the value for each element
//		int array[] = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
//		
//		System.out.printf("%s%8s\n", "Index", "Value");//column headings
//		
//		//output each array element's value
//		for (int counter = 0; counter < array.length; counter++) 
//			System.out.printf("%5d%8d\n", counter, array[counter]);

//		final int ARRAY_LENGTH = 10;//declare constant
//		int array[] = new int[ARRAY_LENGTH];//create array
//		
//		//calculate value for each array element
//		for (int counter = 0; counter < array.length; counter++) {
//			array[counter] = 2 + 2*counter;
//		}
//		
//		System.out.printf("%s%8s\n", "Index", "Value");//column headings
//		
//		for (int counter = 0; counter < array.length; counter++) 
//		System.out.printf("%5d%8d\n", counter, array[counter]);
		
//		//7.3 a)
//		final int ARRAY_SIZE = 10;
//		//7.3 b)
//		double fractions[] = new double[ARRAY_SIZE];
//		for (int i = 0; i < fractions.length; i++) {
//			fractions[i] = 0;
//		}
//		//7.3 c)
//		System.out.printf("the forth element of initArray: %f", fractions[3]);
//		//7.4 d)
//		System.out.printf("\nthe four element of initArray: %f", fractions[4]);
//		//7.4 e)
//		fractions[9] = 1.667;
//		//7.4 f)
//		fractions[7] = 3.333;
//		//7.4 g)
//		double sum = 0;
//		for (double x : fractions) {
//			sum += x;
//		}
//		
//		System.out.printf("\nValue of sum: %f", sum);
		//7.4 a)
		final int ARRAY_SIZE = 3;
		int table[][] = new int[ARRAY_SIZE][ARRAY_SIZE];
		//7.4 c)
//		Assume int b[] = new int[10];
		for (int i = 0; i < table.length; i++) {
			int[] js = table[i];
			for (int j = 0; j < js.length; j++) {
				js[j] = i + j;
				System.out.printf("%d\t", table[i][j]);
			}
			
			System.out.println();
			
		}
		
		//int table[] = new int[]
		
	}
	
	

}
