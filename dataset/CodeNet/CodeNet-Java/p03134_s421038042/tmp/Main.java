import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
System.out.println("[INST]4;s;in.next();"+s);
		int n=s.length();
System.out.println("[INST]5;n;s.length();"+n);
		int[][] dp=new int[n+n+1][n+n+1];
		int[] c1=new int[n+1];
		int[] c2=new int[n+1];
		for (int i=1;i<=n;++i) {
			c1[i]=c1[i-1];
			c2[i]=c2[i-1];
			if (s.charAt(i-1)=='0') c1[i]+=2;
System.out.println("[INST]12;None;s.charAt(i-1);"+s.charAt(i-1));
			else if (s.charAt(i-1)=='2') c2[i]+=2;
System.out.println("[INST]13;None;s.charAt(i-1);"+s.charAt(i-1));
			else {
				++c1[i];
				++c2[i];
			}
		}
		dp[0][0]=1;
		for (int i=0;i<=c1[n];++i)
			for (int j=0;j<=c2[n];++j) if (c1[Math.min(n,i+j)]>=i&&c2[Math.min(n,i+j)]>=j) {
System.out.println("[INST]21;None;Math.min(n,i+j);"+Math.min(n,i+j));
System.out.println("[INST]21;None;Math.min(n,i+j);"+Math.min(n,i+j));
				if (i>0) dp[i][j]+=dp[i-1][j];
				if (dp[i][j]>=998244353) dp[i][j]-=998244353;
				if (j>0) dp[i][j]+=dp[i][j-1];
				if (dp[i][j]>=998244353) dp[i][j]-=998244353;
			}
		System.out.println(dp[c1[n]][c2[n]]);
	}
}