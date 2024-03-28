import java.util.*;

public class p03083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int W = sc.nextInt();
        int mod = (int) 1e9 + 7;
        int fact[] = new int[B + W + 1];
        int invf[] = new int[B + W + 1];
        int bina[] = new int[B + W + 1];
        int invb[] = new int[B + W + 1];
        Arrays.fill(fact, 1);
        Arrays.fill(invf, 1);
        Arrays.fill(bina, 1);
        Arrays.fill(invb, 1);
        for (int i = 1; i <= B + W; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
            invf[i] = inved(fact[i]);
            bina[i] = (bina[i - 1] * 2) % mod;
            invb[i] = inved(bina[i]);
        }
        int invp = inved(bina[B]);
        int p = 0;
        if (B == W) {
            for (int i = 1; i <= B + W; i++) {
                System.out.println(invf[2]);
            }
        } else if (B > W) {
            for (int i = 1; i <= W; i++) {
                System.out.println(invf[2]);
            }
            int q = invf[2];
            for (int i = 3; i <= B + W; i++) {
                int f = (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod;
                f *= bina[i];
                f %= mod;
                f += q;
                f %= mod;
                System.out.println(f);
                q = f;
            }
        } else {
            for (int i = 1; i <= B; i++) {
                System.out.println(invf[2]);
            }
            int q = invf[2];
            for (int i = 3; i <= B + W; i++) {
                int f = (fact[i - 2] * invf[i - 1 - B] * invf[B - 1]) % mod;
                f *= mod - 1;
                f %= mod;
                f *= bina[i];
                f %= mod;
                f += q;
                f %= mod;
                System.out.println(f);
                q = f;
            }
        }
    }

    public static int inved(int a) {
        int x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l != 0) {
            x = u;
            y = v;
            u = x - u * (k / l);
            v = y - v * (k / l);
            k = l;
            l = k % l;
        }
        return x % mod;
    }

    public static int doubling(int n, int m) {
        int y = 1;
        int base = n;
        while (m != 0) {
            if (m % 2 == 1) {
                y *= base;
                y %= mod;
            }
            base *= base;
            base %= mod;
            m /= 2;
        }
        return y;
    }
}