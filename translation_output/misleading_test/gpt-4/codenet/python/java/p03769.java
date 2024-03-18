Here's the equivalent Java code for the given Python code:

```java
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateSequence {

    private static final BigInteger[] fact = new BigInteger[101];

    static {
        fact[0] = BigInteger.ONE;
        for (int i = 1; i < fact.length; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i));
        }
    }

    private static BigInteger C(int a, int b) {
        return fact[a].divide(fact[b].multiply(fact[a - b]));
    }

    private static BigInteger sC(int a, int b) {
        BigInteger ret = BigInteger.ZERO;
        for (int i = 0; i <= Math.min(b, a - b); i++) {
            ret = ret.add(C(b, i).multiply(C(a - b, i)));
        }
        return ret;
    }

    private static List<String> calc(int n, int k) {
        if (n <= 0) {
            return new ArrayList<>();
        }

        int i = 0;
        while ((1 << (i + 1)) - 1 <= n) {
            i++;
        }

        List<String> ret = new ArrayList<>();
        for (int j = 0; j < i + 1; j++) {
            ret.add(String.valueOf(k));
        }
        int rem = n - ((1 << i) - 1);
        int kk = k + 1;
        i++;

        int j = i / 2;
        while (j > 0) {
            while (true) {
                BigInteger tmp = sC(i, j);
                if (tmp.compareTo(BigInteger.valueOf(rem)) <= 0) {
                    ret.add(j, String.valueOf(kk));
                    ret.add(String.valueOf(kk));
                    kk++;
                    rem -= tmp.intValue();

                } else {
                    break;
                }
            }
            j--;
        }

        ret.addAll(calc(rem, kk));
        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<String> X = calc(N, 1);

        System.out.println(X.size());
        System.out.println(String.join(" ", X));
        scanner.close();
    }
}
```

This code will produce the same result as the Python code. You can run it by copying the code into a Java file and compiling and running it with your Java Development Kit (JDK).
Note that BigInteger is used in place of integers because the factorial numbers can be very large, and Java does not have built-in support for bigint as Python does.
