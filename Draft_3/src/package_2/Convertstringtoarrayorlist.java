package package_2;

import java.util.Arrays;

public class Convertstringtoarrayorlist {

	public static void main(String[] args) {
		/**
		 * String to string array
		 */

		String message_1 = "this is a message_1 for test.";
		String[] array_1 = new String[20];
		array_1 = message_1.split("");
		System.out.println(Arrays.toString(array_1));
		array_1 = message_1.split("\s");
		System.out.println(Arrays.toString(array_1));

		/**
		 * string array to String
		 */
		String message_2;
		String[] array_2 = { "h", "e", "l", "l", "o", "", "w", "o", "r", "l", "d" };
		message_2 = array_2.toString();
		System.out.println(message_2);

	}

}
