import java.util.Scanner;

public class p03935 {
    static final long M = 998244353;
    static long[] g(long[] a, long[] b) {
        return new long[]{
                (a[0]*b[0]+a[1]*b[2])%M,
                (a[0]*b[1]+a[1]*b[3])%M,
                (a[2]*b[0]+a[3]*b[2])%M,
                (a[2]*b[1]+a[3]*b[3])%M
        };
    }

    static long f(long n) {
        long[] e = {1,0,0,1}, z = {1,1,1,0};
        while (n > 0) {
            e = (n%2 == 0) ? e : g(e,z);
            z = g(z,z);
            n /= 2;
        }
        return e[1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long[] I = new long[(int)n+1];
        I[0] = 1;
        I[1] = 1;
        for (int i = 2; i <= n; i++) {
            I[i] = ((M-M/i)*I[(int) (M%i)])%M;
        }
        long r = f(m+2*n-2);
        long c = 1;
        for (int i = 1; i < n; i++) {
            r = (r+c*(M-f(2*n-2-2*i)))%M;
            c = c*(m+i)*I[i+1]%M;
        }
        System.out.println(r);
    }
}