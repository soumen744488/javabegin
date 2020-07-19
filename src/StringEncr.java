import java.util.Scanner;
public class StringEncr{
	static int character(int num){
		if(num<=26){
			return num;
		}
		return character(num-26);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		// write your logic here
		int len = inp.length();
		String s = "";
		char c;
		for(int i=0;i<inp.length();i++){
				c = inp.charAt(i);
				if((c+len)>90){
					c =(char)(64+character((c+len)-90));
				}
				else{
				c = (char)(c+len);
				}
				s = s+c;
				len--;
		}
		System.out.println(s);
	}
}