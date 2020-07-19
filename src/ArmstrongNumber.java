import java.lang.Math;
class Armstrong{
	int number;
	Armstrong(int num){
		number = num;
	}
	void printarms(){
		int n,ld,arm,temp,count=3;
		for (n=1;n<=number;n++){
			temp = n;
			arm =0;
			if(n==(int)Math.pow(10,count)){
				count++;
			}
				while(temp>0){
				ld =  temp%10;
				arm = arm + (int) Math.pow(ld,count);
				temp = temp/10;
				}
			if(arm==n)
				System.out.println(n);				
		}
	}
}
public class ArmstrongNumber{
	public static void main(String args[]){
		Armstrong obj = new Armstrong(100000);
		obj.printarms();
	}
}