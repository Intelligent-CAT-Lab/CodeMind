Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);
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

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the absolute difference between them, and then iterates over all possible pairs of integers from 1 to `n`. If the product of the second integer and the current pair is divisible by the current pair's first integer, it calculates the new value of `a` and updates the score if necessary. Finally, it prints the score.
