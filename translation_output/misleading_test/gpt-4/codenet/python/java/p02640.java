Here's the Python code translated to Java. The Java solution takes input using a `Scanner` object to read the two integers `x` and `y`. It then iterates through a `for` loop to calculate `b` for each `a` in the range from 0 to `x`, checking if the condition `(2*a + 4*b) == y` is met. If the condition is satisfied, `count` is set to 1 and the loop breaks. Finally, the code prints "Yes" if `count` is 1, otherwise it prints "No". 

Here's the equivalent Java code wrapped inside the `java` markdown:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        int count = 0;
        for (int a = 0; a <= x; a++) {
            int b = x - a;
            if ((2 * a + 4 * b) == y) {
                count = 1;
                break;
            }
            // no need for else part, Java does not need pass as in Python
        }

        System.out.println(count == 1 ? "Yes" : "No");
    }
}
```

When using this Java code as a solution, `x` and `y` should be input through standard input, separated by a space, and the expected output "Yes" or "No" will be printed to the standard output.
