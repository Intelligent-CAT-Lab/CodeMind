import java.util.Scanner;

public class p03431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = 998244353;
        int[] f = new int[k + 1];
        f[0] = 1;
        for (int i = 1; i <= k; i++) {
            f[i] = (-~i * f[i - 1]) % p;
        }
        int sum = 0;
        for (int i = n - 1; i >= k; i--) {
            sum = (sum + f[i] * f[i - k] % p) % p;
        }
        System.out.println(sum);
    }
}