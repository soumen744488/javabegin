import java.util.Scanner;
public class StringOccurances{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[26];
		String s = sc.next();
		
		for (int i=0;i<s.length();i++){
			arr[s.charAt(i)-97]++;
		}
		for (int i=0;i<s.length();i++){
			if(arr[i]>0)
				System.out.println((char)(97+i)+" "+arr[i]);
		}
	}
}