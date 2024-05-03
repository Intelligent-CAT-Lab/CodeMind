Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int K = scanner.nextInt();
        int D = scanner.nextInt();
        scanner.close();

        // Calculate the number of steps to reach the target
        int count = Math.abs(X) / D;

        int ans = 0;

        // If the number of steps is greater than K, subtract D*K from the absolute value of X
        if (count > K) {
            ans = Math.abs(X) - D * K;
        } else {
            // If the difference between K and count is even, take the remainder of X divided by D
            if ((K - count) % 2 == 0) {
                ans = Math.abs(X) % D;
            }
            // If the difference between K and count is odd, take the remainder of the absolute value of X divided by D minus D
            else {
                ans = Math.abs(Math.abs(X) % D - D);
            }
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, calculates the number of steps to reach the target, and then determines the answer based on whether the number of steps is greater than K or not.
