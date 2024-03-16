Here's the translated code in Java:

```java
import java.util.Scanner;

public class SquareMaximizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        int a = (int)Math.sqrt(n);
        System.out.println(a * a);
        scanner.close();
    }
}
```

To run this Java program, compile it and execute the `SquareMaximizer` class with standard input providing the test value `10`. The application will print `9` to the standard output according to the expected output for the given test case.
