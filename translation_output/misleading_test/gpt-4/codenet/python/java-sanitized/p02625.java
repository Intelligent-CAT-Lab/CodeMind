import java.util.Scanner;

public class p02625 {
    public static void modPolyCompute() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int mod = 1000000007;
        long[] d = new long[n + 1];

        for (int i = 0; i <= n; i++) {
            d[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            long term1 = ((m - i) * ((m - n + i) * d[i] % mod)) % mod;
            long term2 = (i * ((m - i + 1) * d[i - 1]) % mod) % mod;
            d[i + 1] = (term1 + term2) % mod;
        }

        System.out.println(d[n]);
    }

    public static void main(String[] args) {
        modPolyCompute();
    }
}