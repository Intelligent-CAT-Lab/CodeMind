Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 1; i < 100000; i++) {
            if (360 * i % x == 0) {
                System.out.println(360 * i / x);
                break;
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then loops from 1 to 99999. If the product of 360 and the current number is divisible by the user's input, it prints the result of the division and breaks the loop.
