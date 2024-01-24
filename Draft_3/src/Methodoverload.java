
class Sum {
	static int add() {
		return 0;
	}

	static int add(int num) {
		return num;
	}

	static int add(int num_1, int num_2) {
		return (num_1 + num_2);
	}

	static int add(int num_1, int num_2, int num_3) {
		return (num_1 + num_2 + num_3);
	}

	static String add(String name_1, String name_2) {
		return (name_1 + name_2);
	}

	static void add(String name, int age) {
		System.out.println("hello " + name + " you are  " + age + " years old");
	}
}

public class Methodoverload {

	public static void main(String[] args) {
//		System.out.println(Sum.add(5));
//		System.out.println(Sum.add());
//		System.out.println(Sum.add(2, 5, 10));
//		System.out.println(Sum.add(100, 200));
		System.out.println(Sum.add("mamad", "motad"));
		Sum.add("hashem", 40);
	}

}
