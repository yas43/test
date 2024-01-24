
interface Drawing {

	void draw();
}

class Pencil_1 implements Drawing {
	String pencil_name;
	int code;

	@Override
	public void draw() {
		System.out.println("drawing with " + pencil_name + " and thickness is " + code);

	}

}

class pencile_2 implements Drawing {
	String pencile_name;
	int code;

	@Override
	public void draw() {
		System.out.println("drawing with " + pencile_name + "  and thickness is " + code);

	}

}

public class Interfaces_ {

	public static void main(String[] args) {
		pencile_2 pen_2 = new pencile_2();
		pen_2.pencile_name = "pen2";
		pen_2.code = 10;

		Pencil_1 pen_1 = new Pencil_1();
		pen_1.pencil_name = "pen1";
		pen_1.code = 15;

		pen_2.draw();
		pen_1.draw();

	}

}
