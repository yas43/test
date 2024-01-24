package package_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Integer getCode() {
//		return code;
//	}
//
//	public void setCode(Integer code) {
//		this.code = code;
//	}

	String name;
	Integer code;

	public Student(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	@Override
	public int compareTo(Student student) {
		if (this.code < student.code)
			return -1;
		if (this.code > student.code)
			return 1;

		else
			return 0;

	}

}

public class Execcise_3 {

	public static void main(String[] args) {
//	in this exercise we try to use comparator and comparable
		// define some objects

		Student student_01 = new Student("yaser", 101);
		Student student_02 = new Student("gisele", 102);
		Student stusdent_03 = new Student("matin", 103);
		Student student_04 = new Student("yashi", 90);
		Student student_05 = new Student("alex", 82);
		Student stusdent_06 = new Student("mimi", 113);

		// define a list and put objects inside
		List<Student> usr_list = new ArrayList<>();
		usr_list.add(student_01);
		usr_list.add(student_02);
		usr_list.add(stusdent_03);
		usr_list.add(student_04);
		usr_list.add(student_05);
		usr_list.add(stusdent_06);

		Collections.sort(usr_list);

		for (Student students : usr_list) {
			System.out.println(students.name);
		}
		// define an array and put objects inside
//		Student[] my_list = new Student[6];
//		my_list[0] = student_01;
//		my_list[1] = student_02;
//		my_list[2] = stusdent_03;
//		my_list[3] = student_04;
//		my_list[4] = student_05;
//		my_list[5] = stusdent_06;
//		System.out.println(Arrays.toString(my_list));

//  define a map using objects

//		Map<Student, Integer> my_map = new HashMap<>();
//		my_map.put(student_01, 1);
//		my_map.put(student_02, 2);
//		my_map.put(stusdent_03, 3);
//		my_map.put(student_04, 4);
//		my_map.put(student_05, 5);
//		my_map.put(stusdent_06, 6);
//		System.out.println(my_map);

	}

}
