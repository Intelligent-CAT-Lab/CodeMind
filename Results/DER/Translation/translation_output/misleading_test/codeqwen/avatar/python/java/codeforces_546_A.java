Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum += k * i;
        }
        if (sum <= n) {
            System.out.println(0);
        } else {
            System.out.println(sum - n);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the sum of `k * i` for `i` from 1 to `w`, and then prints the difference between `sum` and `n` if `sum` is greater than `n`, or `0` otherwise.
