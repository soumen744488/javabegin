public class PatternsNew{
	public static void main(String args[]){
		int n=6,num=1;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				if(i==0 || k==0){
					num=1;
				}
				else{
					num = num*(i-k+1)/k;
				}
				System.out.print(num+" ");	
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		n=4;
		num=1;
		for(int i=0;i<n;i++){
			
			for(int j=0;j<n-i-1;j++){
				System.out.print(" ");
			}
			num = i+1;
			for(int k =0;k<2*i+1;k++){
				System.out.print(num);
				if(k>=(2*i+1)/2)
					num++;
				else
					num--;
			}
			System.out.println();
		}
		
		String name = "KATAPPA";
		for(int i=0;i<name.length();i++){
			System.out.println(name.substring(0,i+1));
		}
		
		
	}
}