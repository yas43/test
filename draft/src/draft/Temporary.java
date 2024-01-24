package draft;

import java.util.LinkedList;
import java.util.List;

interface Component {
	void show_Price();
}

class Leaf implements Component {
	int price;

	Leaf(int price) {
		this.price = price;
	}

	@Override
	public void show_Price() {
		System.out.println("price : " + price);
	}
}

class composit implements Component {
	List<Component> list = new LinkedList<>();

	@Override
	public void show_Price() {
		for (Component items : list) {
			items.show_Price();
		}

	}

}

public class Temporary {

	public static void main(String[] args) {

	}

}
