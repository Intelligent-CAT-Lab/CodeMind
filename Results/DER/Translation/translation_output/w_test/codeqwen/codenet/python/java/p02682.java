Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        int ans = 0;
        ans += 1 * (Math.min(a, k));
        k -= Math.min(a, k);
        ans += 0 * (Math.min(b, k));
        k -= Math.min(b, k);
        ans += -1 * (Math.min(c, k));
        k -= Math.min(c, k);
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, calculates the minimum of each integer with the integer `k`, and adds the result to `ans`. After each operation, it subtracts the minimum from `k`. Finally, it prints the value of `ans`.
