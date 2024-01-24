package sorting;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Sort_03 {

	public static void main(String[] args) {
		List<String> names_list = new LinkedList<>();
		List<Integer> numbers_list = new LinkedList<>();
		names_list.add("yaser");
		names_list.add("adams");
		names_list.add("bob");
		names_list.add("matin");
		numbers_list.add(14);
		numbers_list.add(8);
		numbers_list.add(9);
		numbers_list.add(41);

		Stream<String> ed_name_list = names_list.stream();

	}

}
