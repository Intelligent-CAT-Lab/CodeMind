import java.util.Scanner;

public class p02782 {
    final static int mod = 1000000007;
    final static int rng = 2000100;
    static int[] fctr = new int[rng];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int result = (cmb(x2 + y2 + 2, x2 + 1) - cmb(x2 + y1 + 1, y1) - cmb(x1 + y2 + 1, x1) + cmb(x1 + y1, x1)) % mod;
        System.out.println(result);
    }

    public static int finv(int x) {
        return pow(fctr[x], mod - 2, mod);
    }

    public static int cmb(int n, int k) {
        if (n < 0 || k < 0)
            return 0;
        else
            return fctr[n] * finv(n - k) * finv(k) % mod;
    }

    public static int pow(int a, int b) {
        int res = 1;
        while (b != 0) {
            if (b % 2 == 1)
                res = res * a % mod;
            a = a * a % mod;
            b = b >> 1;
        }
        return res;
    }
}