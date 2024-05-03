Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (n >= 2) {
            if (b >= a) {
                System.out.println((n - 2) * (b - a) + 1);
            } else {
                System.out.println(0);
            }
        } else {
            if (a == b) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, and then checks if the first integer is greater than or equal to 2. If it is, it checks if the second integer is greater than or equal to the first integer. If it is, it calculates the result and prints it. If the second integer is not greater than or equal to the first integer, it prints 0. If the first integer is less than 2, it checks if the second integer is equal to the first integer. If it is, it prints 1. If the second integer is not equal to the first integer, it prints 0.
