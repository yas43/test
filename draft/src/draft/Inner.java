package draft;

class Cars {
	String Name;

	Cars(String Name) {
		this.Name = Name;

	}

	class Tiba {
		private String model;

		Tiba(String model) {
			this.model = model;
		}

		void presentaion() {
			if (Cars.this.Name.equals("benz"))
				System.out.println("the model is " + model);
			else {
				System.out.println("this is not very good modele");
			}
		}
	}

	void info() {
		System.out.println("the name of car is " + Name);
	}
}

public class Inner {

	public static void main(String[] args) {
		Cars my_car = new Cars("audi");
		// Tiba my_tiba = my_car.new Tiba("321");
		Cars.Tiba r_tiba = my_car.new Tiba("451");
		my_car.info();
		r_tiba.presentaion();

	}

}
