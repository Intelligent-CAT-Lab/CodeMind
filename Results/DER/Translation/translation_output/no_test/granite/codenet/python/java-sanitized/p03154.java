import java.util.*;

public class p03154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 100000007;
        int list_size = 200000001;

        long[] f_list = new long[list_size];
        long[] f_r_list = new long[list_size];

        f_list[0] = 1;
        f_r_list[0] = 1;

        for (int i = 1; i < list_size; i++) {
            f_list[i] = (f_list[i - 1] * i) % MOD;
        }

        f_r_list[list_size - 1] = pow(f_list[list_size - 1], MOD - 2, MOD);

        for (int i = list_size - 2; i >= 0; i--) {
            f_r_list[i] = (f_r_list[i + 1] * (i + 1)) % MOD;
        }

        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();

        long ans = k * f_list[h + w] * f_r_list[h + w - k];
        ans += (h + w) * k * (k + 1) * f_list[h + w - 1] * f_r_list[2] * f_r_list[h + w - k];
        ans %= MOD;
        ans += h * w * f_list[h + w - 2] * (k - 1) * k * (k + 1) * pow(3, MOD - 2, MOD) * f_r_list[h + w - k];
        ans %= MOD;
        System.out.println(ans);
    }

    public static long pow(long x, long n, int MOD) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * x % MOD;
            }
            x = x * x % MOD;
            n >>= 1;
        }
        return res;
    }
}