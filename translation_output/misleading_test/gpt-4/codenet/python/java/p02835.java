Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b + c < 22) {
            System.out.println("wi");
        } else {
            System.out.println("bust");
        }

        scanner.close();
    }
}
```

This Java code performs the same function as the original Python code. It reads three integer inputs, sums them, and then outputs "wi" if the sum is less than 22, or "bust" if the sum is 22 or greater. Make sure to compile and execute this code within a class structure in a Java programming environment.
