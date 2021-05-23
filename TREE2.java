import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TREE2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int x=0; x<t; x++) {
			
			List<Long> stick = new ArrayList<>();
			int N = scan.nextInt();
			for(int j=0;j<N;j++)
			{
				Long temp = scan.nextLong();
				if(temp==0) {
					continue;
				} else {
					stick.add(temp);
				}
			}
			
			if(stick.isEmpty()) {
				System.out.println(0);
			} else {
				Set<Long> tempSet = new HashSet<Long>(stick); 
				System.out.println(tempSet.size());
			}
			
		}
		scan.close();
	}	
}
