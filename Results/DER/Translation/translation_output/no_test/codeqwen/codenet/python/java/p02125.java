Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = 0;
        int x = 1;
        while (2 * x - 1 <= N) {
            x = 2 * x;
            ans += 1;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then enters a loop that continues as long as 2 times the current value of `x` minus 1 is less than or equal to `N`. In each iteration of the loop, it doubles the value of `x` and increments `ans` by 1. Finally, it prints the value of `ans`.
