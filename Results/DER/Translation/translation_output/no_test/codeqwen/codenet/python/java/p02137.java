Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = (int) (number / 500 * 500);
        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, performs the division and multiplication operations, and then prints the result. The `(int)` cast is used to ensure that the result is an integer.
