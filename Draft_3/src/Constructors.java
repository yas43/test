
class Main {

	int i;

	// constructor with no parameter
	Main() {
		i = 5;
		System.out.println("Constructor is called");
	}
}

public class Constructors {

	public static void main(String[] args) {
		Main obj = new Main();
		System.out.println("Value of i: " + obj.i);

	}
}
