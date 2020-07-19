import java.util.Scanner;
public class UnderstandingScanner{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		int i;
		float f;
		double d;
		char c;
		String s;
		
		i = sc.nextInt();
		System.out.println("I is "+i);
		f= sc.nextFloat();
		System.out.println("f is "+f);
		d = sc.nextDouble();
		System.out.println("d is "+d);
		s = sc.next();
		System.out.println("S is "+s);
		sc.nextLine();
		s = sc.nextLine();
		System.out.println("S is "+s);
		c = sc.next().charAt(0);
		System.out.println("C is "+c);
	} 
}





