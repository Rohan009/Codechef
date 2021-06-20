import java.util.Scanner;

public class BOLT {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			
			double k1 = scan.nextDouble();
			double k2 = scan.nextDouble();
			double k3 = scan.nextDouble();
			double v = scan.nextDouble();
			
			double speed = 100/(k1*k2*k3*v);
			double speed_round = Math.round(speed*100.0)/100.0;

			System.out.println(speed_round<9.58?"YES":"NO");
			
		}
		scan.close();
	}

}
