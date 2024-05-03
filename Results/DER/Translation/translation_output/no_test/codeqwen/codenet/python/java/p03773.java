Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println((a + b) % 24);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, adds them together, and then prints the remainder of the division of the sum by 24. The `Scanner` class is used to read input from the user.
