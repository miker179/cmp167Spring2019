import java.util.Scanner;

public class Futbal {

	public static void main(String[] args) {
		final int MAX_PLAYERS = 5;
		int[] jerseyNums = new int[MAX_PLAYERS];
		int[] playerRating = new int[MAX_PLAYERS];
		Scanner scnr = new Scanner(System.in);

		for (int i = 0; i < MAX_PLAYERS; i++) {
			// prompt and get player's jersey number
			System.out.print("Enter player " + (i + 1) + "'s jersey number: ");
			int jersey = scnr.nextInt();
			jerseyNums[i] = jersey;
			System.out.println();
			// prompt and get player's rating
			System.out.print("Enter player " + (i + 1) + "'s rating: ");
			int rating = scnr.nextInt();
			playerRating[i] = rating;
			System.out.println();
			System.out.println();
		}

		// MENU OPTION
		boolean done = false;

		while (!done) { // false until user enter q
			System.out.println("MENU");
			System.out.println("o - Output rosters\n" + "u - Update player rating\n"
					+ "a - Output players above a rating\n" + "q - Quit\n" + "\nChoose an option: ");
			String userInput = scnr.nextLine();

			if (userInput.equalsIgnoreCase("q")) {
				done = true;
			} else if (userInput.equalsIgnoreCase("o")) {
				System.out.println("ROSTER");
				for (int i = 0; i < MAX_PLAYERS; i++) {
					System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNums[i] + ", Rating: "
							+ playerRating[i]);
				}
				System.out.println();
				
			} else if (userInput.equalsIgnoreCase("u")) {
				System.out.println("Enter a jersey number: ");
				int jersey = scnr.nextInt();
				// find the person with that jersey #
				int i;
				for (i = 0; i < MAX_PLAYERS; i++) {
					 if (jerseyNums[i] == jersey) {
					 break;
					}
				}
				System.out.print("Enter new rating for player: ");
				 int rating = scnr.nextInt();
				 // set the new rating
				 playerRating[i] = rating;
				 // clear any extra character
				 userInput = scnr.nextLine();
			}  else if (userInput.equalsIgnoreCase("a")) {
				System.out.println("Enter a rating: ");
				int rating = scnr.nextInt();
				
				System.out.println("ABOVE " + rating);
				for (int i = 0; i < MAX_PLAYERS; i++) {
					if (playerRating[i] > rating) {
						System.out.println("Player " + (i + 1) +
								" -- Jersey number: " + jerseyNums[i] +
								", Rating: " + playerRating[i]);
					}
				 }
				 System.out.println();
				 
			}
		}
	}
}
