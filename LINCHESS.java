import java.util.*;

public class LINCHESS {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			
			int N = scan.nextInt();
			long K = scan.nextLong();

			long min = Long.MAX_VALUE;
			long output = (long) -1;
			
			for(int j=0;j<N;j++) {
				long P = scan.nextLong();
				if(K%P==0) {
					
					if(min > K/P) {
						min = K/P;
						output = P;
					}
				}
			}
			
				System.out.println(output);
		}
		
		scan.close();

	}			
}
