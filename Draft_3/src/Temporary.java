import java.util.LinkedList;
import java.util.List;

public class Temporary {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();
		list.add(100);
		list.add(42);
		list.add(55);
		list.add(10);
		list.add(22);
		list.add(35);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
