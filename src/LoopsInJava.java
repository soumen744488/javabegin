public class LoopsInJava{
	public static void main(String args[]){
		int i,j;
		for(i=0;i<10;i++){
			System.out.println(i);
		}
		System.out.println("I is "+i);
		for(i=5,j=0;i>0 && j<5;i--,j++){
			System.out.println(i+" "+j);
		}
	}
}
/*
Q1)           *                          0    4     1
			*   *						 1    3     2
		 *    *    *					 2    2     3
	   *	*	*	  *                  3    1     4
	 *   *    *    *     *               4    0     5
	 
	 int n = 5;
	 for (i = 0;i < n;i++){
		 
		 for(j=0; j<4-i;j++)
			 print (" ");
		 for(k = 0;k<1+i;k++)
			 print("* ");
		 
		 print("\n");
		 
	 }

*/