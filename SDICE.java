import java.util.Scanner;

public class SDICE {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			
			long n = scan.nextLong();
			long ndiv = n/4;
			long nrem = n%4;
			long count=0;
			if(n==1) {
				count=20;
			} else if(n<4) {
				count = (n*21)-(6*(n-1));
			} else {
				if(nrem==0) {
					count+=4*11*ndiv+4*4;
				} else if(nrem==1) {
					count+=4*11*ndiv+3*4+20;
				} else if(nrem==2) {
					count+=4*11*ndiv+2*4+2*18;
				} else if(nrem==3) {
					count+=4*11*ndiv+4+2*18+15;
				}
			}
			
			System.out.println(count);
		}
		scan.close();
	}
}
