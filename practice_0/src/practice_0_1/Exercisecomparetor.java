package practice_0_1;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Exercisecomparetor {

	public static void main(String[] args) {
		Student st_01 = new Student(1001, "peter", "band", "male", 37);
		Student st_02 = new Student(1002, "alex", "povel", "male", 26);
		Student st_03 = new Student(1003, "gane", "smooth", "female", 30);
		Student st_04 = new Student(10010, "georg", "silvy", "male", 24);
		Student st_05 = new Student(101, "ali", "hoffman", "male", 28);
		Student st_06 = new Student(13, "sara", "pachvala", "female", 31);
		Student st_07 = new Student(121, "petros", "gomez", "male", 41);
		Student st_08 = new Student(1042, "ani", "pichofskey", "female", 22);
		Student st_09 = new Student(850, "ganet", "brisu", "female", 36);

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

		Comparator<Student> cum = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.code > o2.code)
					return 1;
				if (o1.code < o2.code)
					return -1;
				return 0;

			}
		};

		my_list.sort(cum);
		for (Student students : my_list) {
			System.out.println(students.last_name);
		}

	}

}
