
import java.util.*;

public class CHECHOC {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			
			int N = scan.nextInt();
			int M = scan.nextInt();
			int X = scan.nextInt();
			int Y = scan.nextInt();
			int temp = X;
			long output=0;
			
			if((double)X>(double)(Y/2)) {
				
				if(M%2==0) {
					
					output = N*Y*(M/2);
				}
				else {
					if(X>=Y) {
						temp = Y;
						output = N * (Y * ((M-1)/2) + temp);
					}
					else {
						temp = X;
						output = N * (Y * ((M-1)/2) + temp);
					}
					
				}
			}
			else {
				output = N*M*X;
			}
			

			System.out.println(output);
		}
		scan.close();
	}

}
