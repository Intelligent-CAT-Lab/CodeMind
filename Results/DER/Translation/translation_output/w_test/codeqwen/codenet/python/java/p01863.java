Here is the Java version of the provided Python code:

```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int length = s.length();
        int BASE = 100;
        long MOD1 = 1000000007;
        long MOD2 = 2147483647;
        long acc1 = 0;
        long acc2 = 0;
        List<Long> hlst1 = new ArrayList<>();
        List<Long> hlst2 = new ArrayList<>();
        for (char c : s.toCharArray()) {
            int i = (int) c;
            acc1 = (acc1 * BASE + i) % MOD1;
            acc2 = (acc2 * BASE + i) % MOD2;
            hlst1.add(acc1);
            hlst2.add(acc2);
        }

        long[][] hashes = new long[length][3];
        for (int i = 0; i < length; i++) {
            hashes[i][0] = hlst1.get(i);
            hashes[i][1] = hlst2.get(i);
        }

        for (int i = length / 3; i >= 0; i--) {
            if ((length - (i + 1) * 3) % 2 != 0) continue;
            int alen = i + 1;
            int blen = (length - (i + 1) * 3) / 2;
            if (blen <= 0) continue;
            long[] ha1 = hashes[alen - 1];
            long[] ha2 = hashes[blen + alen * 2 - 1];
            if (!Arrays.equals(ha1, ha2)) continue;
            long[] ha3 = hashes[blen * 2 + alen * 2 - 1];
            if (!Arrays.equals(ha1, ha3)) continue;
            long[] hb1 = has
