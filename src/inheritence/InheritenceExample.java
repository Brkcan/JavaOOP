package inheritence;


public class InheritenceExample extends ParentClass1{
	
	int u;
	
	public void g() {
		System.out.println("g in Inheritence");
	}
	
	public static void main(String[] args) {
		ParentClass1  parentClass1 = new ParentClass1();
		parentClass1.f();
		parentClass1.t = 6;
		
		
		InheritenceExample inheritenceExample = new InheritenceExample();
		System.out.println(inheritenceExample.t = 7);
		System.out.println(inheritenceExample.y = 9);
		
		inheritenceExample.f();
		
		
	}
}
