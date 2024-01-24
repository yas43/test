package designpatterns;

interface Student {
	void info();
}

class B_studebt implements Student {
	@Override
	public void info() {
		System.out.println("implementation of B type student for info method");
	}
}

class C_student implements Student {
	@Override
	public void info() {
		System.out.println("implementation of C type student for info method");
	}
}

public class Temporary {

	public static void main(String[] args) {
		Student my_stdudent = call_student();

	}

	public static Student call_student() {
		return new B_studebt();
	}

}
