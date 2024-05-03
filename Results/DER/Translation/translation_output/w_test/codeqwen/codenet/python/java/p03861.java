Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();

        int result = (b / x) - ((a - 1) / x);

        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, performs the same operations as your Python code, and prints the result.
