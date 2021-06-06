import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class REPLESX {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int x=0; x<t; x++) {
			
			int N = scan.nextInt();
			int X = scan.nextInt();
			int P = scan.nextInt();
			int K = scan.nextInt();
			
			List<Integer> numArr = new ArrayList<>();
			
			for(int i=1; i<=N; i++) {
				numArr.add(scan.nextInt());
			}
			
			if(X==getNSmallest(numArr, P)) {
				System.out.println(0);
				continue;
			}
			else {
				if(numArr.contains(X)) {
					int Xth = getNSmallest(numArr, X);
					if(Xth < P && K>P) {
						System.out.println(P-Xth);
						continue;
					}
					
					if(Xth > P && K>P) {
						System.out.println(-1);
						continue;
					}
					
				}				
			}

		}
	
		scan.close();
	}
	
	public static int getNSmallest(List<Integer> numArr, int X) {
		
		Collections.sort(numArr);
		int cnt=0;
		for(int i=1;i<=numArr.size();i++) {
			if(numArr.get(i)==X) {
				return i;
			}
		}
		
		return cnt;
	}

}
