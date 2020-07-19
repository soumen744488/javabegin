import java.util.*;
public class Array{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		/*int arr[] = new int[10];
		for(int i=0;i<3;i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}*/
		int arr2[][] = new int[2][2];
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[i].length;j++){
					arr2[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[i].length;j++){
					System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
	}
}