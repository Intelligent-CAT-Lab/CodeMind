Here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        scanner.close();

        if (c - a - b < 0) {
            System.out.println("No");
        } else {
            System.out.println(4 * a * b < (c - a - b) * (c - a - b) ? "Yes" : "No");
        }
    }
}
```

This Java code snippet should produce the same output as the provided Python code for the same inputs. Please note that I've used `long` instead of `int` for the variables to ensure that the product and squares do not overflow in case of large input values.
