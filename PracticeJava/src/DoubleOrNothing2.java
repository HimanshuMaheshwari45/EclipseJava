import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing2 {
	private Scanner scanner = new Scanner(System.in);
	private static int startPoint= 10;
	private Random random = new Random();
	private int current = startPoint;
	private boolean isStillPlaying = true;
	
	public void playGame() {
		printWelcome();
		askUserToContinue();
		
		while(this.isStillPlaying) {
			
			printTryToDouble();
			if(shouldDouble()) {
				doubleCurrent();
				printCongrats();
				askUserToContinue();
				
			}
			else {
				printLost();
				return;
				
			}
			
		}
		printWalkAwayMessage();
	}
	
	private void doubleCurrent() {
		// TODO Auto-generated method stub
		this.current= this.current*2;
		
	}

	private boolean shouldDouble() {
		// TODO Auto-generated method stub
		return this.random.nextInt(2)==0;
	}

	private void printWalkAwayMessage() {
		// TODO Auto-generated method stub
		System.out.println("Congrats! you now finish with " + this.current+ " points");
	}

	private void printLost() {
		// TODO Auto-generated method stub
		System.out.println("uh oh. you've lost. " + "No points for you");
	}

	private void printCongrats() {
		// TODO Auto-generated method stub
		System.out.println("Congrats! you now have " + this.current + " points \n");
		
	}

	private void printTryToDouble() {
		// TODO Auto-generated method stub
		System.out.println("Let's try to double it!");
	}

	protected void askUserToContinue() {
		// TODO Auto-generated method stub
		System.out.println("would you like to continue " + "and try to double your winnings?" + "Enter YES to continue");
		
		this.isStillPlaying = this.scanner.nextLine().toUpperCase().equals("YES");
	}

	private void printWelcome() {
		// TODO Auto-generated method stub
		System.out.println("Let's Paly double or nothing." + "We will start you off with " + startPoint + " points\n");
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleOrNothing2 obj = new DoubleOrNothing2();
		obj.playGame();

	}

}
