import java.util.*;

public class p02782 {
    static long mod = (long)Math.pow(10,9)+7;
    static long[] fctr = new long[200010];
    static long[] finv = new long[200010];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        fctr[0] = 1;
        finv[0] = 1;
        for(int i=1;i<200010;i++){
            fctr[i] = (fctr[i-1]*i)%mod;
            finv[i] = modinv(fctr[i]);
        }
        long ans = (comb(x2+y2+2,x2+1)-comb(x2+y1+1,y1)-comb(x1+y2+1,x1)+comb(x1+y1,x1))%mod;
        System.out.println(ans);
    }

    public static long comb(int n, int k){
        if(n<0 || k<0){
            return 0;
        }
        return (fctr[n]*((finv[k]*finv[n-k])%mod))%mod;
    }

    public static long modinv(long a){
        return modpow(a,mod-2);
    }

    public static long modpow(long a, long n){
        long res = 1;
        while(n>0){
            if(n%2==1){
                res = (res*a)%mod;
            }
            a = (a*a)%mod;
            n /= 2;
        }
        return res;
    }
}