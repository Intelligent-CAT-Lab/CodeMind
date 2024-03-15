import java.util.Scanner;

public class p02554 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long ant = 1, bnt = 1, cnt = 1;
        final long mod = 1000000007;

        for (int i = 0; i < n; i++) {
            ant = 10 * ant % mod;
            bnt = 9 * bnt % mod;
            cnt = 8 * cnt % mod;
        }

        long ans = (ant - (bnt * 2 - cnt)) % mod;

        if (ans >= 0) {
            System.out.println(ans);
        } else {
            System.out.println(mod + ans);
        }

        scanner.close();
    }
}