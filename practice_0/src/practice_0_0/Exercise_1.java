package practice_0_0;

class Car {
	String model;
	Integer price;

	public Car(String model, Integer price) {
		this.model = model;
		this.price = price;
	}

	void info() {
		System.out.println("model is " + this.model + "  and price is " + this.price);
	}
}

class Sandan extends Car {

	String name;
	Integer code;

	public Sandan(String model, Integer price, String name, Integer code) {
		super(model, price);
		this.name = name;
		this.code = code;
	}

	void infor() {
		System.out.println("the model is " + super.model + " the price is " + super.price + " and the name is "
				+ this.name + " and the code is " + this.code);
	}

}

public class Exercise_1 {

	public static void main(String[] args) {
		Car my_car = new Car("BMW", 15000);
		Sandan your_car = new Sandan("BENZ", 12000, "benz 256", 1003);
		my_car.info();
		your_car.infor();
		your_car.info();

	}

}
