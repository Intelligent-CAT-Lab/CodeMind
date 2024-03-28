Here's the Python code translated to Java, using appropriate Java syntax and data types:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Solution {
    static final int MOD = 1000000007;

    public static BigInteger[] prepare(int n, int MOD) {
        BigInteger[] factorials = new BigInteger[n + 1];
        factorials[0] = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorials[i] = factorials[i - 1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
        }
        BigInteger[] finvs = new BigInteger[n + 1];
        finvs[n] = factorials[n].modInverse(BigInteger.valueOf(MOD));
        for (int i = n; i > 1; i--) {
            finvs[i - 1] = finvs[i].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
        }
        return new BigInteger[]{factorials, finvs};
    }

    public static BigInteger solve(int n, int a) {
        BigInteger[] prepared = prepare(n, MOD);
        BigInteger[] facts = prepared[0];
        BigInteger[] finvs = prepared[1];
        
        BigInteger[] invs = new BigInteger[n + 1];
        for (int i = 0; i <= n; i++) {
            invs[i] = facts[i].multiply(finvs[i]).mod(BigInteger.valueOf(MOD));
        }
        
        int r = n - a;
        BigInteger ans = BigInteger.ZERO;
        
        for (int l = 0; l < a; l++) {
            BigInteger tmp1 = facts[a].multiply(finvs[l]).mod(BigInteger.valueOf(MOD))
                    .multiply(finvs[a - l]).mod(BigInteger.valueOf(MOD));
            BigInteger tmp2 = facts[n - l - 1].multiply(BigInteger.valueOf(a - l)).mod(BigInteger.valueOf(MOD));
            if (l % 2 == 1) // (-1) ** (l & 1)
                ans = ans.subtract(tmp1.multiply(tmp2)).mod(BigInteger.valueOf(MOD));
            else
                ans = ans.add(tmp1.multiply(tmp2)).mod(BigInteger.valueOf(MOD));
        }
        
        for (int k = 1; k < a; k++) {
            for (int l = 0; l < k; l++) {
                BigInteger tmp1 = facts[k].multiply(finvs[l]).mod(BigInteger.valueOf(MOD))
                        .multiply(finvs[k - l]).mod(BigInteger.valueOf(MOD));
                BigInteger tmp2 = facts[n - l - 1].multiply(BigInteger.valueOf(k - l)).mod(BigInteger.valueOf(MOD))
                        .multiply(invs[r + k - l]).mod(BigInteger.valueOf(MOD));
                if (l % 2 == 1) // (-1) ** (l & 1)
                    ans = ans.subtract(tmp1.multiply(tmp2)).mod(BigInteger.valueOf(MOD));
                else
                    ans = ans.add(tmp1.multiply(tmp2)).mod(BigInteger.valueOf(MOD));
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();

        System.out.println(solve(n, a));

        scanner.close();
    }
}
```

This Java code assumes that the integers involved in the operations may exceed the range of Java's `int` type, therefore, `BigInteger` is used for calculations involving modular arithmetic to handle potentially very large numbers. Another thing to note is that Java's `BigInteger` provides a method `modInverse()` that implements the equivalent functionality of Python's `pow(factorials[n], MOD - 2, MOD)` to calculate modular inverses.

The `main` method now takes input from the user via `Scanner` just like the original Python code. Make sure to import the required classes at the beginning of the file and encapsulate all operations within a class as Java requires.
