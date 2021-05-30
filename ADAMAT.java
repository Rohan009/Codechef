import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ADAMAT {
	
	private static int[][] matrix = new int[1][1];

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int x=0; x<t; x++) {
			
			int N = scan.nextInt();
			matrix = new int[N][N];
			for(int j=1;j<=N;j++)
			{
				for(int k=1;k<=N;k++) {
					matrix[j][k] = scan.nextInt();
				}
			}
			int count=0;
			for(int i=1;i<=N;i++)
			{
				for(int j=1;j<=N;j++) {
					
					if(i==1 && j==1) {
						continue;
					}
					
					if(matrix[i][j]!=(i-1)*N+j) {
						if(matrix[i][j]==(i-1)*N+j+3) {
							transposeMatrix(j-1,matrix,N);
							count++;
						} else {
							transposeMatrix(j-1,matrix,N);
							count+=2;
						}
					}
				}
			}
			
		}
	}

	private static void transposeMatrix(int L, int[][] matrix, int N) {
		
		int[][] transposeMatrix = new int[N][N];
				
		 for (int i = 0; i < L; i++) 
	        { 
	            for (int j = 0; j < L; j++) {
	            	transposeMatrix[i][j] = matrix[j][i]; 
	            }
	        } 
		 
		 matrix = transposeMatrix;
	}
	
	

}
