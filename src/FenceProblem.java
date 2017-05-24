import java.util.Scanner;

public class FenceProblem {

	public static void main(String[] args) {

		String fenceChoice = "0";
		Scanner keyboard = new Scanner(System.in);
		double fencePrice = 0;
		double woodFence = 25;
		double chainFence = 15;
		int numberOfGate = 0;
		double costOfGate = 150;
		double footOfFencing = 0;
		double fenceTotalPrice = 0;

		do {
			System.out.println("Hello! What type of fencing would you like?");
			System.out.println("Please enter 1 for Wood Fencing ($25 per Foot)");
			System.out.println("Please enter 2 for Chain-Link Fencing ($15 per Foot)");
			fenceChoice = keyboard.nextLine();
			if (fenceChoice.equals("1")) {
				fencePrice = woodFence;
				break;
			}
			if (fenceChoice.equals("2")) {
				fencePrice = chainFence;
				break;
			} else {
				System.out.println("~~~~~~~~~~~~~Please enter 1 or 2!~~~~~~~~~~~~~");
				fenceChoice = "0";
			}

		} while (!fenceChoice.equals("1") || !fenceChoice.equals("2"));

		do {
			System.out.println(" ");
			System.out.println("How many total feet of fencing would you like to buy? (Please enter amount greater than 0)");
			footOfFencing = keyboard.nextInt();
			if (footOfFencing > 0) {
				fenceTotalPrice = fencePrice * footOfFencing;
				break;
			} 
			else {
				System.out.println("~~~~~~~~~~~~~Please enter amount greater than 0!~~~~~~~~~~~~~");
				footOfFencing = 0;
			}
		} while(footOfFencing <= 0);

		do {
			System.out.println(" ");
			System.out.println("Sorry but before you go you are required to buy a minimum of 1 gate and max 3.");
			System.out.println("Now how many fences would you like to get?");
			numberOfGate = keyboard.nextInt();
			if (numberOfGate == 1 || numberOfGate == 2 || numberOfGate == 3) {
				costOfGate = costOfGate * numberOfGate;
				break;
			}

			else {
				System.out.println("~~~~~~~~~~~~~Please enter minimum of 1 gate and max 3!~~~~~~~~~~~~~");
				numberOfGate = 0;
			}

		} while(numberOfGate != 1 || numberOfGate != 2 || numberOfGate != 3);

		double tax = (fencePrice + costOfGate) * .06;

		System.out.println(" ");
		System.out.println("The total price of the fence(s): $" + fenceTotalPrice);
		System.out.println("The total price of the gate(s): $" + costOfGate);
		System.out.println("Tax $" + tax);
		System.out.println("Building Permit Fee (No Tax) : $50");

		double totalPrice = fenceTotalPrice + costOfGate + 50 + tax;

		System.out.println("The total price for everything is: $" + totalPrice);
	}
}
