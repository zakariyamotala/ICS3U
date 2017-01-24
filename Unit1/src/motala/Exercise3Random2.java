/**
 * 
 */
package motala;

import java.util.Scanner;

/**ICS3U
 * @author Zakariya Motala
 *November 11, 2016
 */
public class Exercise3Random2 {

	/** a program that simulates rolling two dice twice, first for the user, and then for the computer.Then announce who won: the user, the computer, or say it was a tie.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int die1;
		int die2;
		int compdie1;
		int compdie2;
		int roll;
		int comptotal;
		

		die1=(int)(Math.random() *6) +1;
		die2=(int)(Math.random() *6) +7;
		roll=die1+die2;

		compdie1=(int)(Math.random() *6) +1;
		compdie2=(int)(Math.random() *6) +7;
		comptotal=compdie1+compdie2;
		
		
		if(comptotal<roll){
			System.out.println("You win!");
		}

		else if(roll<comptotal){
			System.out.println("You lose =(");
		}
		else if(roll==comptotal){
				System.out.println("Its a draw");
		}
		
		
		

	}

}
