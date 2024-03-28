Below is the Java translation of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        scanner.close();

        double result = input * 6.28;
        System.out.printf("%.20f", result);
    }
}
```

This Java program will read an integer from the standard input, multiply it by 6.28, and print the result with a precision of up to 20 decimal places, as specified by the "%.20f" format specifier in `printf` method.
