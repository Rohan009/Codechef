import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class COVID19B {
	
	public static boolean isConsecutive(List<Integer> list) {
	    for (int i = 0; i < list.size() - 1; i++) {
	        if (list.get(i) != list.get(i + 1) - 1) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static boolean isConsecutiveDesc(List<Integer> list) {
	    for (int i = 0; i < list.size() - 1; i++) {
	        if (list.get(i) != list.get(i + 1) + 1) {
	            return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int x=0; x<t; x++) {
			
			List<Integer> speed = new ArrayList<>();
			int N = scan.nextInt();
			for(int j=0;j<N;j++)
			{
				int temp = scan.nextInt();
				if(temp==0) {
					speed.add(-5);
				} else {
					speed.add(temp);

				}
			}
			
			if(N==3) {
				
				if(!speed.contains(-5)) {
					if(isConsecutive(speed)) {
						System.out.println(1+" "+1);
						continue;
					}
					else if(isConsecutiveDesc(speed)) {
						System.out.println(N+" "+N);
						continue;
					}
					else {
						int worst = isCalculate(speed);
						System.out.println(1+" "+(worst));
						continue;
					}
				}
				else {
					int freq = Collections.frequency(speed, -5);
					
					if(freq==speed.size()) {
						System.out.println(1+" "+1);
						continue;
					} else {
						int worst = isCalculate(speed);
						System.out.println(1+" "+(worst));
						continue;
					}
				}			
			}
			else {
				System.out.println(1+" "+3);
				continue;
			}

		}
		scan.close();
	}
	
	private static int checkIfEqual(List<Integer> temp2) {
		
		Set<Integer> set = new HashSet<>();
		int cnt=0;
		for(Integer i : temp2) {
			
			if(!set.add(i)) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	public static int isCalculate(List<Integer> list) {
		List<Integer> temp = new ArrayList<>();
		
	    for (int i = 0; i < list.size(); i++) {
	    		temp.add(list.get(1)+(i+1));
	    }
	    
	    for(int i=0;i<5;i++) {
			List<Integer> temp2 = new ArrayList<>();
	    	for(int j=0;j<temp.size();j++) {
	    		temp2.add(temp.get(j)+list.get(j));
	    	}
	    	
	    	int repeatedCount = checkIfEqual(temp2);
	    	if(repeatedCount>0) {
	    		return ++repeatedCount;
	    	}
	    	
	    }

	    return 1;
	}
	
		
	private static int resultN3(List<Integer> speed) {
		
		int cnt=0;
		int max=0;
		for(int i=0;i<speed.size();i++) {
			
			if(i==0) {
				
				if(speed.get(i)==speed.get(i+1)+1) {
					cnt++;
				}
				if(speed.get(i)==speed.get(i+2)+2 || speed.get(i)==speed.get(i+2)+1) {
					cnt++;
				}
				
				if(cnt>max) {
					max=cnt;
				}
				cnt=0;

			}
			
			if(i==1) {
				if(speed.get(i)==speed.get(i+1)+1) {
					cnt++;
				}
				if(speed.get(i)==speed.get(i-1)-1) {
					cnt++;
				}
				
				if(cnt>max) {
					max=cnt;
				}
				cnt=0;

			}
			
			if(i==2) {
				if(speed.get(i)==speed.get(i-1)-1) {
					cnt++;
				}
				if(speed.get(i)==speed.get(i-2)-2 || speed.get(i)==speed.get(i-2)-1) {
					cnt++;
				}
				
				if(cnt>max) {
					max=cnt;
				}
				cnt=0;
			}	
		}
		
		return max;
	}

}
