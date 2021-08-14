import java.util.Scanner;

public class KAVGMAT {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int x=0; x<t; x++) {
			
			int n = scan.nextInt();
			int m = scan.nextInt();
			long k = scan.nextInt();
			
			long[][] arr = new long[n+1][m+1];
			
			for(int i=0;i<=n;i++) {
				for(int j=0;j<=m;j++) {
					if(i==0 || j==0) {
						arr[i][j]=0;
					} else {
						arr[i][j] = scan.nextLong();
					}
				}
			}
			
			for(int i=0;i<=n;i++) {
				double mat = 0;
				for(int j=0;j<=m;j++) {
					arr[i][j]+=mat;
					mat=arr[i][j];
				}
			}
			
			for(int i=0;i<=m;i++) {
				double mat = 0;
				for(int j=0;j<=n;j++) {
					arr[j][i]+=mat;
					mat=arr[j][i];
				}
			}
			
			int min = Math.min(m, n);
			long count = 0;
			
			for(int i=1;i<=min;i++) {
				for(int j=i;j<=n;j++) {
					for(int l=i;l<=m;l++) {
						if((arr[j][l]+arr[j-i][l-i]-arr[j][l-i]-arr[j-i][l])/(i*i)>=k) {
							count++;
						}
					}
				}
			}
			
			System.out.println(count);
			
		}
		scan.close();
	}

}
