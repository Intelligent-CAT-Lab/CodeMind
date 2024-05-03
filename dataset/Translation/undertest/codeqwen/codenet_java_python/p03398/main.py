import sys
import math

class Point:
    def __init__(self):
        self.coeff = [1] * n

    def __eq__(self, other):
        return self.coeff == other.coeff

    def __hash__(self):
        return hash(tuple(self.coeff))

    def __str__(self):
        return f"Point({self.coeff})"

class TaskF:
    mod = 1000000007
    n = 0
    comb = None
    dp = None
    pp = None

    @staticmethod
    def get_comb(sz, mod):
        comb = [[0] * sz for _ in range(sz)]
        comb[0][0] = 1
        for i in range(1, sz):
            for j in range(1, i + 1):
                comb[i][j] = (comb[i - 1][j] + comb[i - 1][j - 1]) % mod
        return comb

    def solve(self, testNumber, inp, out):
        self.n = inp.next_int()
        ps = [Point() for _ in range(self.n)]
        self.pp = set()
        self.comb = self.get_comb(self.n + 10, self.mod)
        self.dp = [[-1] * 101 for _ in range(self.n + 10)]
        out.println((self.n * (self.dfs(self.n - 1, 0) + self.dfs(self.n - 1, 1))) % self.mod)

    def dfs(self, left, excess):
        if self.dp[left][excess] != -1:
            return self.dp[left][excess]
        if left == 0:
            return excess == 0
        ret = 0
        for pos in range(left + 1):
            for neg in range(left - pos + 1):
                if pos + neg == 0:
                    continue
                take = pos + neg
                if