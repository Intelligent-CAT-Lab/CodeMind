<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

This Java code does the same thing as the Python code. It reads two integers A and B from the standard input, checks if B is divisible by A, and if not, it calculates the smallest integer k such that k*A is greater than B. It then checks if the sum of the numbers of the form k*A, k*A+1, ..., k*A+k-1 is greater than k for any k in the range [_k, _k+10^7). If it finds such a k, it prints k*A and exits. If it doesn't find such a k, it prints -1 and exits.<｜end▁of▁sentence｜>
