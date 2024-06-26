import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
System.out.println("[INST]6;A;sc.nextInt();"+A);
		int B = sc.nextInt();
System.out.println("[INST]7;B;sc.nextInt();"+B);
		int C = sc.nextInt();
System.out.println("[INST]8;C;sc.nextInt();"+C);
		int D = sc.nextInt();
System.out.println("[INST]9;D;sc.nextInt();"+D);
		
		final long MOD = 998244353;
		long[][] dp = new long[D][C];
		long[][] sum = new long[D][C];
		sum[B-1][A-1] = 1;
		for(int i=A; i<C; i++) {
			sum[B-1][i] = (sum[B-1][i-1]*B)%MOD;
		}
		
		for(int i=B; i<D; i++) {
			for(int j=A; j<C; j++) {
				dp[i][j] = dp[i-1][j]*j;
				dp[i][j] += sum[i-1][j-1]*j;
				dp[i][j] %= MOD;
				sum[i][j] = (sum[i][j-1]*(i+1) + dp[i][j])%MOD;
			}
		}
		
		long ans = 0;
		
		long powC = 1;
		for(int i=D-1; i>=B; i--) {
			long powI = 1;
			for(int j=C-1; j>=A; j--) {
				ans = (ans + dp[i][j]*((powC*powI)%MOD))%MOD;
				powI = (powI*(i+1))%MOD;
			}
			powC = (powC*C)%MOD;
		}
		ans = (ans + (powC*sum[B-1][C-1])%MOD)%MOD;
		
		System.out.println(ans);
		sc.close();
	}
}
