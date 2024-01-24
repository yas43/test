package draft2;

public class Draft {

	public static void main(String[] args) {
		int k = 5;
		int j = 3;
		int i = 0;
		while (i < 4) {
			if (i == 3) {
				System.out.println("you are suspend");
				return;
			}
			if (k == j) {
				System.out.println("wellcom to your space ");
				break;
			}
			System.out.println("reenter your password");

			i++;
		}

		System.out.println("here is continue of progrom");
	}

}
