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
        n = int("4")
        print(int(sum(k/2 * int(n/k) * int(1 + n/k) for k in range(1, n + 1))))
solver = DSumOfDivisors()
input = sys.stdin.readline
solver.solve()
