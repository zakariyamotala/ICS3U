/**
 * 
 */
package motala;

import java.util.Scanner;

/**ICS3U
 * CountVowels.java
 * A program that counts vowels when you write a sentence, or even a word
 * December 6,2016
 * @author Zakariya Motala
 *
 */
public class CountVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	

		int vowels=0;
		String text;

		System.out.println("Enter text: ");
		text=scan.nextLine();

		for (int i = 1; i < text.length(); i++){
			if   (text.charAt(i) == 'a') 
				vowels++;
			else if(text.charAt(i) == 'e') 
				vowels++;
			else if(text.charAt(i)=='i')
				vowels++;
			else if(text.charAt(i)=='o')
				vowels++;
			else if(text.charAt(i)=='u')      
				vowels++;
		}
		System.out.println("The number of vowels in java programming assignment is: " +vowels+".");


	}
}





















