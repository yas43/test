package scope;

class my_class {
	private String name = "yaser";
	public int age = 41;

	public void pint() {
		System.out.println("my name is " + name + "  and i have " + age + "years old");

	}
}

public class Class_fix_par {

	public static void main(String[] args) {
		my_class my_instance = new my_class();
		System.out.println(my_instance.age);
		my_instance.pint();

	}

}
