Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int total = 1;
        int ans = 0;

        while (total < b) {
            ans += 1;
            total += a - 1;
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, adds them together, and then keeps adding the difference of the first integer to the total until the total is greater than or equal to the second integer. It then prints out the number of times it added the difference.
