package practice_0_0;

class Cars {
	String name;
	Integer code;
	String owner;
	Integer price;

	public Cars(String name, Integer code, String owner, Integer price) {
		this.name = name;
		this.code = code;
		this.owner = owner;
		this.price = price;
	}

	void info() {
		System.out.println("this is info method ");
	}

	void info(String name) {
		System.out.println("the name of cais " + this.name + " and this is info method");
	}

	int info(Integer code) {
		return this.code;
	}

	String info(String owner, String name) {
		return "this is info method";
	}
}

public class Exercise_0 {

	public static void main(String[] args) {
//		overloading 

		Cars my_car = new Cars("BMW", 1002, "yaser", 15000);
		my_car.info();
		System.out.println(my_car.info(2001));
		my_car.info("mamad");
		System.out.println(my_car.info("ghasem", "hashem"));

	}

}
