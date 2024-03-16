Here's the translated code from Python to Java:

```java
import java.util.Scanner;

public class SumOfFourNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int b = scanner.nextInt();
        int w = scanner.nextInt();
        int g = scanner.nextInt();

        System.out.println(r + b + w + g);

        scanner.close();
    }
}
```

When you run this Java program, it will read four integers from the standard input (just like the provided test input "4 2 1 1") and print their sum, which would be "8" for the provided test case.
