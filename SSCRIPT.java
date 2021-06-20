import java.util.Scanner;

public class SSCRIPT {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			
			int N = scan.nextInt();
			int K = scan.nextInt();
			String str = scan.next();
			if(!str.contains("*")) {
				System.out.println("NO");
				continue;
			} else {
				if(K==1) {
					System.out.println("YES");
					continue;
				} else {
					int cnt=1;
					boolean flag = true;
					for(int j=0;j<(N-1);j++) {
						if(str.charAt(j)=='*' && str.charAt(j+1)=='*') {
							cnt++;
							if(cnt==K) {
								System.out.println("YES");
								flag=false;
								break;
							}
						} else {
							cnt=1;
						}
					}
					if(cnt==1 || flag) {
						System.out.println("NO");
						continue;
					}
				}
			}
		}
		
		scan.close();
	}
}
