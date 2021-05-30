import java.util.*;

public class CHEFEZQ {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			
			long N = scan.nextInt();
			long Q = scan.nextInt();
			long[] queries = new long[(int) N+1];
			for(int j=1; j<=N; j++) {
				queries[j] = scan.nextLong();
			}
			
			long temp = 0;
			long query = 0;
			boolean isReturn = false;
			for(int j=1; j<=N; j++) {
				
				query = queries[j] + temp;	
				
				long leftQ = query - Q;
				
				if(leftQ<0) {
					System.out.println(j);
					isReturn = true;
					break;
				}
				else {
					temp = leftQ;
				}
			}
			
			if(isReturn) {
				continue;
			} else {
				System.out.println(N+(temp/Q)+1);
			}
			
			
		}
		scan.close();
	}

}
