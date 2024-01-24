package practice_0_1;

import java.util.LinkedList;
import java.util.List;

class Student implements Comparable<Student> {
	int code;
	String first_name;
	String last_name;
	String gender;
	int age;

	public Student(int code, String firstname, String last_name, String gender, int age) {
		this.code = code;
		this.first_name = firstname;
		this.last_name = last_name;
		this.gender = gender;
		this.age = age;
	}

	void info() {
		System.out.println("student's code is :" + this.code + "\n" + "student's fist_name is :" + this.first_name
				+ "\n" + "student's last_name is :" + this.last_name + "\n" + "student's age is :" + this.age + "\n"
				+ "student's gender is :" + this.gender);
	}

	@Override
	public int compareTo(Student o) {

		return this.age - o.age;
	}
}

public class Exercisecomparable {

	public static void main(String[] args) {
		Student st_01 = new Student(1001, "peter", "band", "male", 37);
		Student st_02 = new Student(1002, "alex", "povel", "male", 26);
		Student st_03 = new Student(1003, "gane", "smooth", "female", 30);
		Student st_04 = new Student(1001, "georg", "silvy", "male", 24);
		Student st_05 = new Student(1002, "ali", "hoffman", "male", 28);
		Student st_06 = new Student(1003, "sara", "pachvala", "female", 31);
		Student st_07 = new Student(1001, "petros", "gomez", "male", 41);
		Student st_08 = new Student(1002, "ani", "pichofskey", "female", 22);
		Student st_09 = new Student(1003, "ganet", "brisu", "female", 36);

		List<Student> my_list = new LinkedList<>();
		my_list.add(st_01);
		my_list.add(st_02);
		my_list.add(st_03);
		my_list.add(st_04);
		my_list.add(st_05);
		my_list.add(st_06);
		my_list.add(st_07);
		my_list.add(st_08);
		my_list.add(st_09);

		my_list.sort(null);

		for (Student students : my_list) {
			System.out.println(students.first_name);
		}
	}

}
