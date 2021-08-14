import java.util.Scanner;

public class MEXSTR {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		
		for(int x=0; x<t; x++) {
			
			String str = scan.next();
			System.out.println(solve(str));
		}
		
		scan.close();
	}

	private static String solve(String str) {
		
		int dp[] =  new int[(int)1e6+2];
		int dp1[] =  new int[(int)1e6+2];

		int next0[] =  new int[(int)1e6];
		int next1[] =  new int[(int)1e6];

		
		int pos = -1;
		int n = str.length();
		
		for(int i=0;i<n;i++){
			if(str.charAt(i) == '0'){
				for(int j=pos+1;j<=i;j++) {
					next0[j]=i;
					pos=i;
				}
			}
		}
		
		for(int i=pos+1;i<n;i++){
			next0[i]=n;
			
		}
		
		if(next0[0] == n){
			    return "0";
			}
		
		pos=-1;
			for(int i=0;i<n;i++){
				if(str.charAt(i) == '1'){
					for(int j=pos+1;j<=i;j++) {
						next1[j]=i;
						pos=i;
					}
					
				}
			}
			
			for(int i=pos+1;i<n;i++)
				next1[i]=n;
			
			
			dp[n]=dp[n+1]=0;
			dp1[n]=dp1[n+1]=0; //first change
			
			for(int i=n-1;i>=0;--i){
				dp[i]=dp[i+1];
				if(str.charAt(i) == '0' && next1[i] < n)
					dp[i]=Math.max(dp[i],dp[next1[i]+1]+1);
			   if(str.charAt(i) == '1' && next0[i] <n)
			        dp[i]=Math.max(dp[i],dp[next0[i]+1]+1);		
				dp1[i]=dp1[i+1];
				if(next1[i] < n)
					dp1[i]=Math.max(dp1[i],dp[next1[i]+1]+1);
				
			}
			
			int len=dp1[0]+1;
			int curind=next1[0]+1;
			StringBuilder ans= new StringBuilder("1");
			for(int i=1;i<len;++i)
			{
				if(curind >= n){
					ans.append('0');
					continue;
				}
				if(next0[curind] >= n){
				    ans.append('0');
				    curind=next0[curind]+1;
				    continue;
				}
				if(dp[next0[curind]+1] <len-i-1){
					ans.append('0');
					curind=next0[curind]+1;
				}else{
					ans.append('1');
					curind=next1[curind]+1;
				}
			}	
		
		return ans.toString();
	}

}
