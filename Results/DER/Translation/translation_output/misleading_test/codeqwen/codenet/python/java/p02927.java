Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int ans = 0;
        for (int i = 22; i <= d; i++) {
            int d0 = i % 10;
            int d1 = i / 10;
            if (d0 == 1 || d0 == 0) {
                continue;
            }
            if (m >= d0 * d1) {
                ans += 1;
                //System.out.println(i);
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, then it iterates over all numbers from 22 to the given number `d`. For each number, it calculates the last digit and the first digit, and if the product of these two digits is less than or equal to `m`, it increments the `ans` variable. Finally, it prints the value of `ans`.
