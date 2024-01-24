package exercise;

import java.util.Scanner;

public class Ex1 {
	public static void premier_detector(int number) {
		for (int i = 0; i < number; i++) {

		}
	}

	public static void main(String[] args) {
		// write a code which print all the premier number before a given number
		// input a number
		System.out.println("input a number");
		Scanner scanner = new Scanner(System.in);
		int usr_input = scanner.nextInt();
//		System.out.println(usr_input);
		scanner.close();
		// check all divider
		for (int i = 0; i <= usr_input; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
	}
}
