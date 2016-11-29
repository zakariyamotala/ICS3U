/**
 * 
 */
package motala;

import java.util.Scanner;

/**ICS3U
 * RemoveString.java
 * If you write a sentence, it lets you eliminate any word you want
 * November 29,2016
 * @author Zakariya Motala
 */
public class RemoveString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		String word;
		String sentence;
		
		System.out.println("Enter a sentence: ");
		sentence= scan.nextLine();
		
		System.out.println("Enter a word");
		word=scan.nextLine();
		
		word.replace(word," ");
		
		System.out.println(sentence.replace(word," "));
		
		

	}

}
