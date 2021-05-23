import java.util.*;

public class CHEFNWRK {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int x=0; x<t; x++) {
			
			int N = scan.nextInt();
			int K = scan.nextInt();
			int[] arr = new int[N];
			for(int j=0;j<N;j++)
			{
				arr[j] = scan.nextInt();
			}
			
			System.out.println(getResult(arr,N,K));
			
			
			}
		scan.close();
		}

	private static int getResult(int[] arr, int N, int K) {
			
		int step = 1;
			if (arr[0] > K) {
				return -1;
			} else {
				if (arr.length == 1) {
					return 1;	
				}
			}
		

		int tempSum = 0;
 		for (int i = 0; i < N; i++) {
			tempSum = tempSum + arr[i];
			if (tempSum <=K) {
				continue;
			} else {
				step++;
				tempSum = arr[i];
				if(tempSum > K) {
					return -1;
				}
			}
				
		}
		return step;
	}

}
