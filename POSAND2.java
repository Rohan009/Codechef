
import java.util.*;

public class POSAND2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int x=0; x<t; x++) {
			
			int N = scan.nextInt();
			
			StringBuilder output = new StringBuilder();
		
			if(N!=1 && N%2==0 && isPowerOfTwo(N)) {
				System.out.println(-1);
				continue;
			} else {
				
				if(N==1) {
					System.out.println(1+" ");
					continue;
				}
				
				int max=1;
				if(N>=3) {
					output.append(2+" "+3+" "+1+" ");
					max=4;
				}
				while(max<=N) {
						
					if((max%2==0 && isPowerOfTwo(max))) {
						output.append((max+1)+" "+max+" ");
						max+=2;
						continue;
					} else {
						output.append(max+" ");
							max++;
							continue;
					}					
				}
			}
			
			System.out.println(output);

		}

		scan.close();
	}
	
	public static boolean isPowerOfTwo(int n)
	{	  
		 return (int)(Math.ceil((Math.log(n) / Math.log(2))))  
		            == (int)(Math.floor(((Math.log(n) / Math.log(2))))); 
	}

}
