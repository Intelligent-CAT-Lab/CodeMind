import java.util.Scanner;

public class p03154 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int k = scanner.nextInt();
        int MOD = 1000000007;

        int[] f_list = new int[20000001];
        int[] f_r_list = new int[20000001];

        for (int i = 0; i < 20000001; i++) {
            f_list[i] = 1;
            f_r_list[i] = 1;
        }

        for (int i = 0; i < 20000000; i++) {
            f_list[i+1] = (f_list[i] * (i+1)) % MOD;
        }

        f_r_list[20000000] = pow(f_list[20000000], MOD - 2, MOD);

        for (int i = 20000000; i >= 0; i--) {
            f_r_list[i] = (f_r_list[i+1] * (i+1)) % MOD;
        }

        int ans = k * f_list[h+w] * f_r_list[h+w-k];
        ans += (h+w) * k * (k+1) * f_list[h+w-1] * f_r_list[2] * f_r_list[h+w-k];
        ans %= MOD;
        ans += h * w * f_list[h+w-2] * (k-1) * k * (k+1) * pow(3, MOD-2, MOD) * f_r_list[h+w-k];
        ans %= MOD;

        System.out.println(ans);
    }

    public static int pow(int base, int exponent, int modulus) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = (result * base) % modulus;
        }
        return result;
    }
}