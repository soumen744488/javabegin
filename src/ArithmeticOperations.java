import java.util.*;
import java.lang.Math;
class Arithmetic{
	int a;
	int b;
	Arithmetic(int x,int y){
		this.a = x;
		this.b = y;
	}
	int add(){
		return a+b;
	}
	int sub(){
		return a-b;
	}
	int mul(){
		return a*b;
	}
	float div(){
		return a/b;  
	}
}
public class ArithmeticOperations{
	public static void main(String args[]){
		Arithmetic obj = new Arithmetic(5,2);
		System.out.println("Addition "+obj.add());
		System.out.println("Subtraction "+obj.sub());
		System.out.println("Multiplication "+obj.mul());
		System.out.println("Division "+obj.div());
		System.out.println("Power of 5 and 2 "+Math.pow(5,2));
		System.out.println("Square root of 25 "+Math.sqrt(25));
		System.out.println("floor operation "+Math.floor(-2.69));
		System.out.println("Ceil operation "+Math.ceil(-1.1));
		
	}
}
