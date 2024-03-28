import java.util.Scanner;

public class p02782 {
    static long mod = 1000000007;
    static int rng = 2000100;
    static long[] fctr = new long[rng];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fctr[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = fctr[i - 1] * i % mod;
        }

        int x1, y1, x2, y2;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        long result = (cmb(x2 + y2 + 2, x2 + 1) - cmb(x2 + y1 + 1, y1) - cmb(x1 + y2 + 1, x1) + cmb(x1 + y1, x1)) % mod;
        System.out.println((result + mod) % mod);

        sc.close();
    }

    static long finv(int x) {
        return pow(fctr[x], mod - 2, mod);
    }

    static long cmb(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return fctr[n] * finv(n - k) % mod * finv(k) % mod;
        }
    }

    static long pow(long base, long exp, long modulo) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = result * base % modulo;
            }
            base = base * base % modulo;
            exp /= 2;
        }
        return result;
    }
}