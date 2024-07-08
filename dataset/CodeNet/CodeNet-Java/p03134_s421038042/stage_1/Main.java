import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=s.length();
		int[][] dp=new int[n+n+1][n+n+1];
		int[] c1=new int[n+1];
		int[] c2=new int[n+1];
		for (int i=1;i<=n;++i) {
			c1[i]=c1[i-1];
			c2[i]=c2[i-1];
var newVariable_0 = s.charAt(i-1);			if (newVariable_0=='0') c1[i]+=2;
var newVariable_1 = s.charAt(i-1);			else if (newVariable_1=='2') c2[i]+=2;
			else {
				++c1[i];
				++c2[i];
			}
		}
		dp[0][0]=1;
		for (int i=0;i<=c1[n];++i)
var newVariable_2 = Math.min(n,i+j);var newVariable_3 = Math.min(n,i+j);			for (int j=0;j<=c2[n];++j) if (c1[newVariable_3]>=i&&c2[newVariable_3]>=j) {
				if (i>0) dp[i][j]+=dp[i-1][j];
				if (dp[i][j]>=998244353) dp[i][j]-=998244353;
				if (j>0) dp[i][j]+=dp[i][j-1];
				if (dp[i][j]>=998244353) dp[i][j]-=998244353;
			}
		System.out.println(dp[c1[n]][c2[n]]);
	}
}