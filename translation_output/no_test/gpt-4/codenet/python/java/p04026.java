Here's the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println((i + 1) + " " + (i + 2));
                System.exit(0);
            }
        }
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 2)) {
                System.out.println((i + 1) + " " + (i + 3));
                System.exit(0);
            }
        }
        System.out.println("-1 -1");
        scanner.close();
    }
}
```

Please note that in Java, strings are 0-indexed as in Python, but the problem's output format requires 1-indexed positions. That's why `(i + 1)` is used instead of `i` when printing the indices. Since the original Python code exits immediately after finding a match, the equivalent `System.exit(0);` call is used in Java to terminate the program.
