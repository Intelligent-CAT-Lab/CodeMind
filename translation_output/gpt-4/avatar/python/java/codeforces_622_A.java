Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = 1;
        int r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            int idxcnt = mid * (mid + 1) / 2;
            if (idxcnt < n) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        l -= 1;
        idxcnt = l * (l + 1) / 2;
        System.out.println(n - idxcnt);
    }
}
```

Please note the following differences between Java and Python, which were handled in the provided translation:

1. In Java, you need to import the Scanner class to read from standard input, while in Python, you simply use the `input()` function.

2. All variables and operations that involve division in Java and are meant to hold integer values should use integer division `/`, which is the default when both operands are integers.

3. In Java, you need to declare the type of each variable. In this case, `n`, `l`, `r`, `mid`, and `idxcnt` are declared as `int`.

4. The print statement in Python is replaced by `System.out.println()` in Java.

5. Unlike Python, which can print an integer directly without casting, you must make sure that the type you wish to print matches the method you are using in Java (`System.out.println()`). Since the value to print in this case is already an integer, no casting is necessary.

6. Java classes and methods need access modifiers specified (e.g., `public`).

7. Java code needs to be contained inside a class, and in this case, the program execution starts from the `main` method within the `Main` class.
