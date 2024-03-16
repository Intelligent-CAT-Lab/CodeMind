<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.*;

public class DSumOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDivisors(n));
    }

    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int divisorCount = countDivisors(i);
            sum += divisorCount * i;
        }
        return sum;
    }

    public static int countDivisors(int n) {
        int count = 1;
        while (n % 2 == 0) {
            n /= 2;
            count++;
        }
        for (int p = 3; p * p <= n; p += 2) {
            int count2 = 1;
            while (n % p == 0) {
                n /= p;
                count2++;
            }
            count *= count2;
        }
        if (n > 1) {
            count *= 2;
        }
        return count;
    }
}
```</s>
