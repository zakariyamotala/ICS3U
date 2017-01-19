/**
 * 
 */
package motala;

import java.util.Scanner;

/**ICS3U
 * FunWithMath.java
 * @author Zakariya Motala
 *January 17, 2017
 *This program gets 2 numbers from the user, then adds, subtracts, multiplies, or divides the numbers.(Whatever the user wants to do)
 */
public class FunWithMath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter two numbers: ");
		double	num1=scan.nextDouble();
		double num2=scan.nextDouble();
		double option;
		
		System.out.println("If you want to add these 2 numbers type 1");
		System.out.println("If you want to subtract these 2 numbers type 2");
		System.out.println("If you want to multiply these 2 numbers type 3");	
		System.out.println("If you want to divide these 2 numbers type 4");
		option=scan.nextDouble();
		
		if (option== 1){
			System.out.println(num1+num2);
		}
		else if (option== 2){
			System.out.println(num1-num2);
		}
		else if (option== 3){
			System.out.println(num1*num2);
		}
		else if (option== 4){
			System.out.println(num1/num2);
		}
	}
/**
 * adds the 2 numbers
 */
	public static void Add(double num1,double num2){
	double total=(num1+num2);
	}
	
	/**
	 * subtracts the 2 numbers
	 */
	public static void Subtract(double num1,double num2){
		double total=(num1-num2);
		}
	
	/**
	 * multiplies the 2 numbers
	 */
	public static void Multiply(double num1,double num2){
		double total=(num1*num2);
		}

	/**
	 * Divides the 2 numbers
	 */
	public static void Divide(double num1,double num2){
		double total=(num1/num2);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}





