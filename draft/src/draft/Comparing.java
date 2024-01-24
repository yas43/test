package draft;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class cars {
	String name;
	int code;
	int price;

	cars(String name, int code, int price) {
		this.name = name;
		this.code = code;
		this.price = price;
	}

	void presentation() {
		System.out.println("the name of car is " + name + "the code is " + code + "the price is" + price);
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, name, price);
	}

	public boolean equals(cars obj) {

		if (this.code == obj.code)
			return true;
		return false;
	}

}

public class Comparing {

	public static void main(String[] args) {
		cars car_1 = new cars("BMW", 1001, 10000);
		cars car_2 = new cars("BENZ", 1002, 12000);
		cars car_3 = new cars("volexwagon", 1003, 15000);
		cars car_4 = new cars("BMW", 10021, 10000);

		List<cars> carlist = new ArrayList<>();

		boolean message = car_1.equals(car_4);
		System.out.println(message);
//		List<Integer> intlist = new ArrayList<>();
//		List<String> strlist = new ArrayList<>();
//		intlist.add(10);
//		intlist.add(25);
//		intlist.add(2);
//		intlist.add(45);
//		intlist.add(11);
//		intlist.add(8);
//		intlist.add(5);
//		strlist.add("yaser");
//		strlist.add("gisele");
//		strlist.add("matin");
//		strlist.add("alfoso");
//		carlist.sort(null);
//		Collections.sort(intlist);
//		System.out.println(intlist);
//		System.out.println(strlist);
//		intlist.sort(null);
//		strlist.sort(null);
		carlist.add(car_1);
		carlist.add(car_2);
		carlist.add(car_3);
		carlist.add(car_4);

//		System.out.println();
//		System.out.println(intlist);

	}

}
