package exercise;

class Personnel {
	String name;
	int code;

	public Personnel(String name, int code) {
		this.name = name;
		this.code = code;
	}
}

class Sectoor {
	String name;
	int code;
	Personnel employee;

	public Sectoor(String name, int code, Personnel employee) {
		this.name = name;
		this.code = code;
		this.employee = employee;
	}

}

public class Temporay4 {

	public static void main(String[] args) {

		Personnel employee = new Personnel("yaser", 1001);
		Sectoor it = new Sectoor("IT", 1001, employee);
		System.out.println(it.employee.name);

	}

}
