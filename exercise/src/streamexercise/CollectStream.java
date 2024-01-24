package streamexercise;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
	String name;
	Integer code;

	public Student(String name, Integer code) {
		this.name = name;
		this.code = code;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
}

public class CollectStream {

	public static void main(String[] args) {
		Student student_1 = new Student("yaser", 1002);
		Student student_2 = new Student("gigi", 1050);
		Student student_3 = new Student("chocho", 7000);

		List<Student> student_list = new LinkedList<>();
		student_list.add(student_1);
		student_list.add(student_2);
		student_list.add(student_3);
		Comparator<Student> comparetor = (o1, o2) -> o1.code > o2.code ? -1 : 0;
		Stream<Student> stream_student = student_list.stream().sorted(comparetor);
//		stream_student.forEach(t -> System.out.println(t.name));
		Function<Student, String> key_mapper = t -> t.name;
		Function<Student, Integer> value_mapper = r -> r.code;
		Map<String, Integer> std_lst = stream_student.collect(Collectors.toMap(key_mapper, value_mapper));
////		std_lst.forEach((k, v) -> System.out.println(std_lst));

//		System.out.println(std_lst);

	}

}
