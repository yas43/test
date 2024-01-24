package repfinder;

import java.util.LinkedList;
import java.util.List;

public class Tempo {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
//		list.add(16);
//		list.add(22);
		list.add(12);
		list.add(13);
		list.add(12);
		list.add(13);
//		list.add(16);
//		list.add(22);
//		list.add(9);
//		list.add(16);
//		list.add(22);
//		list.add(11);
//		list.add(11);
		System.out.println("list is" + list);
		for (int i = 0; i < (list.size()); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if ((list.get(i)) == (list.get(j))) {
					// list.remove(j);
				}
			}
			System.out.println(list);
		}
	}

}
