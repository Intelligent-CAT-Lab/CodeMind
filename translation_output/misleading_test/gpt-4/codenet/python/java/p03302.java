Here is the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class ArithmeticChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a + b == 15) {
            System.out.println('+');
        } else if (a * b == 15) {
            System.out.println('*');
        } else {
            System.out.println('x');
        }

        sc.close();
    }
}
```

- This Java code takes two integers as input, similar to the Python code.
- It then checks if their sum or product equals 15 and prints the corresponding symbol or 'x' if neither condition is true.
- The `Scanner` class is used for input, and it is closed after use with `sc.close()`.
- Since Java is statically typed, we declare the types of the variables `a` and `b` as `int`.
- The `main` method and the `ArithmeticChecker` class are used as the entry point for the program execution.
