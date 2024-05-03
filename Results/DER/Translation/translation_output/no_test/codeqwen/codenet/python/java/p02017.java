Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        if (((H * W) * (X + Y)) % 2 == 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, calculates the product of the two first integers and the sum of the last two integers, and then checks if the result is odd or even. If it's odd, it prints "No", otherwise it prints "Yes".
