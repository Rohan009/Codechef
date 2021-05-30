import java.util.*;

public class GCDOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			
			int N = scan.nextInt();
			boolean flag=false;
			for(int j=1; j<=N; j++) {
				int temp = scan.nextInt();
				if(j==temp) {
					continue;
				}
				else {
					
					if(temp!=j && GCD(j,temp)==temp) {
						continue;
					}
					else {
						flag=true;
					}
				}
			}
			
			if(flag) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
		scan.close();
	}
	
	private static int GCD(int n1, int n2) {
		
		 int gcd = 1;

	        for(int i = 1; i <= n1 && i <= n2; ++i)
	        {
	            if(n1 % i==0 && n2 % i==0)
	                gcd = i;
	        }
	    return gcd;
	}

}
