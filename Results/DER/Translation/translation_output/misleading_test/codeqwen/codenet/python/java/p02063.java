Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (B % A == 0) {
            System.out.println(-1);
            return;
        }

        int _k = -(-B / A);

        for (int k = _k; k < _k + 10000000; k++) {
            int bn = k * A / B;
            int rem = k * A % B;
            int an = rem / A;
            rem = rem % A;
            int n = bn + an + rem;
            if (n > k) {
                System.out.println(k * A);
                return;
            }
        }
        System.out.println(-1);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, checks if the second integer is divisible by the first one, and if not, it calculates the value of `k` and then iterates from `k` to `k+10^7` to find the smallest `k` such that the value of `n` is greater than `k`. If no such `k` is found, it prints `-1`.
