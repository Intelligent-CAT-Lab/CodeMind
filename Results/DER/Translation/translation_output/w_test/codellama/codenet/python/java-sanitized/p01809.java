import java.util.Scanner;
import java.math.BigInteger;

public class p01809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger p = scanner.nextBigInteger();
        BigInteger q = scanner.nextBigInteger();
        BigInteger gcd = p.gcd(q);
        BigInteger t = q.divide(gcd);
        BigInteger k = BigInteger.ONE;
        if (t.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
            k = k.multiply(BigInteger.valueOf(2));
            while (t.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                t = t.divide(BigInteger.TWO);
            }
        }
        for (int i = 3; i <= Math.sqrt(t.doubleValue()) + 2; i += 2) {
            if (t.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                k = k.multiply(BigInteger.valueOf(i));
                while (t.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                    t = t.divide(BigInteger.valueOf(i));
                }
            }
        }
        BigInteger result = t.multiply(k);
        System.out.println(result);
    }
}