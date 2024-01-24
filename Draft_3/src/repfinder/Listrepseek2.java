package repfinder;

import java.util.LinkedList;
import java.util.List;

public class Listrepseek2 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		List<Integer> u_list = new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("c");
		list.add("a");
		list.add("k");
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {

				}
			}
		}

	}

}
