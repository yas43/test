class Student {
	String name;
	int code;

}

class Group {
	String name;
	int code;

	public Group(String name, int code) {
		this.name = name;
	}

	void info() {
		System.out.println("name is " + name);
	}

}

public class This_ {

	public static void main(String[] args) {
//		Student sudent = new Student();
//		sudent.name = "yaser";
//		sudent.code = 1002;
//		System.out.println("student's name is " + sudent.name + " and student's code is " + sudent.code);

		Group group = new Group("IT", 2002);
		System.out.println(group.name);
		group.info();

	}

}
