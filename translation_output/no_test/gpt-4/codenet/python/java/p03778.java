Here's the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = Math.abs(a - b) < w ? 0 : Math.abs(a - b) - w;
        System.out.println(result);
    }
}
```

Make sure to run this code within a class in a Java environment. The `Scanner` class is used to receive input, similar to `input().split()` in Python, and `System.out.println()` is used to print the output, analogous to `print()` in Python. Also note that Java requires explicit type declarations for variables.
