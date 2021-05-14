import java.util.*;

public class SKMP {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			
			String K = scan.next();
			StringBuilder str = new StringBuilder(K);
			String P = scan.next();
			
			if(str.length()==P.length()) {
				System.out.println(P);
				continue;
			}
			
			for(int j=0;j<P.length();j++) {
				
				int index = str.indexOf(String.valueOf(P.charAt(j)));
				str.deleteCharAt(index);
			}
			

			char[] ar = str.toString().toCharArray();
			Arrays.sort(ar);
			String sortedStr = String.valueOf(ar);
			
			str.setLength(0);
			int k = 0;
			while(sortedStr.charAt(k) <= P.charAt(0) ) {
				k++;
				if(k==sortedStr.length()) {
					break;
				}
			}
			
			str.append(sortedStr.substring(0, k)+P+sortedStr.substring(k, sortedStr.length()));
			
			String output = str.toString();
			
			System.out.println(output);
			
		}
		scan.close();
	}
}
