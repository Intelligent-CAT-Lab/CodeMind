Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int ans = 0;
        for (int y = 1; y < 50; y++) {
            int x = (int) Math.pow(y + a, n);
            if (1 <= x && x <= m && y == sumDigits(x)) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, calculates the sum of digits of the power of each number from 1 to 49 (inclusive), and counts how many of these sums are equal to the number itself. The result is then printed to the console.
