Below is the Python code translated into Java. The equivalent Java code will read input using a Scanner, and use `System.out.println` for output. Instead of `exit()`, we will `return` from the `main` method to stop execution.

```java
import java.util.Scanner;

public class DuplicateFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println((i + 1) + " " + (i + 2));
                return;
            }
        }
        
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 2)) {
                System.out.println((i + 1) + " " + (i + 3));
                return;
            }
        }

        System.out.println("-1 -1");
    }
}
```

This code will produce the same output as the Python code when provided the same input. When using this program, you can compile it using `javac DuplicateFinder.java` and run using `java DuplicateFinder`, then type the test input string into the console.
