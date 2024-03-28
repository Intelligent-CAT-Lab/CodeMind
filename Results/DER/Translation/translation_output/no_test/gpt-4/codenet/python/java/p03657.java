Certainly! Here is the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class SharingCookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}
```

This Java code does the same thing as the Python code: it reads two integers `a` and `b`, and then checks if either of those integers or their sum is divisible by 3. If any of those conditions are true, it prints "Possible", otherwise it prints "Impossible".
