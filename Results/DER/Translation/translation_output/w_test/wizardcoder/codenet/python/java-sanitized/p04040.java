import java.util.*;

public class p04040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mod = 1000000007;
        int max_n = 2*100000;
        COMB_MOD C = new COMB_MOD(max_n, mod);
        int ans = 0;
        for(int i=0;i<h-a;i++){
            ans = (ans + C.comb(b-1+i,i)*C.comb(h-1-i+w-1-b,h-1-i))%mod;
        }
        System.out.println(ans);
    }
}

class COMB_MOD{
    int max;
    int mod;
    long[] fac, finv, inv;

    public COMB_MOD(int max_n, int mod){
        max = max_n;
        this.mod = mod;
        fac = new long[max_n];
        finv = new long[max_n];
        inv = new long[max_n];
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for(int i=2;i<max_n;i++){
            fac[i] = (fac[i-1] * i) % mod;
            inv[i] = mod - (inv[mod % i] * (mod / i)) % mod;
            finv[i] = (finv[i-1] * inv[i]) % mod;
        }
    }

    public long comb(int n, int k){
        if(n < k) return 0;
        if(n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n-k]) % mod;
    }
}