package draft2;

import java.util.Scanner;

public class Check_pass {

	public static void main(String[] args) {
		int i = 0;
		while (i < 3) {
			// System.out.println("ask for password");
			Scanner scanner = new Scanner(System.in);
			scanner.next();
			if (scanner.next().equals("yaser")) {
				System.out.println("correct");
				break;

			}

			System.out.println("loop passed");
			i += 1;
		}

	}

}
