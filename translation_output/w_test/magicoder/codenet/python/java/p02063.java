<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 6

Expected output:
8


```
A,B = map(int,input().split())

if B%A == 0:
    print(-1)
    exit()

_k = -(-B//A)

for k in range(_k, _k+10**7):
    bn, rem = divmod(k*A, B)
    an, rem = divmod(rem, A)
    n = bn + an + rem
    if n > k:
        print(k*A)
        exit()
print(-1)

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (B % A == 0) {
            System.out.println(-1);
            System.exit(0);
        }

        int _k = (int) Math.ceil((double) B / A);

        for (int k = _k; k < _k + 10000000; k++) {
            int bn = k * A / B;
            int rem = k * A % B;
            int an = rem / A;
            rem = rem % A;
            int n = bn + an + rem;
            if (n > k) {
                System.out.println(k * A);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, checks if the second integer is a multiple of the first one, and if not, it calculates the smallest integer `k` such that `k*A` is greater than `B`. It then checks if the sum of `bn`, `an`, and `rem` (the remainder of the division of `k*A` by `A`) is greater than `k`. If it is, it prints `k*A` and exits. If no such `k` is found, it prints `-1`.<｜end▁of▁sentence｜>
