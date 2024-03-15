Certainly! The given Python code takes two input integers `n` and `m`, then computes a series of values in an array `d` and prints the last value of the array. Let's translate this into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        long[] d = new long[n + 1];
        final long MOD = (long) 1e9 + 7;

        d[0] = 1;
        for (int i = 1; i <= n; i++) {
            d[i] = ((long) (m - i + 1) * ((m - n + i - 1) * d[i - 1] + i * d[i - 2] * (m - i))) % MOD;
        }

        System.out.println(d[n]);

        sc.close();
    }
}
```

Note the following about the Java code:
- I replaced `(10**9 + 7)` with `(long) 1e9 + 7` which is its equivalent in Java.
- I changed `print(d[-1])` to `System.out.println(d[n])` as Java arrays do not support negative indexing and `d[-1]` is equivalent to `d[n]` in the original Python code (accessing the last element).
- I added `long[] d = new long[n + 1];` since Java doesn't allow dynamic array like Python lists, and we need to specify the size when the array is created. The elements of this array are initialized to `0` by default in Java, so I explicitly set `d[0] = 1`.
- Java doesn't support multiple assignment like Python does, so I split the input parsing into two separate statements.
- Java's strict type system requires casting to `long` in the mathematical expression to avoid integer overflow.
- I used a `Scanner` to read input from the console. The `Scanner` must be closed afterward with `sc.close()` to avoid resource leaks.
