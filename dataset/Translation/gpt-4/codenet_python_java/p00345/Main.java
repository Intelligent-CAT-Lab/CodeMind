import java.math.BigInteger;
import java.util.Scanner;

public class p00345 {
    public static BigInteger gcd(BigInteger x, BigInteger y) {
        return (y.equals(BigInteger.ZERO)) ? x : gcd(y, x.mod(y));
    }

    public static void printV(BigInteger x, BigInteger y) {
        BigInteger g = gcd(x, y);
        System.out.println(x.divide(g) + "/" + y.divide(g));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        String all = "";
        String sub = "";
        int p = -1;
        int o = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {
                o = i;
            } else if (S.charAt(i) == '(') {
                p = i;
                sub = all;
            } else if (S.charAt(i) != ')') {
                all += S.charAt(i);
            }
        }

        int d = S.length() - o - 1;
        int l = (p != -1) ? p - o - 1 : 0;

        if (p == -1) {
            printV(new BigInteger(all), BigInteger.TEN.pow(d));
        } else {
            d -= 2; // for ()
            printV(new BigInteger(all).subtract(new BigInteger(sub)),
                    BigInteger.TEN.pow(d).subtract(BigInteger.TEN.pow(l)));
        }

        scanner.close();
    }
}