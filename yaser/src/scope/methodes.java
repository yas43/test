package scope;

class our_class {
	public void mylassmethod(int number, String name) {
		System.out.println("you are " + name + " and ou have " + number + "years old");
	}
}

public class methodes {
	static int my_method(int x, int y) {
		return x * y;

	}

	public static void main(String[] args) {
		System.out.println("hello world");
		int local = my_method(10, 30);
		System.out.println(my_method(40, 50) + "\n" + local);
		our_class my_instance = new our_class();
		my_instance.mylassmethod(41, "yaser");
	}

}
