Here is the Java version of your Python code:

```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int length = s.length();
        BigInteger BASE = BigInteger.valueOf(100);
        BigInteger MOD1 = BigInteger.valueOf(1000000007);
        BigInteger MOD2 = BigInteger.valueOf(2147483647);
        BigInteger acc1 = BigInteger.ZERO;
        BigInteger acc2 = BigInteger.ZERO;
        List<BigInteger> hlst1 = new ArrayList<>();
        List<BigInteger> hlst2 = new ArrayList<>();
        for (char c : s.toCharArray()) {
            BigInteger i = BigInteger.valueOf((int) c);
            acc1 = acc1.multiply(BASE).add(i).mod(MOD1);
            acc2 = acc2.multiply(BASE).add(i).mod(MOD2);
            hlst1.add(acc1);
            hlst2.add(acc2);
        }

        BigInteger[][] calc_hash = new BigInteger[length][2];
        for (int i = 0; i < length; i++) {
            calc_hash[i][0] = hlst1.get(i);
            calc_hash[i][1] = hlst2.get(i);
        }

        for (int i = length / 3; i >= 0; i--) {
            if ((length - (i + 1) * 3) % 2 != 0) continue;
            int alen = i + 1;
            int blen = (length - (i + 1) * 3) / 2;
            if (blen <= 0) continue;
            BigInteger[] ha1 = calc_hash(0, alen, alen, calc_hash);
            BigInteger[] ha2 = calc_hash(alen + blen, blen + alen * 2, alen,
