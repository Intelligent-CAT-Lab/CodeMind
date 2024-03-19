<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
54

```
# ball and box 5
MOD = pow(10,9)+7
from math import factorial
def P(n,r):
    return factorial(n)//factorial(n-r)
def C(n,r):
    return P(n,r)//factorial(r)
def H(n,r):
    return C(n+r-1,r)
n, k = map(int, input().split())

print(C(k,n)%MOD if n < k else 0 if n > k else 1)

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    static final long MOD = (long) Math.pow(10,9)+7;

    static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++)
            result = (result * i) % MOD;
        return result;
    }

    static long P(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    static long C(int n, int r) {
        return P(n, r) / factorial(r);
    }

    static long H(int n, int r) {
        return C(n + r - 1, r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        if (n < k) {
            System.out.println(C(k, n) % MOD);
        } else if (n > k) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the combination `C(k, n)`, and prints the result modulo `MOD`. If `n` is greater than `k`, it prints `0`. If `n` is equal to `k`, it prints `1`.<｜end▁of▁sentence｜>
