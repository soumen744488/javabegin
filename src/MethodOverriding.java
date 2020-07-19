class First{
	
	void method(){
		System.out.println("I'm The method of First ");
	} 
}
class Second extends First{
	
	void method(){
		System.out.println("I'm The method of Second ");
	}
}
class Third extends Second{
	
	void method(){
		System.out.println("I'm The method of Third ");
	}
}
public class MethodOverriding{
	public static void main(String args[]){
		Third obj = new Third();
		obj.method();
		First obj2 = new Third();
		obj2.method();
		First obj3 = new Second();
		obj3.method();
		First obj4 = new First();
		obj4.method();
	}
}

