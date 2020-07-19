class A{
	int i,j=20;
	A(){
		System.out.println("Inside A's Constructor");
	}
	void method(){
		System.out.println("Inside A's Method");
	}
}
class B extends A{
	int j = 50;
	B(){
		super();
		System.out.println("Inside B's Constructor");
	}
	B(int p){
		System.out.println("Inside B's Constructor Parametersized p is "+p+" J is "+super.j);
	}
	
	void method(){
		System.out.println("Inside B's Method");
	}
	
}
class C extends B{
	int k;
	C(){
		super(5);
		System.out.println("Inside C's Constructor "+super.j);
	}
	void method(){
		super.method();
		System.out.println("Inside C's Method");
	}
}
public class SuperKeyword{
	public static void main(String args[]){
		C obj1 = new C();
		/* Method Overriding and super */
		A obj = new C();
		obj.method();
	}
}