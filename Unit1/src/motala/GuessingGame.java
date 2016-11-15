/**
 * 
 */
package motala;

import java.util.Scanner;

/**ICS3U
 * @author zakariya
 *November 15,2016
 */
public class GuessingGame {

	/**If users number is greater than computers number then user wins, if not then user loses
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		

		int usernum;
		int compnum;
		
		
		System.out.println("Enter a number between 1 and 20: ");
		usernum = scan.nextInt();
		
		if (usernum>0 || usernum<20){
			
		compnum=(int)(Math.random()*20)+1;
		System.out.println("Computers number: "+ compnum);		
		
		System.out.println("Player's number: " + usernum);
	
		if (compnum>usernum){
			System.out.println("Better luck next time =(");
		}
		
		else 
			System.out.println("You won!!!");
		}
		
		

	}

}
