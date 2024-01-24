package sorting;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Sort_00 {

	public static void main(String[] args) {
		List<Integer> my_list = new LinkedList<>();
		my_list.add(13);
		my_list.add(11);
		my_list.add(8);
		my_list.add(4);
		my_list.add(10);
		my_list.add(28);
//		System.out.println(my_list);
//		Collections.sort(my_list);
//		System.out.println(my_list);
		Stream<Integer> sorted_list = my_list.stream().sorted();
		sorted_list.forEach(n -> System.out.print(", " + n));

		sorted_list.close();

	}

}
