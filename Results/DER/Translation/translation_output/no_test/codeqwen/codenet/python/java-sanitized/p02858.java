import java.util.Scanner;
import java.math.BigInteger;

public class p02858 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int T = scanner.nextInt();
        int gh = gcd(H, T);
        int gw = gcd(W, T);
        int h = H / gh;
        int w = W / gw;
        BigInteger MOD = BigInteger.valueOf(1000000007);
        BigInteger result = pow(pow(BigInteger.valueOf(2), BigInteger.valueOf(h), MOD)
                .add(pow(BigInteger.valueOf(2), BigInteger.valueOf(w), MOD))
                .add(pow(BigInteger.valueOf(2), BigInteger.valueOf(gcd(h, w)), MOD))
                .subtract(BigInteger.valueOf(3)), BigInteger.valueOf(gh * gw), MOD);
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static BigInteger pow(BigInteger base, BigInteger exponent, BigInteger mod) {
        BigInteger result = BigInteger.ONE;
        base = base.mod(mod);
        while (exponent.compareTo(BigInteger.ZERO) > 0) {
            if (exponent.testBit(0))
                result = result.multiply(base).mod(mod);
            exponent = exponent.shiftRight(1);
            base = base.multiply(base).mod(mod);
        }
        return result;
    }
}