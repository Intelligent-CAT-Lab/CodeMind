Sure! Below is the equivalent Java code to perform the same operation as the Python code you've provided:

```java
import java.util.Scanner;

public class AddHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int result = (a + b) % 24;
        System.out.println(result);
    }
}
```

This Java code snippet takes two integers as input, similar to the `input().split()` in Python. It then calculates the sum and finds the remainder when divided by 24 to mimic the behavior of the modulo operator in the original Python code.
