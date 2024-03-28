import java.util.Scanner;

public class p02782 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mod = 1000000007;
        int rng = 2000100;
        int[] fctr = new int[rng];
        fctr[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = fctr[i - 1] * i % mod;
        }

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int result = (cmb(x2 + y2 + 2, x2 + 1) - cmb(x2 + y1 + 1, y1) - cmb(x1 + y2 + 1, x1) + cmb(x1 + y1, x1)) % mod;
        System.out.println(result);
    }

    public static int cmb(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return fctr[n] * finv(n - k) * finv(k) % mod;
        }
    }

    public static int finv(int x) {
        return (int) Math.pow(fctr[x], mod - 2) % mod;
    }
}