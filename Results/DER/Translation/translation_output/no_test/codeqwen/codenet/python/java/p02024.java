Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.close();

        if (h * w % 2 == 1) {
            if ((s + t) % 2 == 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } else {
            System.out.println("Yes");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, calculates the product of `h` and `w`, and checks if the result is odd or even. If the product is odd, it checks if the sum of `s` and `t` is odd or even. If the sum is odd, it prints "No", otherwise it prints "Yes". If the product is even, it always prints "Yes".
