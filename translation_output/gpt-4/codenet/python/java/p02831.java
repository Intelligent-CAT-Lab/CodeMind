Here's the Python code above translated into Java. Note that Java is statically-typed and more verbose than Python, and we must declare the type of each variable. Also, Java doesn't natively support tuple assignments like Python, so swapping values requires a temporary variable.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        System.out.println(lcm(A, B));
    }

    /**
     * ユークリッド互除法を使った最大公約数の求め方
     * @param a First number
     * @param b Second number
     * @return Greatest common divisor of a and b
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    /**
     * 最小公倍数の求め方
     * @param a First number
     * @param b Second number
     * @return Least common multiple of a and b
     */
    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}
```

Some notes on the Java implementation:

1. We import `java.util.Scanner` to read from standard input, which is how we can achieve an analog to Python's `input().split()` for two integers.
2. We use the `nextInt()` method of `Scanner` to read integers `A` and `B`.
3. The `Scanner` should be closed after we're done using it with `sc.close()`.
4. Java uses explicit static typing for method return types and parameters.
5. In the `gcd` method, we need to use a temporary variable `temp` to swap `a` and `b`.
6. The `lcm` method is almost a direct translation, but note we perform the division before the multiplication to prevent potential integer overflow.
