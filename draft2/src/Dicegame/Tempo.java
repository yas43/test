package Dicegame;

import java.util.Random;
import java.util.Scanner;

public class Tempo {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("push on enter");
		int my_number = scanner.nextInt();
		my_number = random.nextInt(1, 7);
		System.out.println(my_number);
		scanner.close();

	}

}
