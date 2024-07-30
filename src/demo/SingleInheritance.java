package demo;

class ParentClass {
	void Pdemo() {
		System.out.println("Parent class is printed");
	}
}

class ChildClass extends ParentClass {
	void Cdemo() {
		System.out.println("Cclass class is printed");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		ChildClass CC = new ChildClass();
		CC.Cdemo();
		CC.Pdemo();
	}
}
