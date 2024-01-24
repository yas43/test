package draft2;

public class Temporary005 {

	static int giveRandombetween0_10() {
		double number = Math.random();
		return (int) (10 * number);
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			int num = giveRandombetween0_10();
			System.out.println("i = " + i + "   number = " + num);
		}

	}

}
