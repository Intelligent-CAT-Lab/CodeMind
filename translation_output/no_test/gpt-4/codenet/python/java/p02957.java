Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        scanner.close();

        if (A == B) {
            System.out.println("IMPOSSIBLE");
        } else {
            double x = (Math.pow(A, 2) - Math.pow(B, 2)) / (2.0 * (A - B));
            if (x % 1 == 0) {
                System.out.println((int) x);
            } else {
                System.out.println("IMPOSSIBLE");
            }
        }
    }
}
```

Please note the following:
- Java requires data types to be declared, therefore, `A` and `B` are declared as integers.
- In Java, input is taken from the user using a `Scanner` object.
- We split the input line by spaces to separate `A` and `B`, and then parse the individual strings to integers.
- Java's `Math.pow` is used to perform exponentiation similar to `**` in Python.
- The division operation `/` generates a `double` result by default when dividing two integers in Java.
- The condition `if (x % 1 == 0)` checks if the result of the operation is an integer; if so, it prints the integer cast of `x`.
- The code includes a check for the case when `A` equals `B` to avoid division by zero and directly print "IMPOSSIBLE". This case is implicitly handled in Python due to the way the floating-point division works.
