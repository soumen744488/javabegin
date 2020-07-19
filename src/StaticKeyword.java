class UnderstandingStatic{
	static int num = 0;
	
	static int square(){
		return num*num;
	}
}
public class StaticKeyword{
	public static void main(String args[]){
		UnderstandingStatic.num = 5;
		System.out.println("Square is "+UnderstandingStatic.square());
	}
}