Certainly! The following Java code replicates the functionality of the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int p = scanner.nextInt();
        scanner.close();

        System.out.println((3 * a + p) / 2);
    }
}
```

Explanation:

- We use the `Scanner` class to read input from the standard input (console).
- We call `nextInt()` on the `Scanner` object to read the next two integers, which correspond to the variables `a` and `p` in the original Python code.
- We then calculate `(3 * a + p) / 2` which is equivalent to `(3*a+p)//2` in Python (integer division in both cases).
- Finally, we print out the result using `System.out.println()`.

Remember that Java doesn't have a direct equivalent of Python's tuple assignment, so each variable is read separately. Furthermore, Java does integer division with `/` when both operands are integers, so the behavior is the same as `//` in Python.
