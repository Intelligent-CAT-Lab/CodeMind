Here is the equivalent Java code for the provided Python script. Please note that in Java, we need to handle input and output in a structured manner using classes and methods. I've implemented a simple solution assuming that the input will be provided through the `main` method arguments. For real-world applications, you might need to adjust this part to fetch input from the user, possibly using a `Scanner`.

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    static final long mod = 1000000007L;

    // Utility function to read an integer from stdin
    public static int i1() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    // Utility function to read an array of integers from stdin
    public static int[] i2() {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(" ");
        return new int[] { Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]) };
    }

    // Binary power function modulo mod
    public static long bp(long a, long n) {
        long r = 1L;
        while (n > 0) {
            if (n % 2 == 1) {
                r = r * a % mod;
            }
            a = a * a % mod;
            n >>= 1;
        }
        return r;
    }

    public static void main(String[] args) {
        int[] input = i2();
        int n = input[0];
        int k = input[1];

        if (n <= k) {
            long x = 1L;
            for (int i = 0; i < n - 1; i++) {
                x *= (2 * n - 1 - i);
                x %= mod;
            }
            long y = 1L;
            for (int i = 0; i < n - 1; i++) {
                y *= (i + 1);
                y %= mod;
            }
            System.out.println((x * bp(y, mod - 2)) % mod);
        } else {
            long x = 1L;
            long y = 1L;
            long t = 1L;
            for (int i = 0; i < k; i++) {
                t *= (i + 1);
                t %= mod;
                y *= (n - 1 - i);
                y %= mod;
                y *= (n - i);
                y %= mod;
                long c = bp(t, mod - 2);
                x += y * c % mod * c;
                x %= mod;
            }
            System.out.println(x);
        }
    }
}
```

Please note that binary exponentiation in Python (`bp(y, 10**9+5)`) uses the Fermat's little theorem to find the modulo inverse under the prime mod. This is done in Java with `bp(y, mod - 2)` since `mod` is a prime number.

In the test case:

```
Test input:
3 2

Expected output:
10
```

You can provide the input of "3 2" through standard input when running the Java program. The expected output will be printed to the console as "10".
