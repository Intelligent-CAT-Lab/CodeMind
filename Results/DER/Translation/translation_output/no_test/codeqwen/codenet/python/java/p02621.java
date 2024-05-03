Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a + a * a + a * a * a);
    }
}
```

In this Java code, we use `Scanner` to read the input from the user. The `nextInt()` method is used to read an integer from the user. The `System.out.println()` method is used to print the result to the console. The expression `a * a + a * a * a` is equivalent to `a ** 2 + a ** 3` in Python.
