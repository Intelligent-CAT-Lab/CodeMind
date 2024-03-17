<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
10


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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        long MOD = (long) Math.pow(10, 9) + 7;
        long P = factorial(k) / factorial(k - n);
        long C = P / factorial(n);
        long H = C(n + k - 1, k);

        if (n < k) {
            System.out.println(C % MOD);
        } else if (n > k) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long C(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the factorial of the second integer, calculates the combination (C) of the two integers, and then calculates the combination again (H). It then checks if the first integer is less than, greater than, or equal to the second integer and prints the result accordingly.<｜end▁of▁sentence｜>
