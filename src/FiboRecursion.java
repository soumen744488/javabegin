class Fibonacci{	
	int fibo(int num){
		if (num==1)
			return 0;
		else if(num==2)
			return 1;
		else
			return fibo(num-1)+fibo(num-2);
	}
}
public class FiboRecursion{
	public static void main(String args[]){
		Fibonacci obj = new Fibonacci();
		for(int n=1;n<=10;n++)
			System.out.print(obj.fibo(n)+" ");
	}
}