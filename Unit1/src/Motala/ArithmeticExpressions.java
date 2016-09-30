/**
 * 
 */
package Motala;

import java.util.Scanner;
/**
 * @author zakariya
 *
 */
public class ArithmeticExpressions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 int num1, num2, num3, num4, num5;
		

		 System.out.println("Enter 5 numbers");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
		 num3=scan.nextInt();
		 num4=scan.nextInt();
		 num5=scan.nextInt();
		 
		 System.out.println("The total is: " +(num1+num2+num3+num4+num5));
		 
		 System.out.println("The result after subtracting the second number from the third is:" +(num2-num3));
		 
		 System.out.println("The Product of the first and fifth number is:" +(num1 * num5));
		 
		 System.out.println("The quotient of the fourth number divided by the second:" +(num2/num4));
		 
		 System.out.println("The remainder when dividing the fourth number by the second:" +(num2 % num4));

		 System.out.println("The first number raised to the power of the third number is: " + Math.pow (num1,num3));
		 
		 System.out.println("The square root of the fisth number is: " + Math.sqrt(num5));
	
	}	
	
	
	

}
