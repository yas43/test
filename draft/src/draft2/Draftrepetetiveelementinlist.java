package draft2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Draftrepetetiveelementinlist {
	// writing a method for parsing a list in order to find repetitive elements

	static void finder(int[] mylist, int element) {
		List<Integer> list = new ArrayList<>();
		int j = 0;

		for (int i = 0; i < mylist.length; i++) {
			if (mylist[i] == element) {
				while (i < mylist.length && mylist[i] == element) {
					j++;
					i++;
				}
				list.add(j);
				j = 0;
			}

		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		int[] mynumbers = { 1, 1, 5, 10, 8, 100, 1, 1, 1, 1 };
		System.out.println(Arrays.toString(mynumbers) + mynumbers.length);
		finder(mynumbers, 1);

	}

}
