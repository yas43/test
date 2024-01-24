package oops;

class People {
	protected int heigth;
	protected int weigth;
	protected String name;

	People(int heigth, int weigth, String name) {
		this.heigth = heigth;
		this.weigth = weigth;
		this.name = name;
		System.out.println(" people class is invoked ");
	}

	void present() {
		System.out.println("present method from people class  is invoked " + this.heigth + "\t\t" + this.weigth + "\t"
				+ this.name);
	}
}

class Employee extends People {
	public int code;
	public String post;

	public Employee(int code, String post) {
		super(170, 80, "mamad");
		this.code = code;
		this.post = post;
		System.out.println("employee class is invoked");
	}

	@Override
	public void present() {
		super.present();
		System.out.println("this part running from Employee class");
	}

	void empl_recod() {
		System.out.println("employee record method is evoked ");
	}
}

class My_team {

	void My_team_method() {
		System.out.println("method for myteam class");
	}
}

public class opps_demo0 {
	public static void main(String[] args) {
		// People person1 = new People(175, 85, "ghasem");
		Employee employee = new Employee(123456, "expert");
		// person1.present();
		employee.present();
		employee.heigth = 500;
		employee.present();

	}
}
