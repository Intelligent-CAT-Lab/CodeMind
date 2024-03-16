Below is the translation of the provided Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        if (d > 0) {
            System.out.println(2 * (n - d) * (m - 1) / Math.pow(n, 2));
        } else {
            System.out.println((double) (m - 1) / n);
        }

        scanner.close();
    }
}
```
This Java program will do the equivalent operation: it reads three integer inputs for `n`, `m`, and `d`, and then performs the conditional operation, printing out the result. In Java, division of integers would result in integer division, so casting or using `double` is necessary for correct division results, as shown in the `(double) (m - 1) / n`. The Java `Math.pow` method is used to raise `n` to the power of 2.
