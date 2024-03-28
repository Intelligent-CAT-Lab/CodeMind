Here is the equivalent Java code for the Python code provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        int g = gcd(W, H);
        long result = ((long)W * H * C) / (g * g);
        System.out.println(result);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```

Please note that we've changed the result's type to `long` to prevent integer overflows due to the W*H*C multiplication, which could potentially exceed the range of `int` if the numbers are large enough.
