package draft;

enum screen_size {
	SMALL, MIDDELE, LARG
}

public class Enum_ {

	public static void main(String[] args) {
		screen_size state;
		state = screen_size.MIDDELE;

		switch (state) {
		case LARG:
			// state = screen_size.LARG;
			System.out.println("larg screen");
			break;
		case MIDDELE:
			// state = screen_size.MIDDELE;
			System.out.println("middle screen");
			break;
		case SMALL:
			// state = screen_size.SMALL;
			System.out.println("small screen");
		}

	}
}
