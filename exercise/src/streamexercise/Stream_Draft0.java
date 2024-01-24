package streamexercise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Draft0 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(11);
		list.add(30);
		list.add(45);
		list.add(50);
		list.add(73);
		list.add(60);
		list.add(110);
		list.add(84);
		list.add(12);
		list.add(28);
		list.add(92);
		list.add(99);
		List<String> usr_lst = Arrays.asList("yaser", "matin", "gigi", "mimi", "lili", "lolo", "bobo", "lala");

		Stream<Integer> stream_list = list.stream();
		Stream<Integer> sorted_list = stream_list.sorted();
		Stream<Integer> filterlist = sorted_list.filter(n -> n % 2 == 1);
//		stream_list.forEach(n -> System.out.print(n + ","));
		filterlist.forEach(n -> System.out.print(n + ","));
		usr_lst.stream().map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));

	}

}
