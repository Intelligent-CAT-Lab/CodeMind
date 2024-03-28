<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
18

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

class DSumOfDivisors {
    public static int solve(int tc) {
        // def divCount(n):
        // 
        //     # sieve method for
        //     # prime calculation
        //     int[] hh = new int[n + 1];
        // 
        //     int p = 2;
        //     while ((p * p) < n) {
        //         if (hh[p] == 0) {
        //             for (int i = p * 2; i <= n; i += p) {
        //                 hh[i] = 0;
        //             }
        //         }
        //         p++;
        // 
        //         // Traversing through
        //     // all prime numbers
        //     int total = 1;
        //     for (int p = 2; p <= n; p++) {
        //         if (hh[p] == 0) {
        // 
        //             // calculate number of divisor
        //             // with formula total div =
        //             // (p1+1) * (p2+1) *.....* (pn+1)
        //             // where n = (a1^p1)*(a2^p2)....
        //             // *(an^pn) ai being prime divisor
        //             // for n and pi are their respective
        //             // power in factorization
        //             int count = 0;
        //             if (n % p == 0) {
        //                 while (n % p == 0) {
        //                     n /= p;
        //                     count++;
        //                 }
        //                 total *= (count + 1);
        //             }
        // 
        //     }
        // 
        //     return total;
        // 
        // so_far = 0
        // for (int i = 1; i < 10; i++) {
        //     int d = divCount(i);
        //     so_far += d * i;
        //     System.out.print(so_far + ", ");
        // }

        int n = Integer.parseInt(input());

        return (int) Arrays.stream(new int[n + 1]).parallel().filter(i -> i != 0).mapToInt(i -> (i + 1) * (i + 2) * ... * ((n + 1) / i + 1)).sum();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < tc; i++) {
            solve(i);
        }
    }
}
```</s>
