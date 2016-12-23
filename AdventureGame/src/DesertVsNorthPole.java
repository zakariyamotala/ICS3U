
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import hsa_new.Console;
/**
 * 
 */

/**ICS3U
 * This program is an adventure game created by 2 geniuses, you can either explore a hot desert or explore the north pole.
 * @author Zakariya Motala and Alban Raka
 *December 23,2016
 *alban:Desert, zakariya: North pole
 */
public class DesertVsNorthPole {

	private static Throwable e;

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Console c = new Console();
		String answer= null;
		double percent= (int)(Math.random()*100)+1;
		String q;
		String option = null;
		double percent1 = 0;
		

		BufferedImage[]picture = new BufferedImage[9];
		try {


			picture[0] = ImageIO.read(new File("desert.jpg"));
			picture[1] = ImageIO.read(new File("snake.jpg"));
			picture[2] = ImageIO.read(new File("house.JPG"));
			picture[3] = ImageIO.read(new File("mental.jpg"));
			picture[4] = ImageIO.read(new File("1.jpg"));
			picture[5] = ImageIO.read(new File("arctic landscape.jpg"));
			picture[6] = ImageIO.read(new File("polar101.jpg"));
			picture[7] = ImageIO.read(new File("dead.jpg"));
			picture[8] = ImageIO.read(new File("santa.jpg"));
			
			
			c.println("Would you like to play?");
			q=c.readLine();

			do {
				c.println("You are stuck between the desert and north pole, which path do you choose to go?(Desert/NorthPole)");
				option = c.readLine();
				if (option.equalsIgnoreCase("Desert")){
					c.drawImage(picture[0], 0, 0, null);
					Thread.sleep(2000);
					c.clear();
					//	choose which direction you want to go in 
					c.println("You stumble upon a snake, do you run or fight? run/fight ");
					answer = c.readLine();
					c.drawImage(picture[1], 0, 160, null);
					Thread.sleep(2000);
					c.clear();
//					choose if you want to fight the snake or run away from it
					if (answer.equalsIgnoreCase ("Fight")){
						c.println("The snake bites you and you die from poison");
						c.println("Would you like to play again?");
						q=c.readLine();
						//if you fight the snake, the snake will bite giving you poison and you die, then you have an option to play again.
					}else{
						c.println("You run and find a pool of water, do you drink it? (yes/no)");
						answer = c.readLine();
						c.drawImage(picture[4], 0, 160, null);
						Thread.sleep(2000);
						c.clear();
//						Instead of fighting the snake and you run, you come across a pool of water, do you drink it?
						if (answer.equalsIgnoreCase ("Yes")){
							c.println();
							if(percent1<30){
								c.println("The water is clean you win!");
								c.println("Would you like to play again?");
								q=c.readLine();
								//if you drink it, there is a chance that the water will be clean, and you if it is clean, then you win.
							}			
							else if(percent1>30){
								c.println("The water is contaminated you die");
								c.println("Would you like to play again?");
								q=c.readLine();
//								There is also a chance the water is contaminated, in which case you die and you have the option to play again								
							}
						}else if(answer.equalsIgnoreCase ("No")){  
							c.println("Do you continue walking or try and find shelter?(continue walking/find shelter)");
							answer = c.readLine();
//							If you dont drink the water, you can either find continue walking or find shelter

							if (answer.equalsIgnoreCase ("Continue walking")){
								c.println("You come across an old house with a crazy man inside, do you go inside or keep moving?(go inside/keep moving)");
								answer = c.readLine();
//								If you continue walking, you find an old house with a crazy old man inside, you have the option of going inside the house or you could leave the the crazy guy alone and keep moving 							
								 if (answer.equalsIgnoreCase ("Go inside")){
									c.println("You get in an altercation with the man, do you fight or tell him your lost?(fight/tell him your lost)");
									answer = c.readLine();

									if (answer.equalsIgnoreCase ("Fight")){
										c.println("The man has a shotgun and kills you");
										c.drawImage(picture[3], 0, 250, null);
										Thread.sleep(2000);
										c.clear();
										c.println("Would you like to play again?");
										answer = c.readLine();
										q=c.readLine();
									}
									else if (answer.equalsIgnoreCase ("Tell him your lost")){
										c.println("You win! the man gives you a phone to call for safety");
										answer = c.readLine();
										c.println("Would you like to play again?");
										q=c.readLine();

									}
								}
							}else if (answer.equalsIgnoreCase ("Find shelter")){ 
								c.println("You find an ancient cave, do you keep moving or sleep in the cave?(keep moving/sleep in the cave)");
								answer = c.readLine();

								if (answer.equalsIgnoreCase ("Keep moving")){
									c.println("You die of dehydration!");
									answer = c.readLine();
									c.println("Would you like to play again?");
									q=c.readLine();

								}else if (answer.equalsIgnoreCase ("Sleep in the cave")){
									c.println("The cave carrys ancient powers and you become superhuman, you win!");

								}
							}

						}
					}
				}else if(option.equalsIgnoreCase("north pole")) {


					c.drawImage((Image) picture[5],0,0,null);
					Thread.sleep(2000);
					c.clear();
					c.println("on your journey, you find a polar bear, do you 'fight it'? or 'run'?");
					option = c.readLine();
//					Since you chose north pole, you walk and suddenly you see a polar bear, you either fight it or you can run from it
					c.drawImage((Image) picture[6],0,0,null);
					Thread.sleep(2000);
					c.clear();
					if (option.equalsIgnoreCase("fight it")) {
						c.println("You killed him, now do you 'keep moving'? or 'climb a tree'?");
						String option1 = c.readLine();
						// if you fight it, you killed him, now do you keep moving or climb a tree
						if (option1.equalsIgnoreCase("keep moving")) {
							c.println("you died of starvation and fatigueness");
							c.drawImage(picture[7], 0, 250, null);
							Thread.sleep(2000);
							c.clear();
//							if you kept moving you died because you had no food, or water and you were tired because of walking in all of that heavy snow.
						} else {// climb a tree
							double percent11;
							do {
								percent11 = Math.random();
								if (percent11 >= 0.5) {
									c.println(
											"You make it to the top of the tree and get service. Helicopter saves you!-----YOU WIN!!");

								} else {
									c.println("You fell while climbing the tree.");
									c.println("try again");
//									if you fall while climbing the tree, you just keep trying until you make it to the top and then you get service and call for help---helicopter saves you. 
								}
							} while (percent11 < 0.5);

						}
					} else if (option.equalsIgnoreCase("run")) {

						do {
							percent=Math.random();
							c.println("The ice breaks under your feet and you fall into the water.");
							c.println("Now you have to look for a hole through the ice.");
//							if you run from the polar bear, you fall into the water because the ice breaks under your feet
							if (percent >= 0.5) {
								c.println("You found the hole through the ice,climbed out, and santa saves you congratzzz YOU WIN!!!Go enjoy life now!");
								c.drawImage(picture[8], 0, 250, null);
								Thread.sleep(10000);
								c.clear();
								//Now you have to quickly find a whole above your head to escape, and if you do, santa will save you
							} else if (percent < 0.5) {
								c.println("You did not find the hole and a shark eats you. Try again\n");
								//								if you dont find the hole, a shark will eat you, but you could keep trying until you win because parts of this game is designed for baby's. So you will win eventually =)
							}
						} while (percent < 0.5);
					}



					


					c.println("Would you like to play again?");
					// At the end of the game, you could play again and maybe this time pick the side you never chose the other time.
					q=c.readLine();
				}}while(q.equals("yes"));
		} catch (Exception e) {
			e.printStackTrace();

		}





	}





}