import java.util.*;
import java.util.Scanner;

public class WATMELON {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			
			int N = scan.nextInt();
			int num_sum=0;
			for(int j=0; j<N; j++) {
				int temp = scan.nextInt();
				num_sum+=temp;
			}
			
			int max_sum= (N*(N+1))/2;
			
			if(num_sum==0) {
				System.out.println("YES");
				continue;
			}
			
			if(num_sum>0 && num_sum <= max_sum) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
		scan.close();
	}

}
