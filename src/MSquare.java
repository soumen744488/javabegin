public class MSquare{
	public static void main(String args[]){
			int num=1,row,col,rowp,colp;
			int n = 5;
			int arr[][] = new int[n][n];
			row = 0;
			col= n/2;
			while(num<=n*n){
				arr[row][col] = num++;
				rowp=row;
				colp=col;
				row--;
				col++;
				if(row<0)	
					row = n-1;
				if(col==n)
					col=0;
				if(arr[row][col]!=0){
					row= rowp+1;
					col=colp;
				}
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}	
					
	}
}