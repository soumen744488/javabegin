import java.util.Scanner;
public class NameAbbr{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String name = (sc.nextLine()).trim(); //alternative to next line
		//name = name.trim();
		int sp = 0,i;
		for(i=0;i<name.length();i++){
			if(name.charAt(i)==' '&& name.charAt(i+1)!=' ')
				sp++;
		}
		if(sp>0){
			System.out.print(name.charAt(0));
			for(i=1;i<name.length() && sp>0;i++){
				if(name.charAt(i)==' ' && name.charAt(i+1)!=' '){
				System.out.print(" "+name.charAt(i+1));
				sp--;
				}
			}
			System.out.print(name.substring(i+1,name.length()));
		}else{
			System.out.println(name);
		}
	}
}