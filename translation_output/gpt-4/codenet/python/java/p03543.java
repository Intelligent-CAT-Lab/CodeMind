Below is the Java translation of the provided Python code. Please note that Java is statically typed, so we need to declare the type of variables. We also work with a `Scanner` object to handle user input instead of Python's `input()` function. Additionally, the method of comparing characters in a `String` is different in Java. Instead of tuple unpacking like in Python, we use the `String.charAt()` method to access individual characters.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();

        char a = N.charAt(0);
        char b = N.charAt(1);
        char c = N.charAt(2);
        char d = N.charAt(3);
        if (a == b && b == c || b == c && c == d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

When using this Java code, make sure that the input `N` is a `String` that has exactly four characters, since this code assumes there are no checks on the length of `N`. The original Python code also does not handle this, so I have excluded it to keep with the spirit of the original code. If you want to enforce that `N` has exactly four characters, you would need to add an additional check.
