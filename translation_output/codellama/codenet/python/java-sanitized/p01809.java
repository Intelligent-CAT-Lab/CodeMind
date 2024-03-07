import java.util.Scanner;
import java.math.BigInteger;

public class p01809 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger p = sc.nextBigInteger();
        BigInteger q = sc.nextBigInteger();
        BigInteger g = p.gcd(q);
        BigInteger t = q.divide(g);
        BigInteger k = BigInteger.ONE;
        if (t.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
            k = k.multiply(BigInteger.TWO);
            while (t.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                t = t.divide(BigInteger.TWO);
            }
        }
        for (int i = 3; i <= Math.sqrt(t.doubleValue()); i += 2) {
            if (t.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                k = k.multiply(BigInteger.valueOf(i));
                while (t.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                    t = t.divide(BigInteger.valueOf(i));
                }
            }
        }
        System.out.println(t.multiply(k));
    }
}