import java.util.Scanner;
public class RoadTestQuestions {
	
	
	
	public static int questions(int counter, Scanner sc) {
		System.out.println("Who do you call if you hit a deer?\nA:Call your insurance\nB:Call the police\nC:Call the GhostBusters");
		String answer1 = sc.next();
		if (!answer1.equalsIgnoreCase("B")) {
			counter -=1;
		}
		System.out.println("True or False: You can pass someone despite a \"No Passing Zone\" Sign\nA:True\nB:Fasle");
		String answer2 = sc.next();
		if (!answer2.equalsIgnoreCase("B")) {
			counter -=1;
		}
		System.out.println("What do you do when you come at a red stop sign??\nA:Slow down, then speed back up\nB:Stop completely\nC:Feed your snail");
		String answer3 = sc.next();
		if (!answer3.equalsIgnoreCase("B")) {
			counter -=1;
		}
		System.out.println("What level should your headbeams be at when in heavy fog?\nA:Low\nB:High");
		String answer4 = sc.next();
		if (!answer4.equalsIgnoreCase("A")) {
			counter -=1;
		}
		System.out.println("What is the first color of a rainbow?\nA:Blue\nB:Red\nC:Green\nD:Yellow");
		String answer5 = sc.next();
		if (!answer5.equalsIgnoreCase("B")) {
			counter -=1;
		}
		return counter;
	}
}
