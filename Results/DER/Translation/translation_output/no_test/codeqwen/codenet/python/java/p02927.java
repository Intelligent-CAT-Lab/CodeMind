Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);
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

This Java code does the same thing as your Python code. It reads two integers from the user, then iterates over all integers from 22 to the user's input integer `d`. For each integer `i`, it calculates the last digit `d0` and the first digit `d1` of `i`. If `d0` is 1 or 0, it skips to the next iteration. If `m` is greater than or equal to `d0 * d1`, it increments `ans` by 1. Finally, it prints the value of `ans`.
