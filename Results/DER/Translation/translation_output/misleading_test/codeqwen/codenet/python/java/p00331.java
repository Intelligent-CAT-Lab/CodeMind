Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int R = scanner.nextInt();

        if (H >= 0) {
            System.out.println(1);
        } else if (H < 0) {
            if (H + R > 0) {
                System.out.println(1);
            } else if (H + R == 0) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, and then checks if the first integer is greater than or equal to zero. If it is, it prints 1. If it isn't, it checks if the sum of the first integer and the second integer is greater than zero. If it is, it prints 1. If it isn't, it checks if the sum of the first integer and the second integer is equal to zero. If it is, it prints 0. If it isn't, it prints -1.
