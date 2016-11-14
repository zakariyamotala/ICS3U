/**
 * 
 */
package motala;

import java.util.Scanner;

/**
 * @author 323397539
 *
 */
public class RandomGenerator {
	/**an application that implements the linear congruental method
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		int x0=12;
		int a=1246;
		int c=200;
		int m=50;
		
		int x1;
		int x2;		
		int x3;
		int x4;
		int x5;
		int x6;
		int x7;
		int x8;
		int x9;
		int x10;
		
		x1=(a*x0+c)%m;
		x2=(a*x1+c)%m;
		x3=(a*x2+c)%m;
		x4=(a*x3+c)%m;
		x5=(a*x4+c)%m;
		x6=(a*x5+c)%m;
		x7=(a*x6+c)%m;
		x8=(a*x7+c)%m;
		x9=(a*x8+c)%m;
		x10=(a*x9+c)%m;
		
	System.out.println(x1);	
	System.out.println(x2);	
	System.out.println(x3);	
	System.out.println(x4);	
	System.out.println(x5);	
	System.out.println(x6);	
	System.out.println(x7);	
	System.out.println(x8);	
	System.out.println(x9);	
	System.out.println(x10);	
		
		
		

	}

}
