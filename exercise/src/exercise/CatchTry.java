package exercise;

import java.util.Scanner;

public class CatchTry {

	public static void main(String[] args) {
		int score1 = 0;
		int score2 = 0;

		for (int i = 0; i < 6; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the first number");
			int first_usr_input = scanner.nextInt();
			System.out.println("enter second number");
			int second_usr_input = scanner.nextInt();

//		int first_usr_input = 22;
//		int second_usr_input = 11;
			try {
				if (first_usr_input > second_usr_input) {
					score1 += 1;
					System.out.println("score1 = " + score1 + "\n" + "score2 = " + score2);
				}
//			scanner.close();
				if (first_usr_input < second_usr_input) {

					score2 += 1;
					System.out.println("score2 = " + score2 + "\n" + "score1 = " + score1);
				}
//			scanner.close();

			} catch (Exception e) {
				System.out.println("some things is wrong");
			}

		}

	}
}