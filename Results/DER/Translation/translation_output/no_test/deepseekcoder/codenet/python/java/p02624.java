<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
# @author 

import sys

class DSumOfDivisors:
    def solve(self, tc=0):
        # def divCount(n):
        # 
        #     # sieve method for
        #     # prime calculation
        #     hh = [1] * (n + 1);
        # 
        #     p = 2;
        #     while ((p * p) < n):
        #         if (hh[p] == 1):
        #             for i in range((p * 2), n, p):
        #                 hh[i] = 0;
        #         p += 1;
        # 
        #         # Traversing through
        #     # all prime numbers
        #     total = 1;
        #     for p in range(2, n + 1):
        #         if (hh[p] == 1):
        # 
        #             # calculate number of divisor
        #             # with formula total div =
        #             # (p1+1) * (p2+1) *.....* (pn+1)
        #             # where n = (a1^p1)*(a2^p2)....
        #             # *(an^pn) ai being prime divisor
        #             # for n and pi are their respective
        #             # power in factorization
        #             count = 0;
        #             if (n % p == 0):
        #                 while (n % p == 0):
        #                     n = int(n / p);
        #                     count += 1;
        #                 total *= (count + 1);
        # 
        #     return total;
        # 
        # so_far = 0
        # for i in range(1, 10):
        #     d = divCount(i)
        #     so_far += d * i
        #     print(so_far, end=',')

        n = int(input())

        print(int(sum(k/2 * int(n/k) * int(1 + n/k) for k in range(1, n + 1))))


solver = DSumOfDivisors()
input = sys.stdin.readline

solver.solve()

```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class DSumOfDivisors {
    public static void main(String[] args) {
        DSumOfDivisors solver = new DSumOfDivisors();
        Scanner input = new Scanner(System.in);
        solver.solve(input.nextInt());
    }

    public void solve(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i / 2) * (n / i) * (1 + n / i);
        }
        System.out.println(sum);
    }
}
```

This Java code does the same thing as your Python code. It calculates the sum of the divisors of all numbers up to `n`. The calculation is done using the formula `(k/2) * (n/k) * (1 + n/k)`, where `k` is a divisor of `n`. The result is then printed out.

Please note that the Python code you provided is not a complete program, so I made some assumptions about what the complete program should do.
<|EOT|>
