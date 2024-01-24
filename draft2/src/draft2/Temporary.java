package draft2;

import java.util.LinkedList;
import java.util.List;

public class Temporary {

	public static void main(String[] args) {
		List<Integer> my_int_list = new LinkedList<>();
		my_int_list.add(20);
		my_int_list.add(63);
		my_int_list.add(12);
		my_int_list.add(200);
		System.out.println(my_int_list);
		System.out.println(my_int_list.get(0));
		my_int_list.remove(0);
		System.out.println(my_int_list);
		System.out.println(my_int_list.get(0));

	}

}
