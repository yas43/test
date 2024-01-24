package oops;

class animal {
	int heigth;
	int weigth;

	animal(int heigth, int weigth) {
		this.heigth = heigth;
		this.weigth = weigth;
		System.out.println("an animal with heigth of " + this.heigth + "and weigth of" + this.weigth + "is created");
	}

	void present() {
		System.out.println("this animal have  heigth  " + this.heigth + "and weigth  " + this.weigth);

	}

}

class pets extends animal {

	String name;
	String color;

	pets(String name, String color, int heigth, int weigth) {
		super(heigth, weigth);
		this.name = name;
		this.color = color;
		System.out.println("a pet with name of " + this.name + "  and color of " + this.color + "  is created");
	}

	void make_voice() {
		System.out.println(name + "gives this voice and its color is " + color);
	}
}

class cats extends pets {
	String race;
	int last_veterinary;

	cats(String race, int last_veterinary) {
		super(race, race, last_veterinary, last_veterinary);
		this.race = race;
		this.last_veterinary = last_veterinary;
	}

}

public class satatic_method {

	public static void main(String[] args) {

	}

}
