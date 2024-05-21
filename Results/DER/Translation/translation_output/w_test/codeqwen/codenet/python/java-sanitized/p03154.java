import java.util.Scanner;

public class p03154 {
    static final int MOD = (int) Math.pow(10, 9) + 7;
    static final int list_size = 20000001;

    static int[] f_list = new int[list_size];
    static int[] f_r_list = new int[list_size];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int k = scanner.nextInt();

        f_list[0] = 1;
        for (int i = 1; i < list_size; i++) {
            f_list[i] = (f_list[i - 1] * (i + 1)) % MOD;
        }

        f_r_list[list_size - 1] = pow(f_list[list_size - 1], MOD - 2, MOD);
        for (int i = list_size - 2; i >= 0; i--) {
            f_r_list[i] = (f_r_list[i + 1] * (i + 1)) % MOD;
        }

        int ans = k * f_list[h + w] * f_r_list[h + w - k];
        ans += (h + w) * k * (k + 1) * f_list[h + w - 1] * f_r_list[2] * f_r_list[h + w - k];
        ans %= MOD;
        ans += h * w * f_list[h + w - 2] * (k - 1) * k * (k + 1) * pow(3, MOD - 2, MOD) * f_r_list[h + w - k];
        ans %= MOD;
        System.out.println(ans);
    }

    static int pow(int base, int exp, int mod) {
        if (exp == 0) {