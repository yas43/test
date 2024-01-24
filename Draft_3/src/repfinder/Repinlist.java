package repfinder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Repinlist {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("a");
		list.add("a");
		list.add("c");
		list.add("d");
		list.add("d");
		list.add("g");
		list.add("c");
		list.add("b");
		list.add("a");
		list.add("c");
		list.add("b");
		list.add("f");
		list.add("f");
		System.out.println(list);
		Set<String> set = new HashSet<>();
		Map<String, Integer> map = new HashMap<>();
		set.addAll(list);
		System.out.println(set);
		int increament = 0;
		for (String letters : set) {
			for (int j = 0; j < list.size(); j++) {
				if (letters.equals(list.get(j))) {
					increament++;
				}
				if (j == list.size() - 1) {
					map.put(letters, increament);
					increament = 0;
				}

			}

		}
		System.out.println(map);

	}

}
