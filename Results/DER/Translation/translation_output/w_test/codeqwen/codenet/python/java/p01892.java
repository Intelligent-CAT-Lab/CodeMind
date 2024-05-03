Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        int score = Math.abs(a - b);
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                if (b * x % y == 0) {
                    int new_a = b * x / y;
                    score = Math.min(score, Math.abs(a - new_a));
                }
            }
        }
        System.out.println(score);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, calculates the absolute difference between the two numbers, and then iterates over all possible pairs of integers from 1 to n. If the product of the second number and the current x is divisible by the current y, it calculates the new first number by dividing the product of the second number and the current x by the current y. It then calculates the absolute difference between the new first number and the first number and updates the score if this new difference is smaller than the current score. Finally, it prints the score.
