package practice_1;
interface Highschool_a {
	String sch_name = "a_high_school";
	int student_pup = 500;

	public void teacher();

	public void address();
}

interface Highschool_b {
	String sch_name = "b_high_school";
	int student_pup = 600;

	public void teacher();

	public void address();
}

interface Highschool_c {
	String sch_name = "c_high_school";
	int student_pup = 400;

	public void teacher();

	public void address();
}

class Teacher implements Highschool_a, Highschool_b, Highschool_c {
	String name;
	String lesson;
	String address;
	int code;

	public Teacher(String name, String lesson, String address, int code) {
		this.name = name;
		this.lesson = lesson;
		this.address = address;
		this.code = code;
	}

	@Override
	public void teacher() {

		System.out.println("teacher's name is  " + this.name + "  and he/she teach  " + this.lesson + "in the ");

	}

	@Override
	public void address() {
		System.out.println("teacher by code : " + this.code + "address is" + this.address);
	}
}

public class Rennes {

	public static void main(String[] args) {

		Highschool_a olga = new Teacher("olga", "french", "1 rue de condate", 10001);
		Highschool_b marry = new Teacher("mary", "math", "15 chapel de fourge ", 10002);
		Highschool_c john = new Teacher("john", "chemistry", "10 place de kenedy", 10003);
		olga.teacher();
		marry.teacher();
		john.teacher();

	}

}
