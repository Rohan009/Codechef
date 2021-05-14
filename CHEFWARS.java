import java.util.Scanner;

public class CHEFWARS {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			
			int H = scan.nextInt();
			int P = scan.nextInt();
			boolean flag=false;
			while(P>0) {
				H = H-P;
				P=P/2;
				if(H<=0) {
					flag=true;
					break;
				}
			}
			if(flag) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		scan.close();
	}

}
