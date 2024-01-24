package exercise;

class Cars {
	String name = "mamad";
	int code = 6666;

//	Cars(String name, int code) {
//		this.name = name;
//		this.code = code;
//
//	}

}

class Employee {
	Cars car;
	String owner = "ghasem";

	public Employee(Cars car, String owner) {
		this.car = car;
		this.owner = owner;
	}

	public void rep() {
		System.out.println(
				"employee's car is " + car.name + "and employee name is " + owner + "  car code is  " + car.code);
	}

}

public class Temp3 {

	public static void main(String[] args) {
		Cars car = new Cars();
		Employee my_employee = new Employee(car, "yaser");

//		my_employee.rep();

//		System.out.println(car.code);
		System.out.println(car.name);
//		System.out.println(my_employee.owner);
//		my_employee.rep();
	}

}
