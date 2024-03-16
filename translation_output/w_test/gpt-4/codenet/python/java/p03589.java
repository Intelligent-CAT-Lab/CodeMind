Below is the Python code translated into Java. The code structure and logic have been translated to adhere to Java's syntax and conventions.

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int h = 1; h <= 3500; h++) {
            for (int n = h; n <= 3500; n++) {
                if (4 * n * h - N * h - N * n > 0) {
                    if ((N * h * n) % (4 * n * h - N * h - N * n) == 0) {
                        int w = (N * h * n) / (4 * n * h - N * h - N * n);
                        System.out.println(h + " " + n + " " + w);
                        System.exit(0);
                    }
                }
            }
        }
        scanner.close();
    }
}
```

Enclosed in the Java code is the structure to read input from the console, implement the same nested for loop logic, and use an `if` statement to check the condition and print out the result. Note that `System.exit(0)` is used to exit the program, similar to `sys.exit()` in Python.

You can compile and run this Java code using a Java compiler and the following test input should give you the expected output:

**Test input:**
```
2
```

**Expected output:**
```
1 2 2
```
