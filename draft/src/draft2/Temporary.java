package draft2;

import java.util.ArrayList;
import java.util.List;

public class Temporary {

	public static void main(String[] args) {
		List<Integer> my_list = new ArrayList<>();
//		List<Integer> my_list = new LinkedList<>();
		for (int i = 0; i <= 10; i++) {
			my_list.add(i * 10);
		}
		System.out.println(my_list);
//		my_list.remove(5);
//		System.out.println(my_list);
//		my_list.add(666);
//		System.out.println(my_list);
//		Iterator<Integer> it = my_list.iterator();

//		for (int i = 0; i < 5; i++) {
//			System.out.println(it.next());

		my_list.addAll(my_list);
		System.out.println(my_list);
	}

}
