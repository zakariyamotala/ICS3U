/**
 * 
 */
package motala;

import java.util.Scanner;

/**ICS3U
 * GroupAssignment.java
 * 
 * December 7th,2016
 * @author Zakariya Motala
 *
 */
public class GroupAssignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		String firstName;
		String lastName;
		String group1="a,b,c,d,e,f,g,h,i";
		String group2="j,k,l,m,n,o,p,q,r,s";
		String group3="t,u,v,w,x,y,z";


		System.out.println("Enter your first name:");
		firstName=scan.nextLine();

		System.out.println("Enter your last name:");
		lastName=scan.nextLine();

		if (lastName.startsWith(group1)){
			System.out.println(firstName +lastName +"is assigned to group 1");
		}
			else if (lastName.startsWith(group2)){
				System.out.println(firstName +lastName +"is assigned to group 2");	
			}
			else if (lastName.startsWith(group3)){
				System.out.println(firstName +lastName +"is assigned to group 3");	
			}
		}





	}
