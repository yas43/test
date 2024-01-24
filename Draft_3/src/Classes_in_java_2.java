class HR {
	String sector;
	int code;

	void president(String name) {
		System.out.println("the president of this sector is " + name);
	}
}

class Personnell {
	String id;
	int code;

	static void info() {
		System.out.println("the personnall information is");
	}

}

public class Classes_in_java_2 {

	public static void main(String[] args) {

		HR hr = new HR();
		System.out.println(hr.code);
		System.out.println(hr.sector);
		hr.president("ghader");
		Personnell.info();

	}

}
