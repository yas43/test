package draft2;

class my_class {
	int number;
	// String name = "gisele";
	// String famil = "hoffman";

	my_class(int number) {

		System.out.println("my_class calling");
		System.out.println("i have" + number);
	}

	void my_method(String name, String famil) {
		System.out.println(
				"my name is  " + name + "  my last name is " + famil + "i have " + this.number + "  years old");
	}
}

public class classe_dem {
	public static void main(String[] args) {
		my_class person = new my_class(10);
		// System.out.println(person.name);
		// System.out.println(person.famil);
		// System.out.println(person.number);
		person.my_method("matin", "keshtdar");
	}

}
