import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 5;
		RoadTestQuestions rtq = new RoadTestQuestions();
		System.out.println("Welcome to driving school version 1.0, Type any key and press enter to start.");
		 
		String start = sc.next();
		//rtq.questions(counter, sc);
		
		counter = rtq.questions(counter, sc);
		
		if (counter >= 4) {
			System.out.println("You pass with a " + counter + " out of 5");
		}
		
		
		System.out.println("You have scored a " + counter + " out of 5!");
			
	}
}