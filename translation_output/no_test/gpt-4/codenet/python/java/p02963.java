Here's the Python code translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long S = scanner.nextLong();
        scanner.close();

        long X1 = 0;
        long Y1 = 0;
        long X2, Y2, X3, Y3;

        long tmp = (long) Math.sqrt(S);
        if (tmp * tmp >= S) {
            X2 = Y3 = tmp;
        } else {
            X2 = Y3 = tmp + 1;
        }

        long rest = X2 * X2 - S;

        if (rest == 0) {
            X3 = Y2 = 0;
        } else {
            if (rest < 1000000000L) {
                X3 = 1;
                Y2 = rest;
            } else {
                for (long i = 2; i <= (long) Math.sqrt(rest) + 1; i++) {
                    if (rest % i == 0) {
                        X3 = i;
                        Y2 = rest / i;
                        break;
                    }
                }
            }
        }

        System.out.println(X1 + " " + Y1 + " " + X2 + " " + Y2 + " " + X3 + " " + Y3);
    }
}
```

This Java code will replicate the functionality of the original Python code. It reads an integer from the user, calculates the specified values, and prints them out. The main differences in this translation involve syntax and type handling:

1. Java uses `long` for integer values that might exceed the range of `int`.
2. `Scanner` is used to read input from the user.
3. `Math.sqrt` returns a `double`, so casting is necessary when using it with `long`.
4. Java does not have an equivalent to Python's division operator `//` that performs floor division on integers, so the `/` operator is used to carry out the division since we are using `long` data type, which results in an integer division by default.
5. Java doesn't have built-in large number literals like Python; therefore, the `L` suffix is used to indicate a `long` literal.
