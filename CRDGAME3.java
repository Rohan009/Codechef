import java.util.*;

public class CRDGAME3 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			
			int C = scan.nextInt();
			int R = scan.nextInt();
			
			if((int)(Math.log10(C)+1)==1 && (int)(Math.log10(R)+1)==1) {
				System.out.println(1+" "+1);
			}
			else if((int)(Math.log10(R)+1)==1 && (int)(Math.log10(C)+1)!=1) {
				System.out.println(1+" "+1);
			}
			else if((int)(Math.log10(C)+1)==1 && (int)(Math.log10(R)+1)!=1) {
				System.out.println(0+" "+1);
			}			
			else {
				int lengthC = C/9;
				if(C%9!=0) {
					lengthC++;
				}
				int lengthR = R/9;
				if(R%9!=0) {
					lengthR++;
				}
				if(lengthC==lengthR) {
					System.out.println(1+" "+lengthR);
				}
				else if(lengthC > lengthR) {
					System.out.println(1+" "+lengthR);
				}
				else {
					System.out.println(0+" "+lengthC);
				}
			}
		}
		
		scan.close();
	}

}
