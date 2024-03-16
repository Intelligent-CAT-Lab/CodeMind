Here's the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean found = false;

        for (int i = -1000; i < 1000 && !found; i++) {
            for (int j = -1000; j < 1000; j++) {
                if (Math.pow(i, 5) - Math.pow(j, 5) == x) {
                    System.out.println(i + " " + j);
                    found = true;
                    break;
                }
            }
        }

        scanner.close();
    }
}
```

Here is what changes have been made to translate the Python code to Java:

1. Java requires the declaration of types for variables. The variable `x` is declared with the type `int`.
2. `input()` in Python is replaced with `new Scanner(System.in)` in Java for console input.
3. `int(input())` in Python, which casts the input to integer, is replaced with `scanner.nextInt()` in Java, which reads an integer from the input.
4. The Python `for` loop is directly translated to a Java `for` loop, maintaining the same range.
5. `i**5` in Python is replaced with `Math.pow(i, 5)` in Java, which is the java.lang.Math static method to calculate the power.
6. The `else: continue` part in Python is not necessary in Java, because Java's `for` loops don't have an `else` clause.
7. The `print` function in Python is replaced with `System.out.println` in Java.
8. The `break` statements are used similarly in Java to exit the loops.
9. A `boolean` variable named `found` is used to determine when to break out of the outer loop since Java does not support label break as directly as Python.
10. `scanner.close();` is added to close the scanner object at the end of the program. This is a good practice to free resources associated with the scanner.

The Java code should produce the same output as the given Python code when compiled and executed.
