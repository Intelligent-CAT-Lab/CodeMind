import java.util.Scanner;
import java.math.BigInteger;

public class p02858 {
    private static final BigInteger MOD = BigInteger.valueOf(1000000007);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int T = scanner.nextInt();
        scanner.close();

        int gh = gcd(H, T);
        int gw = gcd(W, T);

        int h = H / gh;
        int w = W / gw;

        BigInteger res = BigInteger.valueOf(2).modPow(BigInteger.valueOf(h), MOD)
                .add(BigInteger.valueOf(2).modPow(BigInteger.valueOf(w), MOD))
                .add(BigInteger.valueOf(2).modPow(BigInteger.valueOf(gcd(h, w)), MOD))
                .subtract(BigInteger.valueOf(3))
                .modPow(BigInteger.valueOf(gh * gw), MOD)
                .mod(MOD);

        System.out.println(res);
    }

    // Helper method to compute the greatest common divisor (GCD)
    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}