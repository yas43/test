package designpatterns;

//Product interface
interface Product {
	void display();
}

//ConcreteProductA
class ConcreteProductA implements Product {
	@Override
	public void display() {
		System.out.println("Concrete Product A");
	}
}

//ConcreteProductB
class ConcreteProductB implements Product {
	@Override
	public void display() {
		System.out.println("Concrete Product B");
	}
}

//Creator interface
interface Creator {
	Product createProduct();
}

//ConcreteCreatorA
class ConcreteCreatorA implements Creator {
	@Override
	public Product createProduct() {
		return new ConcreteProductA();
	}
}

//ConcreteCreatorB
class ConcreteCreatorB implements Creator {
	@Override
	public Product createProduct() {
		return new ConcreteProductB();
	}
}

public class Ex2 {
	public static void main(String[] args) {
		// Using Factory Method of ConcreteCreatorA to create ConcreteProductA
		Creator creatorA = new ConcreteCreatorA();
		Product productA = creatorA.createProduct();
		productA.display();

		// Using Factory Method of ConcreteCreatorB to create ConcreteProductB
		Creator creatorB = new ConcreteCreatorB();
		Product productB = creatorB.createProduct();
		productB.display();
	}
}
