package draft;

enum Size {

	// enum constants calling the enum constructors
	SMALL("The size is small."), MEDIUM("The size is medium."), LARGE("The size is large."),
	EXTRALARGE("The size is extra large.");

	private final String pizzaSize;

	// private enum constructor
	private Size(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public String getSize() {
		return pizzaSize;
	}
}

public class Enum_0 {

	public static void main(String[] args) {

		Size size = Size.SMALL;
		System.out.println(size.getSize());
	}

}
