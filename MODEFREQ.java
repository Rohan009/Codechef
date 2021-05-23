import java.util.*;

public class MODEFREQ {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int x=0; x<t; x++) {
			
			Map<Integer, Integer> ModeMap = new HashMap<>();
			int N = scan.nextInt();
			for(int j=0;j<N;j++)
			{
				int temp = scan.nextInt();
				
				if(ModeMap.containsKey(temp)) {
					int frequency = ModeMap.get(temp);
					ModeMap.put(temp, ++frequency);
				}
				else {
					ModeMap.put(temp, 1);
				}
			}
			List<Integer> tempList = new ArrayList<>();
			
			int output = 0;
			int max=0;

			for(Map.Entry<Integer, Integer> tempMap : ModeMap.entrySet()) {
								
				if(!tempList.contains(tempMap.getValue())) {
					int freq = Collections.frequency(ModeMap.values(), tempMap.getValue());
					
					if(freq==max) {
						if(output>tempMap.getValue()) {
							output = tempMap.getValue();
						}
					}	
					
					if(freq>max) {
						max = freq;
						output = tempMap.getValue();
					}
					
	
					tempList.add(tempMap.getValue());
				}
			}
			System.out.println(output);
		}
		scan.close();
	}
}
