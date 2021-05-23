import java.util.*;

public class ARRGAME {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int x=0; x<t; x++) {
			
			List<Integer> frequency = new ArrayList<>();
			int N = scan.nextInt();
			int cnt=0;
			for(int j=0;j<N;j++)
			{
				int temp = scan.nextInt();
				if(temp==0) {
					cnt++;
				}
				else {
					frequency.add(cnt);
					cnt=0;
				}
			}
			
			if(!frequency.contains(0)) {
				System.out.println("No");
				continue;
			}

			int max = Collections.max(frequency);
			int freq = Collections.frequency(frequency, max);
			
			if(freq==1) {
				if(max%2==0) {
					System.out.println("No");
				} else {
					if(max==1) {
						System.out.println("Yes");
						continue;
					}
					if(containsHigherValue(frequency,freq,max)){
						System.out.println("No");
					}
					else {
						System.out.println("Yes");
					}
				}
			}
			else {
				System.out.println("No");
			}
		}
		scan.close();
	}

	private static boolean containsHigherValue(List<Integer> frequency,int freq, int max) {
		boolean flag = false;
		if(frequency.size()!=0) {
			for(Integer i :frequency) {
				if(i==max) {
					continue;
				}
				if(i>=(max/2+1)) {
					return true;
				}
			}
		}
		return flag;
	}

}
