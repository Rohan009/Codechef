import java.util.*;

public class CHEFWED {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();		
		for(int i=0; i<t; i++) {		
			int n = scan.nextInt();
			int k = scan.nextInt();
			
			List<Integer> num = new ArrayList<>();
			
			for(int j=0;j<n;j++) {
				num.add(scan.nextInt());
			}
			
			Map<Integer,Integer> frequency = new HashMap<>();
			
			for(Integer number : num) {
				
				if(frequency.containsKey(number)) {
					int temp = frequency.get(number);
					frequency.put(number, ++temp);
				}
				else {
					frequency.put(number, 1);
				}
			}
			

			for(Map.Entry<Integer, Integer> map : frequency.entrySet()) {
				System.out.println(map.getKey()+" : "+map.getValue());
			}
			
		}
		
		scan.close();
	}
}
