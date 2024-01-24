package streamexercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Temporary {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("momo", "gigi", "gogo", "sisi", "momo", "gigi", "momo", "sisi", "gigi",
				"gigi");
		 Stream<String> unique_list = list.stream().parallel();
		
		 }
		System.out.println(list);

	}

}
