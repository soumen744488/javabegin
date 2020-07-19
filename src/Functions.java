import java.lang.Math;
class Method{
	
		int method(){
			return 1;
		}
		/*float method(){
			return 1.0f;
		}*/		//Not possible in java but possible in c++
		int method(int a){
			return a;
		}
		double method(int a,int b){
			return Math.pow(a,b);
		}
		float method(int a,int b){
			return Math.pow(a,b);
		}
	
}

public class Functions{
	public static void main(String args[]){
		Method obj = new Method();
		int num1 = 5 , num2 = 1;
		if(num2==0){
			System.out.print(obj.method());
		}
		else if(num2==1){
			System.out.print(obj.method(num1));
		}
		else{
			System.out.print(obj.method(num1,num2));
		}
		
	}
}


