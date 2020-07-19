public class ProgTest2{
	public static void main(String args[]){
		String romanLit[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int romanEqiv[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		int num = 105258;
		int i=0;
		String s="";
		while(num>0){
			if(num>=romanEqiv[i]){
				s+=romanLit[i];
				num-=romanEqiv[i];
			}
			else
				i++;
		}
		System.out.println("Roman Is "+s);
	}
}