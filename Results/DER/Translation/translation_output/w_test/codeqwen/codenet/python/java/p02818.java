Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        if (a <= k) {
            k -= a;
            a = 0;
        } else {
            System.out.println(a - k + " " + b);
            return;
        }
        System.out.println(0 + " " + Math.max(b - k, 0));
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, and then checks if the first integer is less than or equal to the third integer. If it is, it subtracts the first integer from the third integer and sets the first integer to zero. If it isn't, it prints the difference between the first integer and the third integer, and the second integer. If the second integer is less than the third integer, it prints the second integer, otherwise it prints zero.
