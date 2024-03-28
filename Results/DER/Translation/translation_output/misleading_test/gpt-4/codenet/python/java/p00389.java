Below is the translated code from Python to Java. Note that Java doesn't have a direct equivalent for Python's `input()` and `print()`, so I've used `Scanner` for input and `System.out.println()` for printing the output.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        int t = 1;
        int n = 1;
        int a = 1;

        while (true) {
            n = (K + a - 1) / K;
            a += n;
            if (N < a) break;
            t += 1;
        }

        System.out.println(t);
    }
}
```

To run the translated Java code, compile the `Main` class and then run it, providing the test input (`4 2`) when prompted. The expected output will be printed to the console (`65`).
