package map001;

import java.util.HashSet;
import java.util.Set;

public class Maptotu02 {

	public static void main(String[] args) {
		Set<String> my_set = new HashSet<>();
		Set<String> your_set = new HashSet<>();
		my_set.add("a");
		my_set.add("b");
		my_set.add("c");
		my_set.add("d");
		my_set.add("a");
		your_set.add("b");
		your_set.add("f");
		your_set.add("g");
		System.out.println(my_set);
		System.out.println(your_set);
		my_set.retainAll(your_set);
		System.out.println(my_set);

	}

}
