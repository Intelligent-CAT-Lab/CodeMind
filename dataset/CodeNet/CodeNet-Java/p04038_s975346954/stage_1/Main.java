import java.util.*;

public class Main {
	static final long MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		if(K==1) {
			System.out.println(1);
			sc.close();
			return;
		}
		
		init(N*K);
		
		long[][] dp = new long[N+1][N+1];
		dp[0][0] = 1;
		for(int i=0; i<=N; i++) {
			for(int j=i; j<=N; j++) {
				if(i>0)
					dp[i][j] += dp[i-1][j];
				if(j>i)
					dp[i][j] += dp[i][j-1]*comb(i+j*(K-1)-1, K-2);
				dp[i][j] %= MOD;
			}
		}
		
		System.out.println((dp[N][N]*fac[N])%MOD);
		sc.close();
	}
	
	static long fac[],rev[];
	
	static void init(int N) {
		fac = new long[N+1];
		rev = new long[N+1];
		fac[0] = 1;
		rev[0] = 1;
		for(int i=1; i<=N; i++) {
			fac[i] = fac[i-1]*i%MOD;
			rev[i] = pow(fac[i], MOD-2);
		}
	}
	static int pow(long a, long b) {
		long ans = 1;
		while(b>0) {
			if((b&1)!=0)
				ans = (ans * a)%MOD;
			a = (a * a)%MOD;
			b>>=1;
		}
		return (int)ans;
	}
	static long comb(int a, int b) {
		if(a<0 || b<0 || a<b)
			return 0;
		return (((fac[a]*rev[a-b])%MOD)*rev[b])%MOD;
	}

}