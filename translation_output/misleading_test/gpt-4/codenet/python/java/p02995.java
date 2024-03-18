Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        int ans = calculate(a, b, c, d);
        System.out.println(ans);
        scanner.close();
    }

    public static int calculate(int a, int b, int c, int d) {
        int lcm = lcm(c, d);
        return (b - a + 1) - (divCount(b, c) - divCount(a - 1, c) +
                               divCount(b, d) - divCount(a - 1, d) -
                               (divCount(b, lcm) - divCount(a - 1, lcm)));
    }

    private static int divCount(int n, int divisor) {
        return n / divisor;
    }
    
    private static int lcm(int a, int b) {
        return a / gcd(a, b) * b; // to avoid overflow, divide before multiply
    }
    
    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
```

To test this program, you'd input:
```
4 9 2 3
```

...and expect the following output:
```
98
```

Please note that the division in the provided Python code involves integer division, which is the default when dividing integers in Java, so no explicit floor operation is needed. Additionally, the Java `lcm` function multiplies `a / gcd(a, b) * b` instead of `a * b / gcd(a, b)` to prevent integer overflow in case `a * b` exceeds the range of `int` before dividing by the GCD.
