/**
 * 
 */
package motala;

import java.util.Scanner;

/**
 * @author zakariya
 *01/11/2016
 */

public class PositiveNegativeAndDivisibleBy7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int Number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		Number = sc.nextInt();
		
		if (Number >0)
			System.out.println("You have entered a positive number");
		
		else
			System.out.println("You have entered a negative number");
		
		if (Number %7==0)
			System.out.println("Your number is divisible by 7");
		else
			System.out.print("Your number is not divisible by 7");
		
		
	}

}
