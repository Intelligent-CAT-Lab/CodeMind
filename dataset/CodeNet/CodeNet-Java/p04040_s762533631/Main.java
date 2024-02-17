import java.util.*;

public class Main {
	static final long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		init(H+W);
		long ans = 0;
		
		for(int i=0; i<H-A; i++)
			ans = (ans + comb(B+i-1, B-1)*comb(W-B+H-i-2, W-B-1))%MOD;
		
		System.out.println(ans);
		sc.close();
	}
	
	static long fac[],rev[],revfac[];
	
	static void init(int N) {
		fac = new long[N+1];
		rev = new long[N+1];
		revfac = new long[N+1];
		fac[0] = 1;
		rev[0] = 0;
		revfac[0] = 1;
		for(int i=1; i<=N; i++) {
			fac[i] = fac[i-1]*i%MOD;
			rev[i] = pow(i, MOD-2);
			revfac[i] = pow(fac[i], MOD-2);
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
		return (((fac[a]*revfac[a-b])%MOD)*revfac[b])%MOD;
	}
}
