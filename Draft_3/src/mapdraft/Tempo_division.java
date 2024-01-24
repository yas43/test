package mapdraft;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tempo_division {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(9);
		list.add(8);

//		list.sort(null);
		System.out.println(list);
		System.out.println(list.indexOf(9));
		System.out.println(list.get(1));

		List<Integer> list_l = new LinkedList<>();
		list_l.add(2);
		list_l.add(19);
		list_l.add(85);
		System.out.println(list_l);
		System.out.println(list_l.indexOf(19));
		System.out.println(list_l.get(2));

	}

}
