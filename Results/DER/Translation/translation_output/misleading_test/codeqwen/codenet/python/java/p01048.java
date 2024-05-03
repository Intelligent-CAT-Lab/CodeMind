Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int target = 1;
        while (true) {
            int count = 0;
            for (int i = 1; i <= target; i++) {
                if (target % i == 0) {
                    count += 1;
                }
            }
            if (count == N) {
                System.out.println(target);
                break;
            }
            target += 1;
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then it enters a loop that continues until it finds a number that has exactly `N` divisors. The number of divisors of a number `x` is the count of all numbers `i` from `1` to `x` that divide `x` without leaving a remainder. The code checks each number from `1` to `target` and increments `count` if `target` is divisible by `i`. If `count` equals `N`, it prints `target` and breaks the loop. Otherwise, it increments `target` and continues the loop.
