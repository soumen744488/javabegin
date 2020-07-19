public class StaticBlock{
	static int i;
	static{
		i = 5000;
		System.out.println("This is inside Static block");
	}
	public static void main(String args[]){
		System.out.println("This is inside Main "+i);
	}
}