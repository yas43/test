package package_2;

public class Exercise_ {

	public static void main(String[] args) {
//		in this exercise we try to implant an interface 1_by using a class which implant our interface 2_by using an anonymous class
//		defining an interface

		interface my_interface {
			void meth_1();

			int meth_2();

			String meth_3();
		}

//		class my_class implements my_interface {
//			@Override
//			public void meth_1() {
//				System.out.println("this is implamention of meth_1");
//			}
//
//			@Override
//			public int meth_2() {
//				return 10;
//			}
//
//			@Override
//			public String meth_3() {
//				return "hello every body";
//			}
//		}
//
//		my_interface obj = new my_class();
//		obj.meth_1();
//		System.out.println(obj.meth_2());
//		System.out.println(obj.meth_3());

		my_interface object = new my_interface() {
			@Override
			public void meth_1() {
				System.out.println("im yaser");

			}

			@Override
			public int meth_2() {

				return 100;
			}

			@Override
			public String meth_3() {

				return "matin";
			}
		};

		object.meth_1();

	}

}
