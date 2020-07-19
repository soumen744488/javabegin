class Father{
	protected int i;
	Father(){
		i = 5;
		System.out.println("Inside Father's Constructor");
	}
}
class Mother extends Father{
	public int j;
	Mother(){
		j = 2*i;
		System.out.println("Inside Mother's Constructor");
	}
}
class Child extends Mother{
	int k;
	Child(){
		k = i+j;
		System.out.println("Inside Child's Constructor");
	}
}

public class InheritanceExample{
	public static void main(String args[]){
		Child obj = new Child();
		System.out.println(obj.k);
		System.out.println(obj.i);
		Child ch;
		Father fa;
		ch = new Father(); //not possible
		fa = new Child();
	}
}