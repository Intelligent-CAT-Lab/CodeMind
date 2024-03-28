import java.util.*;

public class p03989 {
    static int mod = 924844033;
    static int rng = 2010;
    static int[] fctr = new int[rng];
    static int[] finv = new int[rng];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Arrays.fill(fctr, 1);
        Arrays.fill(finv, 1);
        for (int i = 1; i < rng; i++) {
            fctr[i] = fctr[i - 1] * i % mod;
            finv[i] = pow(fctr[i], mod - 2, mod);
        }

        int ans = cmb(n, k);
        System.out.println(ans);
    }

    public static int cmb(int n, int k) {
        if (n < 0 || k < 0)
            return 0;
        else
            return fctr[n] * finv[n - k] * finv[k] % mod;
    }

    public static int pow(int a, int b, int mod) {
        int res = 1;
        while (b != 0) {
            if (b % 2 == 1)
                res = res * a % mod;
            b = b >> 1;
            a = a * a % mod;
        }
        return res;
    }
}