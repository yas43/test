import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author yaser
 *
 */
class Cars {
	String name;
	String driver;
	int price;
	int code;

	public void presenting() {
		System.out.println("this is a presentation for car");
	}

}

class Drivers {
	String name;
	int age;
	int expe;
	int code;

	public void explanation() {
		System.out.println("this is a description for driver");
	}

}

public class Classes_in_java {

	public static void main(String[] args) {
//		Cars car = new Cars();
//		car.name = "BMW";
//		car.driver = "yaser";
//		car.code = 1010;
//		car.price = 15000;
//
//		Cars s_car = new Cars();
//		s_car.name = "VOLVO";
//		s_car.driver = "gisele";
//		s_car.code = 2020;
//		s_car.price = 2000;

//		System.out.println("car names is " + car.name);
//		System.out.println("car driver is " + car.driver);
//		System.out.println("car code is " + car.code);
//		System.out.println("car price is " + car.price);
//		System.out.println("\n");
//		System.out.println("car_s names is " + s_car.name);
//		System.out.println("car_s driver is " + s_car.driver);
//		System.out.println("car_s code is " + s_car.code);
//		System.out.println("cars_ price is " + s_car.price);

// creating 4 list and attributing every element of every list to the corresponding field of Cars class in order to create several objects

		List<String> names = new LinkedList<>();
		names.add("yaser");
		names.add("gisele");
		names.add("matin");
		names.add("sara");
		System.out.println(names);
//		names.get(0);
		List<String> drivers = new LinkedList<>();
		drivers.add("BMW");
		drivers.add("BENZ");
		drivers.add("VOLVO");
		drivers.add("PORCHE");
		System.out.println(drivers);
		List<Integer> prices = new LinkedList<>();
		prices.add(10000);
		prices.add(15000);
		prices.add(9000);
		prices.add(20000);
		System.out.println(prices);
		List<Integer> codes = new LinkedList<>();
		codes.add(1001);
		codes.add(1002);
		codes.add(1003);
		codes.add(1004);
		System.out.println(codes);

//		Cars car = new Cars();
//		car.driver = drivers.get(0);
//		car.code = codes.get(0);
//		car.price = prices.get(0);
//		car.name = names.get(0);
//		System.out.println("car's name is " + car.name + "   cars driver is " + car.driver);

		for (int i = 0; i < 4; i++) {
			Cars car = new Cars();
			car.name = names.get(i);
			car.driver = drivers.get(i);
			car.code = codes.get(i);
			car.price = prices.get(i);
			System.out.println("car's name is " + car.name + "  car's code is " + car.code + "  car's driver is "
					+ car.driver + "  car's price is " + car.price);
		}

	}

}
