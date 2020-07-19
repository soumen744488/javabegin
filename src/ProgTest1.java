import java.util.Scanner;
public class ProgTest1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		int min = 0,max = 0;
		//StringBuilder sb = new StringBuilder();
		String s="";
		for(int i=0;i<num1.length();i++){
			if(num1.charAt(i)!='8'){
				//sb.append(num1.charAt(i));
				s+=num1.charAt(i);
			}
			else{
				//sb.append("3");
				s+="3";
			}
		}
		//System.out.println(sb.toString());
		System.out.println(s);
		min += Integer.parseInt(s);
		s = "";
		for(int i=0;i<num2.length();i++){
			if(num2.charAt(i)!='8'){
				//sb.append(num1.charAt(i));
				s+=num2.charAt(i);
			}
			else{
				//sb.append("3");
				s+="3";
			}
		}
		//System.out.println(sb.toString());
		System.out.println(s);
		min += Integer.parseInt(s);
		System.out.println("Minimum Sum Is "+min);
	}
}