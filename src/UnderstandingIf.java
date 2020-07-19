class IfExample{
		int x = 5;
		int year = 2400;
		void function(){
				if(x == 6){
						System.out.println("Inside if");
				}
				else if(x == 5){
					System.out.println("Inside else if");
				}
				else{
					    System.out.println("Inside Else");
				}	
		}
		void leap(){
				if(year%400==0){
					System.out.println("Leap Year");
				}
				else{
					if (year%4==0 && year%100!=0){
						System.out.println("Leap Year");
					}
					else{
						System.out.println("Not Leap Year");
					}
				}
		}
		void leapmodified(){
			if (year%400==0 || year%4==0 && year%100!=0)
					System.out.println("Leap Year");
			else
					System.out.println("Not Leap Year");
					
		}
}
public class UnderstandingIf{
	public static void main(String args[]){
		IfExample obj = new IfExample();
		obj.function();
		obj.leap();
		obj.leapmodified();
	}
}