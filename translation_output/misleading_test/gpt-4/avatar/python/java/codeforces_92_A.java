Sure, here's the equivalent Java code for the given Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 0;
        int ans = 0;
        
        while (true) {
            if (i + 1 > m) {
                ans = m;
                break;
            }
            m -= i + 1;
            i += 1;
            i %= n;
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

Here's how this works:
- We import the `Scanner` class to take user input.
- We read `n` and `m` as integers from the input.
- We initialize `i` to 0 and `ans` to 0.
- We start a `while` loop that will continue indefinitely until a `break` statement is encountered.
- Inside the loop, if `i + 1` is greater than `m`, we set `ans` to `m` and break out of the loop since we cannot subtract any more from `m`.
- If the condition is not met, we subtract `i + 1` from `m`, increment `i`, and then use the modulo operator with `n` to reset `i` to 0 when it reaches `n`.
- Finally, we print the value of `ans`.
- We close the `Scanner` object after we are done to prevent resource leaks.
