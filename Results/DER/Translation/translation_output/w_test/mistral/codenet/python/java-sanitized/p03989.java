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
        int ans = cmb(n, k);
        System.out.println(ans);
    }

    public static int cmb(int n, int k) {
        if (n < 0 || k < 0)
            return 0;
        else {
            return fctr[n] * finv[n - k] * finv[k] % mod;
        }
    }

    static {
        for (int i = 1; i < rng; i++) {
            fctr[i] = fctr[i - 1] * i % mod;
        }
        for (int i = 1; i < rng; i++) {
            finv[i] = pow(fctr[i], mod - 2, mod);
        }
    }
}