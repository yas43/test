package practice_1;

interface Highschool {
	int student_pup = 500;

	public void teacher();

	public void address();
}

class Teacher implements Highschool {
	String name;
	String lesson;
	String address;
	int code;

	@Override
	public void teacher() {

		System.out.println("every teacher teach a lesson");
	}

	@Override
	public void teacher(String name, String lesson) {
		this.name = name;
		this.lesson = lesson;

		System.out.println("teacher's name is  " + this.name + "  and he/she teach  " + this.lesson);

	}

	@Override
	public void address(int code, String address) {
		this.code = code;
		this.address = address;
		System.out.println("teacher by code : " + this.code + "address is" + this.address);
	}
}

public class Rennes_a {

	public static void main(String[] args) {

	}

}
