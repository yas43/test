package aggregation;

class Content {
	int code;

	void show() {

		System.out.println("showing common content for all brands and screen size");
	}

	void show(Screen_size_A screen_a) {
		System.out.println("showing content special for screen size a");
	}

	void show(Screen_size_B screen_b) {
		System.out.println("showing content for screen size b");
	}

	void show(Screen_size_C screen_c) {
		System.out.println("showing content for screen size c");
	}

	void show(Brand_A brand_a) {
		System.out.println("showing content for brand a");
	}

	void show(Brand_B brand_b) {
		System.out.println("showing content for brand b");
	}

	void show(Brand_C brand_c) {
		System.out.println("showing content for brand c");
	}
}

class Screen_size_A extends Content {

}

class Screen_size_B extends Content {

}

class Screen_size_C extends Content {

}

class Brand_A extends Content {

}

class Brand_B extends Content {

}

class Brand_C extends Content {

}

public class Object_as_argument {

	public static void main(String[] args) {

		Brand_A my_brand_a = new Brand_A();
		Screen_size_A screen_a = new Screen_size_A();
		Content content = new Content();
		content.show();
		content.show(my_brand_a);
		content.show(screen_a);

	}

}
