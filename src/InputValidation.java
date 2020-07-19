import java.util.*;

public class InputValidation{
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			String name = "";
			int roll = -5;
			float marks = -100f;
			while(true){
				try{
					if(name.length()==0){
						System.out.println("Enter Name");
						name = sc.next();
					}
					if(roll<0){
						System.out.println("Enter Roll");
						roll = sc.nextInt();
					}
					if(marks==-100f){
						System.out.println("Enter Marks");
						marks = sc.nextFloat();
					}
					break;
				}catch(InputMismatchException e){
					System.out.println("Invalid Input Try Again...."+e);
					sc.next();
				}
			}
			System.out.println(name+"\n"+roll+"\n"+marks);
	}
}