package sorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sort_02 {

	public static void main(String[] args) {
		List<String> str_list = new LinkedList<>();
		str_list.add("f");
		str_list.add("a");
		str_list.add("h");
		str_list.add("c");
		str_list.add("d");
		str_list.add("b");
		System.out.println(str_list);
		Collections.sort(str_list);
		System.out.println(str_list);

	}

}
