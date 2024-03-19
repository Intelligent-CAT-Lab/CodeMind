import java.util.*;
import java.math.*;

public class p02541 {
    private static BigInteger inv_gcd(BigInteger a, BigInteger b) {
        a = a.add(b).mod(b);
        if (a.equals(BigInteger.ZERO)) {
            return BigInteger.valueOf(0);
        }
        BigInteger s = b, t = a;
        BigInteger m0 = BigInteger.ZERO, m1 = BigInteger.ONE;

        while (!t.equals(BigInteger.ZERO)) {
            BigInteger u = s.divide(t);
            s = s.subtract(t.multiply(u));
            m0 = m0.subtract(m