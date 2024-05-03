Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (Math.abs(a - b) < w) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(a - b) - w);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the absolute difference between the two integers, and then checks if this difference is less than the third integer. If it is, it prints 0. Otherwise, it prints the difference minus the third integer.
