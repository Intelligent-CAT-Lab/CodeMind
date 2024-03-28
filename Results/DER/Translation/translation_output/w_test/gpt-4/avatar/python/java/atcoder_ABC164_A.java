Below is the translated code from Python to Java. Make sure to run the Java code within an environment that allows console input and output.


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int W = scanner.nextInt();

        if (S <= W) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }

        scanner.close();
    }
}
```

To run a test case for this Java program, you would compile and execute the `Main` class, then provide an input like `1 100` and expect an output of `unsafe`.
