package designpatterns;

class Product_builder {
	String name;
	String shellve;
	int code;
	int price;

	static class builder {
		String name;
		String shellve;
		int code;
		int price;

		builder name(String name) {
			this.name = name;
			return this;
		}

		builder shellve(String shellve) {
			this.shellve = shellve;
			return this;
		}

		builder code(int code) {
			this.code = code;
			return this;
		}

		builder price(int price) {
			this.price = price;
			return this;
		}

	}

	public Product_builder(builder my_pro) {
		this.name = my_pro.name;
		this.shellve = my_pro.shellve;
		this.code = my_pro.code;
		this.price = my_pro.price;
	}
}

public class Tempo3 {
	public static void main(String[] args) {

		Product_builder.builder pro = new Product_builder.builder();
		pro.code = 123;
		pro.shellve = "my_shellves";
		System.out.println(pro.name);

	}

}
