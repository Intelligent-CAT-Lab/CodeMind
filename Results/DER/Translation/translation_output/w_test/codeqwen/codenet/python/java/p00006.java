Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);
    }
}
```

This Java code does the same thing as your Python code: it reads a line of input from the user, reverses the string, and then prints the reversed string. The `StringBuilder` class in Java is used to create mutable strings, and the `reverse()` method reverses the string.
