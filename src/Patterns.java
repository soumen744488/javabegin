import java.util.Scanner;
public class Patterns{
	public static void main(String args[]){
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("1) Pattern 1 ");
		System.out.println("2) Pattern 2");
		System.out.println("3) Pattern 3");
		System.out.println("4) Pattern 4");
		System.out.println("5) Pattern 5");
		System.out.println("6) Pattern 6");
		System.out.println("7) Pattern 7");
		System.out.println("Enter Your choice");
		ch = sc.nextInt();
		int n;
		switch(ch){
			
				case 1: System.out.println("Enter No of Lines");
						n = sc.nextInt();
						for (int i=0;i<n;i++){
							for(int j=0;j<n-i;j++){
								System.out.print("* ");
							}
							System.out.println();
						}
						break;
				case 2: System.out.println("Enter No of Lines");
						n = sc.nextInt();
						for (int i=0;i<n;i++){
							for(int j=0;j<n-i-1;j++){
								System.out.print(" ");
							}
							for(int k=0;k<1+i;k++){
								System.out.print("*");
							}
							System.out.println();
						}
						break;
				case 3: System.out.println("Enter No of Lines");
						n = sc.nextInt();
						for(int i=0;i<n/2+1;i++){
							for (int j=0;j<(n/2)-i;j++){
								System.out.print(" ");
							}
							for(int k=0;k<1+i;k++){
								System.out.print("* ");
							}
							System.out.println();
						}
						for(int i=0;i<n/2;i++){
							for (int j=0;j<1+i;j++){
								System.out.print(" ");
							}
							for(int k=0;k<(n/2)-i;k++){
								System.out.print("* ");
							}
							System.out.println();
						}
						break;
				case 4: System.out.println("Enter No of Lines");
						n = sc.nextInt();
						for (int i=0;i<n/2+1;i++){
							for (int j=0;j<(n/2)+1-i;j++){
								System.out.print("* ");
							}
							for (int k=0;k<(4*i);k++){
								System.out.print(" ");
							}
							for (int j=0;j<(n/2)+1-i;j++){
								System.out.print("* ");
							}
							System.out.println();
						}
						for (int i=0;i<n/2;i++){
							for (int j=0;j<i+2;j++){
								System.out.print("* ");
							}
							for (int k=0;k<4*(n/2-1)-4*i;k++){
								System.out.print(" ");
							}
							for (int j=0;j<i+2;j++){
								System.out.print("* ");
							}
							System.out.println();
						}
						break;
				case 5: System.out.println("Enter No of Lines");
						n = sc.nextInt();
						int j;
						for(int i=0;i<n/2+1;i++){
							for (j=65;j<65+(n/2+1)-i;j++){
								System.out.printf("%c ",j);
							}
							for (int k=0;k<4*i-2;k++){
									System.out.print(" ");
							}
							for (int l=j-1;l>=65;l--){
								if(i==0 && l==j-1) continue;
								System.out.printf("%c ",l);
							}
							System.out.println();
						}
				
			
		}
	} 
}
/*
* * * * *
* * * *
* * * 
* * 
*  

        *
      * *
    * * *	 
  * * * *
* * * * *

         *
		* *
	   * * *
	  * * * *
	 * * * * *
      * * * *	 
	   * * *
	    * *
		 *
		 
* * * * * * * * * *			0
* * * * ----* * * *			4
* * * --------* * *			8
* * ------------* *			12
* ----------------*			16
* * ------------* *			12     4*(n/2-1)
* * * --------* * *			8
* * * *     * * * *			4
* * * * * * * * * *			0

A B C D E F G F E D C B A		0
A B C D E F --F E D C B A		2
A B C D E ------E D C B A       6
A B C D	----------D C B A      10
A B C --------------C B A      14
A B	------------------B A      18
A ----------------------A      22
A B					  B A
A B C				C B A
A B C D			  D C B A
A B C D E	    E D C B A
A B C D E F   F E D C B A
A B C D E F G F E D C B A


1
1 2
1 2 3
1 2 3 4
1 2 3 4 5


1
2 3
4 5 6
7 8 9 10

15 14 13 12 11
10 9 8 7
6 5 4
3 2
1

*/
