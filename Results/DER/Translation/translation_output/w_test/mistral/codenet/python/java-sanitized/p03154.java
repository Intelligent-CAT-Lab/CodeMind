import java.util.*;

public class p03154 {
    final static int MOD = 1000000007;
    final static int list_size = 20000001;

    public static void main(String[] args) {
        int[] f_list = new int[list_size];
        Arrays.fill(f_list, 1);

        for (int i = 1; i < list_size; i++) {
            f_list[i] = (f_list[i - 1] * (i)) % MOD;
        }

        int f_r_list[] = new int[list_size];
        Arrays.fill(f_r_list, 1);

        for (int i = list_size - 2; i >= 0; i--) {
            f_r_list[i] = (f_r_list[i + 1] * (i + 1)) % MOD;
        }

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();

        long ans = k * f_list[h + w] * f_r_list[h + w - k];
        ans += (h + w) * k * (k + 1) * f_list[h + w - 1] * f_r_list[2] * f_r_list[h + w - k];
        ans %= MOD;
        ans += h * w * f_list[h + w - 2] * (k - 1) * k * (k + 1) * (long) Math.pow(3, MOD - 2, MOD) * f_r_list[h + w - k];
        ans %= MOD;

        System.out.println(ans);
    }
}