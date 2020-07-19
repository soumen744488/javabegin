public class Exceptions{
	public static void main(String args[]){
		int a=10,b=-5,c=0,i=0;
		int arr[] = new int[10];
		while(b<=5){
		try{	
			c = a/b;
			arr[i] = c;
		}catch(ArithmeticException e){	
			System.out.println("Exception Occurred "+e);
			arr[i] = -100;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Full ");
			break;
		}finally{
			System.out.println("Inside Finally");
		}
		System.out.println(arr[i]);
		i++;
		b++;
		}
		System.out.println(c);
		System.out.println("Hello");
	} 
}