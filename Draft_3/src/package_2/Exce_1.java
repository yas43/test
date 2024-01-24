package package_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// check weather there is a common items between two array
public class Exce_1 {

	public static void main(String[] args) {
//		int[] array = new int[5];
		int[] array_1 = { 5, 10, 2, 9, 7 };
		int[] array_2 = { 11, 6, 8, 3, 19 };
		int j = 0;
//		System.out.println(Arrays.toString(array_1));
//		System.out.println(array_2[2]);
//		for (int item : array_1) {
//			for (int element : array_2) {
//				if (item == element) {
//					System.out.println("has a common element ");
//					j = 1;
//					break;
//				}
//			}
//		}
//		if (j == 0) {
//			System.out.println("has not a common element");
//		}

//		define a array_list
		List<Integer> test_list = new ArrayList<>();
		test_list.add(50);
		test_list.add(11);
		test_list.add(29);
		test_list.add(93);
		System.out.println(test_list);
//		test_list.sort(null);
//		System.out.println(test_list);

		Collections.sort(test_list);
		System.out.println(test_list);
	}

}
