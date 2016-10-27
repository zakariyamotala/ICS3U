/**
 * 
 */
package motala;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * ICS3U
 * @author zakariya
 *Order Application
 *
 *
 */
public class Order {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df= new DecimalFormat ("0.00");
		double burgerPrice=1.69;
		double friesPrice=1.09;
		double sodaPrice=0.99;
		double amounttendered;
		double change;
		double finaltotal;
		double b, f, s; 
		double tax=0.065;
	
		
		System.out.println("Enter the number of Burgers: ");
		b=scan.nextInt();
		System.out.println("Enter the number of Fries you want: ");
		f=scan.nextInt();
		System.out.println("Enter the number of Sodas you want: ");
		s=scan.nextInt();
		
		System.out.println("The total before tax is:" + (df.format(burgerPrice*b + friesPrice*f + sodaPrice*s)));
	
		System.out.println("Tax: " +(df.format ((burgerPrice*b + friesPrice*f + sodaPrice*s)*0.065)));
		
		System.out.println("Final total: " +(df.format(burgerPrice*b + friesPrice*f + sodaPrice*s)+((burgerPrice*b + friesPrice*f + sodaPrice*s)*0.065)));
		
		finaltotal=(burgerPrice*b + friesPrice*f + sodaPrice*s) + (burgerPrice*b + friesPrice*f + sodaPrice*s*(0.065));

		System.out.println("Enter amount tendered");

		amounttendered = scan.nextInt();

		System.out.println("change $" + (df.format(amounttendered - finaltotal)));
		
		
		
		
		
scan.close();
	}

}
