import java.util.*;

class Main {
    static long powerMod(long x, long exponent) {
	long prod = 1;
	for (int i = 63; i >= 0; --i) {
	    prod = (prod * prod) % MOD;
	    if ((exponent & 1L << i) != 0) {
		prod = (prod * x) % MOD;
	    }
	}
	return prod;
    }
    static int f(int n, int k) {
        int t=0;
        for(int i=n;i>=1;--i){
            t+=(t+i)/i;
        }
        return t;
    }
    static final long MOD=1000000007;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
System.out.println("[INST]23;n;scan.nextInt();"+n);
        int k=scan.nextInt();
System.out.println("[INST]24;k;scan.nextInt();"+k);
        int x=0;
        int l=f(n,k);
        long[][]dp=new long[n+1][l+1];
        for(int i=1;i<=n;++i){
            long m=powerMod(k+1,i-1);
            for(int u=0;u<=l;++u){
                long t=0;
                for(int j=0;j<=Math.min(i,k);++j)
System.out.println("[INST]32;None;Math.min(i,k);"+Math.min(i,k));
                    if(u+(u+j)/i<=l){
                        t+=dp[i-1][u+(u+j)/i];
                        t+=((u+j)%i)*m%MOD;
                        t%=MOD;
                    }
                for(int j=Math.min(i,k)+1;j<=k;++j)
System.out.println("[INST]38;None;Math.min(i,k);"+Math.min(i,k));
                    t=(t+dp[i-1][u]+(j+u)*m)%MOD;
                dp[i][u]=t;
            }
        }
        System.out.println(dp[n][0]);
    }
}
