Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

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

This Java program does the same thing as your Python code. It reads three integers from the user, and then checks if the second integer is less than or equal to the first one. If it is, it prints "delicious". If the second integer minus the first one is less than or equal to the third integer, it prints "safe". Otherwise, it prints "dangerous".
