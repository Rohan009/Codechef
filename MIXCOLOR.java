import java.util.*;

public class MIXCOLOR {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
	        int t=scan.nextInt();
	        for(int i=0;i<t;i++){
	        	Set<Integer> set = new HashSet<>();
	        	int n = scan.nextInt();
	        	for(int j=0;j<n;j++) {
	        		set.add(scan.nextInt());
	        	}
	        	System.out.println(n-set.size());
	        }
	        
	    scan.close();
	}

}
