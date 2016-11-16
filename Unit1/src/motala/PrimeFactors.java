/**
 * 
 */
package motala;

import java.util.Scanner;

/**PrimeFactors.java
 * Uses arithmetic to find the prime factors of a number
 * @author Zakariya
 *November 16, 2016
 */
public class PrimeFactors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		double num;
		System.out.println("Enter a number");
		num=scan.nextInt();
		
		int count =2;
		
		while(count<= num){
			if(num%count==0){
				System.out.println(count);
			}
		
		else{
			count = count +1;
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
