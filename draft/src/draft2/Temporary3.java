package draft2;

public class Temporary3 {

	enum Size {
		LARG, MEDIUM, SMALL
	}

	public class Draft_demo {

		static Size result_1 = Size.SMALL;
		static Size result_2 = Size.MEDIUM;
		static Size result_3 = Size.LARG;

		static Size mymethod(String a) {
			try {

			} catch (Exception e) {

			}
			if (a.equals("small")) {
				return result_1;
			}
			if (a.equals("medium")) {
				return result_2;
			}
			if (a.equals("larg")) {
				return result_3;
			}
			return null;

		}
	}

	public static void main(String[] args) {

	}

}
