class Factorial{
	
	int fact(int num){
		if(num==1)
			return 1;
		
		return num*fact(num-1); 
	}
}
public class FactorialRecursion{
	public static void main(String args[]){
		Factorial obj = new Factorial();
		System.out.println("Factorial "+obj.fact(5));
	}
}