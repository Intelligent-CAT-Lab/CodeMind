Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a < b) {
            System.out.println(b - a);
        } else {
            System.out.println(a - b);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, then checks if `a` is less than `b`. If it is, it prints the difference between `b` and `a`. If `a` is not less than `b`, it prints the difference between `a` and `b`.
