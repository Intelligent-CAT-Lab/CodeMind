Here's the Java translation for the provided Python code:

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

        scanner.close();
    }
}
```

This Java program should produce the same output as the Python program for the given input. It reads two integers from standard input, checks the conditions, and prints out "Possible" or "Impossible".
