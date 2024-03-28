Here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        if (d > 0) {
            System.out.printf("%.10f", 2.0 * (n - d) * (m - 1) / (n * n));
        } else {
            System.out.printf("%.10f", (double)(m - 1) / n);
        }
    }
}
```

To use this code, compile and execute the `Main` class, then provide input when prompted. The code accepts three integers `n`, `m`, and `d`, separated by spaces, and produces the expect output as specified.
