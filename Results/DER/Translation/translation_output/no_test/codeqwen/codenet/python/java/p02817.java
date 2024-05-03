Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();

        System.out.println(T + S);
    }
}
```

In this Java code, we are using `Scanner` class to read the input from the user. The `next()` method is used to read the next token from the input as a string. The `System.out.println()` method is used to print the concatenated string.
