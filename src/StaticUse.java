class StaticImpl{
	static float  PI = 3.14f;
	int k = 0;
	
}
public class StaticUse{
	public static void main(String args[]){
		StaticImpl obj = new StaticImpl();
		StaticImpl obj1 = new StaticImpl();
		/*obj.PI = 3.141f;
		System.out.println("PI is for obj "+obj.PI);
		obj1.PI = 3.1416f;
		System.out.println("PI is fro obj1 "+obj1.PI);
		System.out.println("PI is for obj "+obj.PI);*/
		obj.k = 1;
		System.out.println("K for obj "+obj.k);
		System.out.println("K for obj1 "+obj1.k);
		obj.PI = 3.1416f;
		System.out.println("PI for obj "+obj.PI);
		System.out.println("PI for obj1 "+obj1.PI);
		
	}
}