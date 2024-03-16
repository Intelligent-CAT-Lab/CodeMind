Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
```java
import java.util.*;

public class DSumOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DSumOfDivisors solver = new DSumOfDivisors();
        solver.solve(sc);
    }

    public void solve(Scanner sc) {
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int d = divCount(i);
            sum += d * i;
        }

        System.out.println(sum);
    }

    public int divCount(int n) {
        int[] hh = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (hh[i] == 0) continue;
            for (int j = i * 2; j <= n; j += i) {
                hh[j] = 0;
            }
        }

        int total = 1;
        for (int i = 2; i <= n; i++) {
            if (hh[i] == 1) {
                int count = 0;
                while (n % i == 0) {
                    n /= i;
                    count++;
                }
                total *= (count + 1);
            }
        }

        return total;
    }
}
```<|endoftext|>
