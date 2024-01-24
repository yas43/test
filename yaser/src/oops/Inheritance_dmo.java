package oops;

class Animal {
	void make_sound() {
		System.out.println("all the animal make noise");
	}
}

class Birds extends Animal {
	@Override
	void make_sound() {
		System.out.println("the birds make beutiufull sounds");
	}
}

public class Inheritance_dmo {

	public static void main(String[] args) {

	}

}
