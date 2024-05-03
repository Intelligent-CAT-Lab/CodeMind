Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(n - (c + a - c + b - c));
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, calculates the result, and prints it. The `Scanner` class is used to read input from the user.
