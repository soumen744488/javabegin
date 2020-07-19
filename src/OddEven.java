public class OddEven{
	public static void main(String args[]){
			
			/*for(int i=1;i<=100;i++){
				if (i%2==0)
					System.out.println(i);
				
			}
			for(int i=1;i<=100;i++){
				if (i%2!=0)
					System.out.println(i);
				
			}*/
			int input = 30;
			int n=input/2;
			for(int i =1;i<=input;i++){
				if(i<=(input/2)){
					System.out.println(2*i);
				}
				else{
					System.out.println(i-(n--));
				}
			}
	
	}
}