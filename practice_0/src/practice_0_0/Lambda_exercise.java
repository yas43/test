package practice_0_0;

interface Carses {
	void accelerate();
}

class Drivers implements Carses {
	String driver = "yaser";
	Integer plaque = 569;

	@Override
	public void accelerate() {
		System.out.println("driver   and he accelerate nicely");

	}

}

public class Lambda_exercise {

	public static void main(String[] args) {
		Carses his_car = new Drivers();
		his_car.accelerate();
		Carses my_car = () -> System.out.println("this is my car");
		my_car.accelerate();
		Carses your_car = () -> System.out.println("this is your car");
		your_car.accelerate();

	}
}
