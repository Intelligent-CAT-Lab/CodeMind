Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (c - a - b < 0) {
            System.out.println("No");
        } else {
            System.out.println((4 * a * b < (c - a - b) * (c - a - b)) ? "Yes" : "No");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, then checks if the third integer is less than the sum of the first two integers. If it is, it prints "No". If it isn't, it checks if the product of the first two integers is less than the square of the difference between the third and the sum of the first two integers. If it is, it prints "Yes". If it isn't, it prints "No".
