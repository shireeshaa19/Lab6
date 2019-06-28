

import java.util.Scanner;

public class Dicerolling {

	public static void main(String[] args) {
		
		
		Scanner scnr = new Scanner(System.in);
		int nsides;
		int roll1 = 0;
		int roll2 = 0;
		String ans;
		int rollNum = 1;
		
          System.out.println("Welcome to the Grand Circus Casino!");
		
		do {
			System.out.println("How many sides should each die have?");
			nsides = scnr.nextInt();
			
			System.out.println("Roll " + rollNum);
			System.out.println(roll1 = generateRandomDieRoll(nsides));
			
			
			dice(roll1, roll2);
			
			
			System.out.println("Roll again? (y/n):");
			ans = scnr.next();
			ans = ans.toLowerCase();
			rollNum++;
		} while(ans.equals("y"));
		
		System.out.println("Goodbye");
		scnr.close();
	}
	
	
	public static int generateRandomDieRoll(int nsides) {
        int count = 0;
        count = (int)(Math.random() * nsides) + 1;
         return count;
	}


	private static void dice(int x, int y) {
		if(x == 1 && y == 1) {
			System.out.println("Snake Eyes!");
		} else if(x == 6 && y == 6) {
			System.out.println("Box Cars!");
		}
	}

    
}
		
		
		              
  