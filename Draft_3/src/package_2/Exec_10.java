package package_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// in this exercise try implementing compare interface by using an anonymous class

class Product {
	String name;
	Integer code;

	public Product(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

}

public class Exec_10 {

	public static void main(String[] args) {
//	create several object from Product class and put them in a list

		List<Product> pro_list = new ArrayList<>();
		pro_list.add(new Product("table", 203));
		pro_list.add(new Product("pc", 310));
		pro_list.add(new Product("curtin", 102));

		Comparator<Product> customize_sort = new Comparator<Product>() {

			@Override
			public int compare(Product first_pro, Product second_pro) {
				if (first_pro.code < second_pro.code)
					return 1;
				if (first_pro.code > second_pro.code) {
					return -1;
				} else
					return 0;
			}
		};

		Collections.sort(pro_list, customize_sort);

		for (Product poducts : pro_list) {
			System.out.println("products name is " + poducts.name + " and products code is " + poducts.code);
		}
	}

}
