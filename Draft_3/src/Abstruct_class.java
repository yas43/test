
abstract class Hall {
	String name;
	int code;

	abstract void display();
}

class Movie extends Hall {
	String movie_name;
	int hall_number;

	@Override
	void display() {
		System.out.println("name is " + name);
	}

}

public class Abstruct_class {

	public static void main(String[] args) {
//		Hall hall_1 = new Hall();
//		hall_1.name = "sepehr";
//		hall_1.code = 400;
//		hall_1.display();

		Movie movie = new Movie();
		movie.movie_name = "matrix";
		movie.hall_number = 16;
		movie.code = 200;
		movie.name = "sogol";
		System.out.println(movie.code);
		movie.display();

	}

}
