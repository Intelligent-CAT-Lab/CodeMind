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
            // If the number of steps is less than or equal to K, calculate the remainder of X divided by D
            int remainder = Math.abs(X) % D;

            // If the remainder is even, subtract D from it
            if (remainder % 2 == 0) {
                ans = remainder;
            } 
            // If the remainder is odd, subtract 2*D from it
            else {
                ans = remainder - 2 * D;
            }
        }

        // Print the result
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, calculates the number of steps to reach the target, and then determines the final answer based on whether the number of steps is greater than K or not.
