import java.util.Scanner;

public class PointOfImpact {

	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int j=0; j<t; j++) {
			
			long N = scan.nextInt();
			long K = scan.nextInt();
			long x = scan.nextInt();
			long y = scan.nextInt();
			
			for(int i=0;i<K;i++) {
				
				boolean flag=false;
				if(x!=N && y!=N  && x>0) {
					while(x!=N && y!=N) {
						x++;
						y++;
						if(fourCorner(x,y,N)) {
							flag=true;
							break;
						}
					}
					if(flag) {
						break;
					}
				} else if(x==N && y!=N && y>0) {
					while(y!=N) {
						x--;
						y++;
						if(fourCorner(x,y,N)) {
							flag=true;
							break;
						}
					}
					if(flag) {
						break;
					}
				} else if(x!=N && y==N && x>0) {
					while(x!=0) {
						x--;
						y--;
						if(fourCorner(x,y,N)) {
							flag=true;
							break;
						}
					}
					if(flag) {
						break;
					}
				} else if(x==0 && y!=N && y>0) {
					while(y!=0) {
						x++;
						y--;
						if(fourCorner(x,y,N)) {
							flag=true;
							break;
						}
					}
					if(flag) {
						break;
					}
				} else {
					break;
				}
			}
			
			System.out.println(x+" "+y);
		}
		scan.close();
	}

	private static boolean fourCorner(long x, long y, long N) {
				
		if(x==N && y==N) {
			return true;
		} else if(x==0 && y==N) {
			return true;
		} else if(x==0 && y==0) {
			return true;
		} else if(x==N && y==0) {
			return true;
		} else {
			return false;
		}
	}

}
