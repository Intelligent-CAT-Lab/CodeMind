Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        System.out.println(3 * (r * r));
    }
}
```

In this Java code, we are using the `Scanner` class to read the input from the user. The `nextInt()` method is used to read an integer from the user. The `System.out.println()` method is used to print the result. The expression `3 * (r * r)` is the same as the Python code `3*(r**2)`.
