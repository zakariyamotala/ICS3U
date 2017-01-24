/**
 * 
 */
package motala;

import java.util.Scanner;

/**
 * @author 323397539
 *
 */
public class Investment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.exit(0);
		
		int investment = 2500;
		int wInvest = 5000;
		
		double cInvest = investment;
		double years = 1;
		
		while (cInvest <= investment){
			years = years +1;
			cInvest = cInvest * 1.075;
		}
		
		System.out.println("It will take: " + years + " years, if compounded annualy at 7.5%");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
