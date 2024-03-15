Here is the translation of your Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println((a % 2 != 0 && b % 2 != 0) ? "Yes" : "No");
    }
}
```

Explanation:

1. We import the `Scanner` class, which is used to get user input in Java.
2. We create a `Scanner` object to read input from `System.in`.
3. We read two integers `a` and `b` using `nextInt()`.
4. Finally, we use a ternary operator `(condition) ? (if_true) : (if_false)` to check if both `a` and `b` are odd. If both are odd, "Yes" is printed; if not, "No" is printed.
