final class A{
	final int b = 1;
}
class B extends A{ // this is error you cannot inherit final class
	
}
class C {
	final void method(){
		System.out.println("Inside Class C Method");
	}
}
class D extends C{
	void method(){ // this is error cannot override this method
		System.out.println("Inside Class D Method");
	}
}
public class TheFinalKeyword{
	public static void main(String args[]){
		A obj = new A();
		//obj.b = 5;  //error final variable cannot be updated
	}
}