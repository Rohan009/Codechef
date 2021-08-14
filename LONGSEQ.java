import java.util.Scanner;

public class LONGSEQ {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int x=0; x<t; x++) {
			
			String str = scan.next();
			int a = 0, b=0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='0') {
					a++;
				} else {
					b++;
				}
			}
			System.out.println(a==1 || b==1?"Yes":"No");
		}
		
		scan.close();
	}

}
