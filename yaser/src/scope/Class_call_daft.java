package scope;

class test_class {

	void my_method(String name, int age) {
		System.out.println("your name is " + name + "  and your age is " + age);
	}

}

public class Class_call_daft {
	public static void main(String[] args) {
		System.out.println("hello world");
		test_class my_name = new test_class();
		// System.out.println(my_name.age);
		my_name.my_method("yaser", 42);
	}
}
