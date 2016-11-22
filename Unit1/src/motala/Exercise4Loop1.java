/**
 * 
 */
package motala;

import java.util.Scanner;

/**ICS3U
 * @author zakariya motala
 *November 22,2016
 */
public class Exercise4Loop1 {

	/**This program is a dice game between the vomputer and a user, and you can play however many times you want because of the loop
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		int die1;
		int die2;
		int compdie1;
		int compdie2;
		int roll;
		int comptotal;
		String playagain;

		do{
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
			System.out.println("Do you want to play again? Enter yes or no");
			playagain = scan.nextLine();
		}while (playagain.equals ("yes"));

	}
}

