Here's the Java equivalent of the Python code provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int T = scanner.nextInt();
        scanner.close();

        if (N % X != 0) {
            System.out.println((N / X) * T + T);
        } else {
            System.out.println((N / X) * T);
        }
    }
}
```

The code takes three integers as input, similar to the Python `input().split()` functionality, and computes the result based on the given condition. In Java, `Scanner` is used for input and we need to manually close the scanner after use. The division and modulo operations work similarly in Java. Since Java uses integer division for int types, there's no need for a floor operation as in the Python's `//` operator.
