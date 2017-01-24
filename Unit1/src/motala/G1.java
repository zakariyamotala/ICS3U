/**
 * 
 */
package motala;

import java.util.Scanner;

import java.awt.Image;
import hsa_new.Console;

/**ICS3U
 * G1.java
 * @author Zakariya Motala
 *January 18,2017
 *This program lets you practise for your g1 drivers test
 */
public class G1 {

	/**
	 * @param args
	 */
	public static void main(String[] args){ 
		
		Console c = new Console();


		String[][] questions = new String[5][10];


		questions[0][0]="What does this road sign mean?";
		questions[0][1]="What does this road sign mean?";
		questions[0][2]="What does this road sign mean?";
		questions[0][3]="What does this road sign mean?";
		questions[0][4]="What does this road sign mean?";
		questions[0][5]="What does this road sign mean?";
		questions[0][6]="What does this road sign mean?";
		questions[0][7]="What does this road sign mean?";
		questions[0][8]="What does this road sign mean?";
		questions[0][9]="What does this road sign mean?";

		questions[1][0]=("a)	'No pedestrians allowed' ");
		questions[2][0]=("b)	'No children allowed");
		questions[3][0]=("c)	'Dogs only'");
		questions[4][0]=("d)	'No bicycles'");

		questions[1][1]=("a)	Zoo ahead");
		questions[2][1]=("b)	Deer regularly crossing, be alert for animals");
		questions[3][1]=("c)	No honking at animals	");
		questions[4][1]=("d)	Deer are welcome	");

		questions[1][2]=("a)	I am turning right	");
		questions[2][2]=("b)	I am turning left	");
		questions[3][2]=("c)	I am slowing down	");
		questions[4][2]=("d)	I am stopping	");

		questions[1][3]=("a)	I am turning right	");
		questions[2][3]=("b)	I am turning left	");
		questions[3][3]=("c)	I am turning  slowing or stopping	");
		questions[4][3]=("d)	I am leaving my car	");

		questions[1][4]=("a)	Drivers on the sideroad at the intersection ahead don’t don’t have a clear view of traffic ");
		questions[2][4]=("b)	Hidden detour on right	");
		questions[3][4]=("c)	Dead end road on right	");
		questions[4][4]=("d)	Police station on right ");


		questions[1][5]=("a)	Minimum speed 50 km/h ");
		questions[2][5]=("b)	Maximum safe speed on ramp is 50 km/hr	");
		questions[3][5]=("c)	Next rest speed in 50 km	");
		questions[4][5]=("d)	No stopping for next 50 km ");

		questions[1][6]=("a)	Hazard close to the edge of the road. Downward line indicate side to pass hazard on	 ");
		questions[2][6]=("b)	Single lane ahead ");
		questions[3][6]=("c)	Roadway ending, detour route to be indicated ");
		questions[4][6]=("d)	Crossing up ahead, proceed with caution  ");

		questions[1][7]=("a)	Do Do not slow down	 ");
		questions[2][7]=("b)	not block intersection ");
		questions[3][7]=("c)	Watch for pedestrians");
		questions[4][7]=("d)	Watch for traffic signals ");

		questions[1][8]=("a)	I am turning right  ");
		questions[2][8]=("b)	I am turning left ");
		questions[3][8]=("c)	I am slowing down");
		questions[4][8]=("d)	I am stopping ");


		questions[1][9]=("a)	Public transit terminal up ahead ");
		questions[2][9]=("b)	Pedestrians crossing up ahead ");
		questions[3][9]=("c)	Kids playing ahead ");
		questions[4][9]=("d)	Slow down school zone ahead, watch for children and drive with extra caution");






		Image []pics = new Image[10];

		void display Question (int quesNum,Image []pics,String[][]questions){

			c.drawImage(pics[0]);
			c.print(questions[0][quesNum]);
			c.print(questions[1][0]);



			c.print(questions[1][quesNum]);
			c.print(questions[2][quesNum]);
			c.print(questions[3][quesNum]);
			c.print(questions[4][quesNum]);
			c.print(questions[5][quesNum]);
			c.print(questions[6][quesNum]);
			c.print(questions[7][quesNum]);
			c.print(questions[8][quesNum]);
			c.print(questions[9][quesNum]);



		}




		
		
		
		
		
		
		
		
	}

}
