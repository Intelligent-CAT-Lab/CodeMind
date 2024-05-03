Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);

        if (b <= a) {
            System.out.println("delicious");
        } else if ((b - a) <= x) {
            System.out.println("safe");
        } else {
            System.out.println("dangerous");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, then checks if `b` is less than or equal to `a`. If it is, it prints "delicious". If `b` is greater than `a` and `b - a` is less than or equal to `x`, it prints "safe". Otherwise, it prints "dangerous".
