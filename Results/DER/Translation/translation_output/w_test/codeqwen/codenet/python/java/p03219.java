Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ab = scanner.nextInt();
        int bc = scanner.nextInt();
        int fare = (int) (ab + bc / 2.0);
        System.out.println(fare);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, adds them together, and then divides the sum by 2. The result is then cast to an integer before being printed to the console. The `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer from the user. The `/` operator in Java performs floating-point division, so we cast one of the operands to a double to ensure that the division is performed as floating-point division.
