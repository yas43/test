package exercise;

import java.util.LinkedList;
import java.util.List;

public class Temp {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(0);
		list.add(2);
		list.add(5);
		System.out.println(list);

//		System.out.println(Math.pow(2, 3));
//		System.out.println(list.indexOf(4));
//		System.out.println(list.get(1));
		for (int i = 0; i < list.size(); i += 2) {
			System.out.println(Math.pow(list.get(i), list.get((i + 1))));
		}

//		 check if we can make a list by putting them in a equation:
//		List<Integer> list_0 = new LinkedList<>();
//		list_0 = list;
//		System.out.println(list_0);

	}

}
