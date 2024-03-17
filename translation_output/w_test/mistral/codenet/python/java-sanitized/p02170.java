import java.util.*;

public class p02170 {
    static int mod = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a = sc.nextInt();
        int[] lst = new int[k + 1];
        Arrays.fill(lst, 0);
        lst[k - 1] = 1;
        long A = a * Math.pow(100 * n, mod - 2, mod);
        long inv = Math.pow(n, mod - 2, mod);

        for (int i = k - 1; i >= 0; i--) {
            if (i + n > k) {
                lst[i] = A * (lst[i + 1] - lst[i + n + 1]) + lst[i + 1];
                lst[i] %= mod;
            } else {
                lst[i] = A * (lst[i + 1] - lst[k]) + (n - (k - i) + 1) * inv + lst[i + 1];
                lst[i] %= mod;
            }
        }
        System.out.println((lst[0] - lst[1]) % mod);
    }
}