import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ELOMAX {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int x=0; x<t; x++) {
			
			int N = scan.nextInt();
			int M = scan.nextInt();
			
			List<List<Integer>> players = new ArrayList<>();
			
			for(int i=0;i<N;i++) {
				List<Integer> tempList = new ArrayList<>();
				tempList.add(scan.nextInt());
				
				players.add(tempList);
			}
			
			for(int i=0;i<N;i++) {
				int score = players.get(i).get(0);
				players.set(i, new ArrayList<Integer>(0));
				for(int j=0;j<M;j++) {
					score = score + scan.nextInt();
					players.get(i).add(score);
				}
			}
			
			int rank = 0;
			int output=0;
			List<List<Integer>> rankList = new ArrayList<>();

			for(int i=0;i<N;i++) {
				
				int max = Collections.max(players.get(i));
				int rating = players.get(i).indexOf(max);
				
				for(int j=0;j<M;j++) {
					
				}
			}
			
		}	
	}

}
