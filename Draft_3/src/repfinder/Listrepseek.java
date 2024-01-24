package repfinder;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Listrepseek {

	public static void main(String[] args) {
		List<String> str_lst = new LinkedList<>();
		str_lst.add("a");
		str_lst.add("b");
		str_lst.add("c");
		str_lst.add("a");
		str_lst.add("b");
		str_lst.add("c");
		str_lst.add("c");
		str_lst.add("a");
		str_lst.add("a");
		str_lst.add("c");
		str_lst.add("a");
		str_lst.add("k");
		System.out.println(str_lst);
//		System.out.println(str_lst.get(0));
//		System.out.println(str_lst.get((str_lst.size() - 1)));
//		for(int i=0;i<str_lst.size();i++) {
//			
//		}
//		Iterator<String> symptoms = str_lst.iterator();
//		int i = 0;
//		while (symptoms.hasNext()) {
//			if (symptoms.next().equals("g"))
//				i++;
//
//		}
//		System.out.println("rep is " + i);

//		int j = 1;
//		for (int i = 0; i < str_lst.size(); i++) {
//			if ((str_lst.get(i)).equals(str_lst.get(i + 1))) {
//				j++;
//				str_lst.remove(i + 1);
//				System.out.println(str_lst);
//			}
//		}
//		System.out.println(j);
//
		Map<String, Integer> map = new HashMap<>();
		int increament = 0;
		for (int i = 0; i < str_lst.size(); i++) {
			for (int j = 1; j < str_lst.size(); j++) {
				if (str_lst.get(i).equals(str_lst.get(j))) {
					increament++;
					// str_lst.remove(j);

				}
			}
			String key = str_lst.get(i);
			map.put(key, increament);
			increament = 0;

		}
		System.out.println(map);
	}
}
