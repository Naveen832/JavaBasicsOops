package demo;

interface InterfaceA{
	 void method();
	
}
interface interfaceB{
	void method2();
	
}
class InterfaceC implements InterfaceA,interfaceB{

	
	public void method2() {
		System.out.println("print method2");
		
	}
	
	public void method() {
		System.out.println("print method");
	}

public static void main(String[] args) {
	InterfaceC obj = new InterfaceC();
	obj.method();
	}}