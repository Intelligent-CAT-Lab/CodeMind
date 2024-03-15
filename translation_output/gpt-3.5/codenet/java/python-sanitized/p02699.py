import sys
from typing import List
from collections import deque

MOD = 1_000_000_007
SIZE = 1_000_000

class p02699:
    def __init__(self):
        self.fac = [0] * SIZE
        self.inv = [0] * SIZE
        self.finv = [0] * SIZE

    def solve(self):
        s, w = map(int, input().split())
        if w >= s:
            print("unsafe")
        else:
            print("safe")

    def gcd(self, a: int, b: int) -> int:
        if b == 0:
            return a
        return self.gcd(b, a % b)

    def lcm(self, a: int, b: int) -> int:
        return a * b // self.gcd(a, b)

    def inv(self, a: int) -> int:
        return self.pow(a, MOD - 2)

    def pow(self, a: int, r: int) -> int:
        result = 1
        while r > 0:
            if r & 1:
                result = result * a % MOD
            a = a * a % MOD
            r >>= 1
        return result

    def mod_fact(self, n: int) -> int:
        if n == 0:
            return 1
        return n * self.mod_fact(n - 1) % MOD

    def fact(self, n: int) -> int:
        if n == 0:
            return 1
        return n * self.fact(n - 1)

    def init_comb(self):
        self.fac[0] = self.fac[1] = 1
        self.inv[1] = 1
        self.finv[0] = self.finv[1] = 1
        for i in range(2, SIZE):
            self.fac[i] = self.fac[i - 1] * i % MOD
            self.inv[i] = MOD - self.inv[MOD % i] * (MOD // i) % MOD
            self.finv[i] = self.finv[i - 1] * self.inv[i] % MOD

    def mod_comb(self, n: int, r: int) -> int:
        if n < r or n < 0 or r < 0:
            return 0
        return self.fac[n] * self.finv[r] % MOD * self.finv[n - r] % MOD

    def comb(self, n: int, r: int) -> int:
        num = 1
        for i in range(1, r + 1):
            num = num * (n - i + 1) // i
        return num

    def is_prime(self, a: int) -> bool:
        if a <= 1:
            return False
        for i in range(2, int(a**0.5) + 1):
            if a % i == 0:
                return False
        return True

    def next_permutation(self, s: str) -> str:
        s = list(s)
        pivot_pos = -1
        pivot = 0
        for i in range(len(s) - 2, -1, -1):
            if s[i] < s[i+1]:
                pivot_pos = i
                pivot = s[i]
                break
        if pivot_pos == -1 and pivot == 0:
            return None
        L = pivot_pos + 1
        R = len(s) - 1
        min_pos = -1
        min_val = float('inf')
        for i in range(R, L - 1, -1):
            if pivot < s[i]:
                if s[i] < min_val:
                    min_val = s[i]
                    min_pos = i
        s[pivot_pos], s[min_pos] = s[min_pos], s[pivot_pos]
        s[L:R+1] = sorted(s[L:R+1])
        return ''.join(s)

    def next_permutation_arr(self, a: List[int]) -> bool:
        for i in range(len(a) - 1, 0, -1):
            if a[i - 1] < a[i]:
                swap_index = self.find(a[i - 1], a, i, len(a) - 1)
                a[swap_index], a[i - 1] = a[i - 1], a[swap_index]
                a[i:] = sorted(a[i:])
                return True
        return False

    def find(self, target: int, a: List[int], start: int, end: int) -> int:
        if start == end:
            return start
        mid = (start + end + 1) // 2
        return self.find(target, a, start, mid - 1) if a[mid] <= target else self.find(target, a, mid, end)

    def elimination(self, a: List[List[int]], b: List[int]):
        n = len(a)
        for k in range(n - 1):
            for i in range(k + 1, n):
                f = -a[i][k] / a[k][k]
                for j in range(k + 1, n):
                    a[i][j] += f * a[k][j]
                b[i] += f * b[k]
            for i in range(n - 1, -1, -1):
                for j in range(i + 1, n):
                    b[i] -= a[i][j] * b[j]
                b[i] = b[i] / a[i][i]

if __name__ == "__main__":
    p = p02699()
    p.solve()