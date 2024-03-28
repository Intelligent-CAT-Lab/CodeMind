Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (B % A == 0) {
            System.out.println(-1);
            return;
        }

        int _k = (int) Math.ceil((double) B / A);

        for (int k = _k; k < _k + (int) 1e7; k++) {
            int bn = (k * A) / B;
            int rem = (k * A) % B;
            int an = rem / A;
            rem = rem % A;
            int n = bn + an + rem;
            if (n > k) {
                System.out.println(k * A);
                return;
            }
        }
        System.out.println(-1);
        scanner.close();
    }
}
```

Make sure that when you run this java program, you provide input the same way as mentioned in the test case. The `Scanner` class is used in Java to read input from the console.

Please note that there are differences in how Python and Java handle division and modulus operations, which has been taken into account in this translation. Java requires explicit type casting for certain operations, especially when you are aiming for results similar to Python's rounding behavior in division (`Math.ceil` is used here for that purpose).
