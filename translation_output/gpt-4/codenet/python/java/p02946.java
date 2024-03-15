Here is the equivalent Java code for the given Python script:

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.lang.Math;
import java.math.BigInteger;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    static final long INTMAX = Long.MAX_VALUE;
    static final long INTMIN = Long.MIN_VALUE;
    static final long DVSR = 1000000007;

    public static long POW(long x, long y) {
        return BigInteger.valueOf(x).modPow(BigInteger.valueOf(y), BigInteger.valueOf(DVSR)).longValue();
    }

    public static long INV(long x) {
        return BigInteger.valueOf(x).modInverse(BigInteger.valueOf(DVSR)).longValue();
    }

    public static long DIV(long x, long y) {
        return (x * INV(y)) % DVSR;
    }

    public static int[] LI() {
        return Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    public static double[] LF() {
        return Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
    }

    public static String[] LS() {
        return sc.nextLine().split(" ");
    }

    public static int II() {
        return Integer.parseInt(sc.nextLine());
    }

    public static long[] FLIST(int n) {
        long[] res = new long[n + 1];
        res[1] = 1;
        for (int i = 1; i <= n; i++) {
            res[i] = res[i - 1] * i % DVSR;
        }
        return res;
    }

    public static long gcd(long x, long y) {
        if (x < y) {
            long t = x;
            x = y;
            y = t;
        }
        long div = x % y;
        while (div != 0) {
            x = y;
            y = div;
            div = x % y;
        }
        return y;
    }

    public static void main(String[] args) {
        int[] inputs = LI();
        int K = inputs[0];
        int X = inputs[1];

        for (int i = Math.max(X - K + 1, -1000000); i < Math.min(X + K, 1000000); i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
```

To compile and run this code, ensure you have Java installed on your system. Save this code in a file named `Main.java`, and use the following commands:

```
javac Main.java
java Main
```

Remember that Java is a statically typed language, and dealing with inputs in Java usually involves more code compared to Python. I used `Scanner` to handle inputs and `BigInteger` for modular exponentiation and inverse due to a lack of built-in modular inverse and exponentiation methods in Java that work with modulos. Also, note that I converted recursive Python functions to iterative Java methods to avoid stack overflow since Java doesn't easily handle deep recursion due to its fixed stack size.
