class MyClass{
	int i;
	float j;
	/*double k;
	char c;
	boolean b;
	String s;
	long l;*/
	/*MyClass(){
		i = 300;
		j = 2.53f;
		k = 7.256933;
		c = 'a';
		b = true;
		s = "Hello";
		l = 5214693;
		
	}*/
	//parameterized constructor
	MyClass(int a,float b){
		i =a;
		j = b;
	}
	
	
}

public class JavaClasses{
	public static void main(String args[]){
		//Object Instantiation
		MyClass obj = new MyClass();
		System.out.println(obj.i);
		System.out.println(obj.j);
		/*System.out.println(obj.k);
		System.out.println(obj.c);
		System.out.println(obj.b);
		System.out.println(obj.s);
		System.out.println(obj.l);*/
		MyClass obj2 = new MyClass(5,2.36f);
		System.out.println(obj2.i);
		System.out.println(obj2.j);
		
		
		
		
		
		
		
		
	}
	
}