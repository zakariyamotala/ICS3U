
/**
 * 
 */
package motala;

import java.util.Scanner;
/**
 * @author zakariya
 *
 */
public class quadraticFormula {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		
		
		System.out.println("Enter number in the variables");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		System.out.println(-b + (Math.sqrt(Math.pow(b,2))+(-4*a*c/2*a)));
		System.out.println(-b -Math.sqrt(Math.pow(b,2))-4*a*c/2*a);
		
		
		
		
		
		
		
		
		
	}

}
