Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a * b);
    }
}
```

In this Java code, we are using the `Scanner` class to read the input from the user. The `nextInt()` method is used to read the integer input from the user. The `System.out.println()` method is used to print the result of the multiplication of `a` and `b`.
