Here's the equivalent Java code for the Python code you've provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= 100 && b <= 100) {
            System.out.printf("%.4f%n", a * b / 3.305785);
        }

        scanner.close();
    }
}
```

For your test input "15 25", you can run this Java program and it should give you the expected output "24.0430". Note that in Java `System.out.printf` is used to format strings similarly to the Python `print(f"{}")` syntax, and `%.4f%n` is used to format the floating-point number to four decimal places followed by a line separator.
