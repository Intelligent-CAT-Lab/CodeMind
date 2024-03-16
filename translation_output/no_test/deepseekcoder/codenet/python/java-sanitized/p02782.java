import java.util.Scanner;

public class p02782 {
    static long mod = (long)Math.pow(10,9)+7;
    static int rng = 2000100;
    static long[] fctr = new long[rng];

    static void precompute() {
        fctr[0] = 1;
        for (int i = 1; i < rng; i++)
            fctr[i] = (fctr[i-1]*i)%mod;
    }

    static long finv(long x) {
        return power(fctr[(int)x],mod-2,mod);
    }

    static long power(long x, long y, long p) {
        long res = 1;
        x = x % p;
        while (y > 0) {
            if ((y & 1)==1)
                res = (res*x) % p;
            y = y>>1;
            x = (x*x) % p;
        }
        return res;
    }

    static long cmb(long n, long k) {
        if (n<0 || k<0)
            return 0;
        else
            return (fctr[(int)n]*finv(n-k)*finv(k)) % mod;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        precompute();
        System.out.println((cmb(x2+y2+2,x2+1)-cmb(x2+y1+1,y1)-cmb(x1+y2+1,x1)+cmb(x1+y1,x1))%mod);
    }
}