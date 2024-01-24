package draft2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spilit {
	// writing a method for parsing a list in order to find repetitive elements

	static void finder(int[] mylist, int element) {
		List<Integer> list = new ArrayList<>();
		int j = 0;
		for (int i = 0; i < mylist.length; i++) {
			if (mylist[i] == element) {
				while (mylist[i] == element) {
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
//		String mytext = "anhdgaubduh125gln ,,/hgp,  fa ezui f*dcju";
		// mytext.split(mytext);

//		String[] myaray = mytext.split("");
//		System.out.println(myaray.toString());
//		System.out.println(Arrays.toString(myaray));
//		System.out.println(Arrays.toString(myaray).length());
//		System.out.println(myaray.length);

//		int[] list1 = { 1, 5, 10, 5, 10, 10, 10, 3, 8, 55, 10, 10, 10, 10, 6, 23, 70, 100 };
//		String[] list2 = { "yaser", "gisele", "matin" };
//		String message = list.toString();
//		System.out.println(list1.toString()); // this is a older method better to use Arrays.toString for printing
//		System.out.println(list2);
//		System.out.println(list1);
//		System.out.println(list1.getClass());
//		System.out.println(list2.getClass());
//		String name = "yaser";
//		System.out.println(name);
//		System.out.println();
		// System.out.println(Arrays.toString(list));

		int[] mynumbers = { 1, 1, 5, 10, 1, 1, 1, 1, 3, 3, 5, 0, 1, 1, 80 };
		System.out.println(Arrays.toString(mynumbers) + mynumbers.length);
		finder(mynumbers, 1);

	}

}
