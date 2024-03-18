Here is the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        if (B % A == 0) {
            System.out.println(-1);
            return;
        }

        int _k = (B + A - 1) / A; // equivalent to ceil division in Python

        for (int k = _k; k < _k + Math.pow(10, 7); k++) {
            int bn = (k * A) / B;
            int rem = (k * A) % B;
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

This Java code works as follows:
- It reads two integers `A` and `B` from the standard input.
- It checks if `B` is divisible by `A`; if so, it prints `-1` and exits the program.
- It calculates the starting value of `k` while ensuring that it's rounded up (`_k` in the Python code reflects ceiling of `B/A` division).
- It initiates a loop starting from `_k` and runs up to `_k + 10^7`.
- It calculates `bn`, `an`, and the remaining `rem` within each iteration.
- It calculates the value of `n` and checks if it is greater than `k`.
- If the condition is satisfied, it prints `k*A` and exits. If the loop finishes without finding such a `k`, it prints `-1`. 

Make sure to run this Java code with user input formatted correctly, providing it as two space-separated integers on a single line.
