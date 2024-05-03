Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        boolean CielWon = false;
        while (y > 1 && x * 10 + y > 21) {
            int t = Math.min(x, 2);
            x -= t;
            y -= (2 - t) * 10 + 2;
            if (y < 2 || 10 * x + y < 22) {
                CielWon = true;
                break;
            }
            y -= 2;
            t = Math.min(2, y / 10);
            y -= 10 * t;
            x -= 2 - t;
        }
        System.out.println(CielWon ? "Ciel" : "Hanako");
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, then enters a loop that continues until either `y` is less than or equal to 1 or `x * 10 + y` is less than or equal to 21. In each iteration of the loop, it calculates `t`, subtracts `t` from `x` and `(2 - t) * 10 + 2` from `y`, and then checks if `y` is less than or equal to 1 or `10 * x + y` is less than or equal to 21. If either condition is met, it sets `CielWon` to `true` and breaks out of the loop. If the loop completes without setting `CielWon` to `true`, it prints "Ciel" if `CielWon` is `true` and "Hanako" otherwise.
