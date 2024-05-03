Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        System.out.println((int) Math.ceil((double) h / a));
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, divides the first by the second, and then rounds up the result to the nearest whole number. The `(int)` cast is used to convert the result of the `Math.ceil` function from a `double` to an `int`.
