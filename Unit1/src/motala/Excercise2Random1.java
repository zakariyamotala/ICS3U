/**
 * 
 */
package motala;

import java.util.Scanner;

/**ICS3U
 * @author zakariya motala
 *November 11, 2016
 */
public class Excercise2Random1 {

	/** a program that asks for a person's name, and then 70% of the time it says that the name they typed is thier favourite, and 30% of the time it says they hate that name.
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		double percent;
		String name;
		
		System.out.println("Enter a persons name: ");
		name= scan.nextLine();
		
		percent=(Math.random()*100)+1;
		
		if(percent>=0.7){
			System.out.println(name+" must be your favourite name!");
		}
		
		else 
			System.out.println(name+" is not your faourite name");
		}
		
		
		
		
		
		
		
		
		
		
		
	}


