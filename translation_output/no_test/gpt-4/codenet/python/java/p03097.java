Below is the translated Java code from the given Python code:

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static final int MAX_N = 1000000; // Assuming maximum limit for N

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (popCount(a ^ b) % 2 == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            List<Integer> result = f(n, a, b);
            String resultStr = result.stream().map(String::valueOf).collect(Collectors.joining(" "));
            System.out.println(resultStr);
        }
    }

    private static int popCount(int x) {
        int res = 0;
        for (int i = 0; i < 17; i++) {
            res += ((x >> i) & 1);
        }
        return res;
    }

    private static List<Integer> f(int m, int x, int y) {
        if (m == 1) {
            if (x == 0) {
                return Arrays.asList(0, 1);
            } else {
                return Arrays.asList(1, 0);
            }
        }

        int diff = 0;
        for (int i = 0; i < m; i++) {
            if (((x >> i) & 1) != ((y >> i) & 1)) {
                diff = i;
                break;
            }
        }

        int s = (x % (1 << diff)) + (((x / (1 << (diff + 1))) * (1 << (diff + 1))) >> 1);
        int t = (y % (1 << diff)) + (((y / (1 << (diff + 1))) * (1 << (diff + 1))) >> 1);
        int u = s ^ 1;
        List<Integer> left = f(m - 1, s, u);
        List<Integer> right = f(m - 1, u, t);
        int xBit = (x >> diff) & 1;
        int yBit = (y >> diff) & 1;

        for (int i = 0; i < left.size(); i++) {
            left.set(i, (left.get(i) % (1 << diff)) + ((1 << diff) * xBit) + (((left.get(i) / (1 << diff)) * (1 << diff)) << 1));
        }
        for (int i = 0; i < right.size(); i++) {
            right.set(i, (right.get(i) % (1 << diff)) + ((1 << diff) * yBit) + (((right.get(i) / (1 << diff)) * (1 << diff)) << 1));
        }

        left.addAll(right);
        return left;
    }
}
```

Some notes about the Java code:
- We have to define a separate `popCount` method for counting the number of 1s in the binary representation of a number.
- Instead of returning tuples or lists directly, we use `List<Integer>` and `Arrays.asList`.
- Java does not support integer division returning floats, so division results will naturally floor to the nearest integer.
- Lambda expressions and streams are used to join the numbers into a single string with spaces for the final print.
- The input is read using `Scanner` in Java.
- Java's bitwise operations are similar to those in Python, but with specific differences in syntax and usage.
- The maximum recursion limit is not set by default in Java, but there is a predefined maximum stack size for threads. If stack overflow is a concern due to deep recursion, JVM options or code adjustments may be necessary.

Make sure to run this Java program in an environment that supports at least Java 8 because of the use of lambda expressions and streams. If this is intended to be run with a different version, adjustments for compatibility may be required.
