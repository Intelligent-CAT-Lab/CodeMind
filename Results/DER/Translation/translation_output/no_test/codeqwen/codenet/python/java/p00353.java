Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int f = scanner.nextInt();
        int b = scanner.nextInt();

        if (m + f < b) {
            System.out.println("NA");
        } else if (m >= b) {
            System.out.println("0");
        } else {
            System.out.println(b - m);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, and then checks if the sum of `m` and `f` is less than `b`. If it is, it prints "NA". If `m` is greater than or equal to `b`, it prints "0". Otherwise, it prints `b - m`.
