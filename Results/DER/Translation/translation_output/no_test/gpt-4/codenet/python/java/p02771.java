Here is the translation of your Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if ((a == b && b != c) || (b == c && a != b) || (a == c && a != b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```
In this Java code, we have created a `Scanner` to read from the standard input, similar to the `input()` in Python. We then read three integers `a`, `b`, and `c`. The conditions are directly translated from Python's `if-elif-else` block to Java's `if-else` statement. Lastly, we have used `System.out.println` to print the result and closed the scanner at the end to prevent resource leaks.
