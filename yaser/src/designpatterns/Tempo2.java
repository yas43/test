package designpatterns;

class Users {
	String name;
	int code;
	String family_name;
	int sectore_number;
	String boss_name;

	public Users() {
		this.name = name;
		this.code = code;
		this.family_name = family_name;
		this.sectore_number = sectore_number;
		this.boss_name = boss_name;

	}

}

class User_builder {
	String name;
	int code;
	String family_name;
	int sectore_number;
	String boss_name;

	User_builder name(String name) {
		this.name = name;
		return this;
	}

	User_builder code(int code) {
		this.code = code;
		return this;
	}

	Users biuld() {

	}

	public class Tempo2 {

		public static void main(String[] args) {

		}

	}
}
