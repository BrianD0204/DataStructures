import java.util.Scanner;

public class PlayerRoster {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int PLAYERS = 5;
		int[] jersey = new int[PLAYERS];
		int[] rating = new int[PLAYERS];
		int i = 0;
		char menuChar = 'a';
		int newRating = 0;
				
		for (i = 0; i < PLAYERS; ++i) {
			System.out.println("Enter player " + (i + 1) + "'s jersey number:");
			jersey[i] = scnr.nextInt();
			System.out.println("Enter player " + (i + 1) + "'s rating:");
			rating[i] = scnr.nextInt();
			System.out.println("");
		}
		
		System.out.println("ROSTER");

		for (i = 0; i < PLAYERS; ++i) {
			System.out.println("Player " + (i + 1) + " -- Jersey number: " + jersey[i] + ", Rating: " + rating[i]);
		}

		while (menuChar != 'q') {
			System.out.println("");
			System.out.println("MENU");
			System.out.println("u - Update player rating");
			System.out.println("a - Output players above a rating");
			System.out.println("r - Replace player");
			System.out.println("o - Output roster");
			System.out.println("q - Quit");
			System.out.println("");
			System.out.println("Choose an option:");
			menuChar = scnr.next().charAt(0);

			switch(menuChar){
			case 'o':
				if (menuChar == 'o') {
					System.out.println("ROSTER");
					for (i = 0; i < PLAYERS; ++i) {
						System.out.println("Player " + (i + 1) + " -- Jersey number: " + jersey[i] + ", Rating: " + rating[i]);
					}
				}
				break;
			case 'u':
				System.out.print("Enter a jersey number: ");
				int playerJersey = scnr.nextInt();
				System.out.print("Enter a new rating for player:");
				newRating = scnr.nextInt();
				for(i = 0; i < 5; i++){
					if (jersey[i] == playerJersey) {
						rating[i] = newRating;
						break;
					}
				}
				break;
			case 'a':
				System.out.print("Enter a rating:");
				int aboveRating = scnr.nextInt();
				System.out.println("ABOVE " + aboveRating);
				for (i = 0; i < 5; i++) {				
					if (rating[i] > aboveRating) {						
						System.out.println("Player " + (i + 1) + " -- Jersey number: " + jersey[i] + ", Rating: " + rating[i]);
					}
				}
				break;
			case 'r':
				boolean flag = true;
				do {
					System.out.print("Enter a jersey number: ");
					playerJersey = scnr.nextInt();
					System.out.print("Enter a new jersey number: ");
					int playerNewJersey = scnr.nextInt();
					System.out.print("Enter a rating for the new player:");
					newRating = scnr.nextInt();
					for (i = 0; i < 5; i++) {
						if ((jersey[i] == playerJersey)) {
							jersey[i] = playerNewJersey;
							rating[i] = newRating;
							flag = false;
							break;
						}
					}
					if (!flag) {
						System.out.println("Try Again");
					}
				} while (flag);
			case 'q':
				break;
		
			default:
				break;
			}
		}
		return;
	}
}