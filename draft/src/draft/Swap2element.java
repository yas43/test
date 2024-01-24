package draft;

import java.util.Arrays;
import java.util.Random;

public class Swap2element {

	public static void main(String[] args) {
		int member_number = 10;
		int primary_index = 2;
		int secondry_index = 5;
		Random random = new Random();
		// create array b random numbers
		int[] arraylist = new int[member_number];
		for (int i = 0; i < member_number; i++) {
			int ran_num = random.nextInt(100);
			arraylist[i] = ran_num;
		}
		System.out.println("befor changes" + Arrays.toString(arraylist));
		int temp = arraylist[primary_index];
		arraylist[primary_index] = arraylist[secondry_index];
		arraylist[secondry_index] = temp;
		System.out.println("after changes " + Arrays.toString(arraylist));

	}

}
