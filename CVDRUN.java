import java.util.*;

public class CVDRUN {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			
			int N = scan.nextInt();
			int K = scan.nextInt();
			int X = scan.nextInt();
			int Y = scan.nextInt();
			
			
			boolean flag=false;
			
			int city = (X+K)%N;
			
			if(city == Y) {
				System.out.println("YES");
				continue;
			} else {
				int tempCity = 0;
				X=city;
				while(city!=tempCity) {
					
					tempCity = (X+K)%N;
					
					if(tempCity==Y) {
						System.out.println("YES");
						flag=true;
						break;
					} else {
						X = tempCity;
					}
				}
				
				if(flag) {
					continue;
				} else {
					System.out.println("NO");
				}
				
			}
		}
		
		scan.close();
	}

}
