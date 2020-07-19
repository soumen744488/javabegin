class PrimeCal{
	int number,start;
	PrimeCal(int st,int num){
		number = num;
		start = st;
	}
	void printprime(){
		int n,i;
		for(n=start;n<=number;n++){
			for(i=2;i<=n/2;i++){
				if(n%i==0){
					break;
				}
			}
			if(n/2+1==i){
				System.out.println(n);
			}
		}
		
	}
}

public class Prime{
	public static void main(String args[]){
		PrimeCal obj = new PrimeCal(20,50);
		obj.printprime();
	}
}