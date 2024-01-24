package draft;

class Animal {
	private int code;
	protected String name;

	public Animal(int code, String name) {
		this.code = code;
		this.name = name;
	}

	void make_sound() {
		System.out.println("all the animals makes sound ");
	}

	void make_move() {
		System.out.println("all animal do their movement");
	}

}

public class Reflection_demo {

	public static void main(String[] args) {

		Animal animal = new Animal(0024, "tiger");
		Class b = animal.getClass();
		String name = b.getName();
		System.out.println("Name: " + name);

	}

}
