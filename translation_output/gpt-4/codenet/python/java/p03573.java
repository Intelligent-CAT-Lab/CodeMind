Here is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b) {
            System.out.println(c);
        } else if (b == c) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        scanner.close();
    }
}
```

This Java code performs the same logic as the given Python code: it reads three integers, and then based on their values, it decides which one to print according to the given conditions.
