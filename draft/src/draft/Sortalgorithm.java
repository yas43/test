package draft;

import java.util.Arrays;
import java.util.Random;

public class Sortalgorithm {

	public static void main(String[] args) {
		// creating a arraylist or array by random numbers
//		List<Integer> mylist = new ArrayList<>();
		int[] arraylist = new int[10];
		Random random = new Random();

		for (int i = 0; i <= 9; i++) {
			// arraylist[i]=
			int number = random.nextInt(100);
//			mylist.add(number);
			arraylist[i] = number;

		}
		System.out.println(Arrays.toString(arraylist));

		// gives the minimum and index of minimum for a smallest number
		int min = arraylist[0];
		int index_min = 0;
		for (int i = 0; i < (arraylist.length); i++) {
			for (int j = i + 1; j < (arraylist.length); j++) {
				if (arraylist[j] < min) {
					min = arraylist[j];
					index_min = j;
				}
			}

		}
		System.out.println("min is " + min + "  and index of min is  " + index_min);
	}

}
