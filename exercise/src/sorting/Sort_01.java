package sorting;

import java.util.Arrays;

public class Sort_01 {

	public static void main(String[] args) {
//		String message = "THIS IS  a test";
//		String[] my_aray = message.split(" ");
//		System.out.println(Arrays.toString(my_aray));
		String[] test_array = { "f", "a", "z", "b", "y", "c", "e" };
		System.out.println(Arrays.toString(test_array));
		Arrays.sort(test_array);
		System.out.println(Arrays.toString(test_array));

	}

}
