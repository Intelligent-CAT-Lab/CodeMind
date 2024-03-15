Here's how the Python code translates to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        if (n < 1) {
            if (m < 1) {
                System.out.println(n + " " + m);
                System.exit(0);
            }
            System.out.println("Impossible");
            System.exit(0);
        }
        
        int min, max;
        if (m > n) {
            min = m;
            max = n + m - 1;
        } else {
            min = n;
            max = n + m - 1;
            if (m == 0) {
                max = n;
            }
        }
        System.out.println(min + " " + max);
    }
}
```

Please note a few things when translating Python to Java code:

- In Java, you must declare the data type of variables, in this case `int` for `n` and `m`.
- I have used `System.exit(0);` to terminate the program, which is similar to `quit()` in Python.
- Print statements in Java are expressed as `System.out.println()`.
- I imported `java.util.Scanner` for taking input as there's no direct equivalent to Python's `input()` in Java.
- Since we are writing a complete Java class, we need to define a `main` method which is the entry point to the program.
- Java uses curly brackets `{}` to define the scope of code blocks instead of indentation as in Python.
