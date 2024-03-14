import sys
import time
import os
import io

class p03874:
    def __init__(self):
        self.start_time = 0
        self.debug = None
        self.reader = None
        self.out = None
        self.tokenizer = None
        self.is_ = None

    def solve(self):
        print(self.solve_func(self.nl_func()))

    def solve_func(self, k):
        m = len("FESTIVAL")
        n = 600
        l = m - 1
        dp = [[0 for _ in range(l + 1)] for _ in range(n + 1)]
        for i in range(n):
            dp[i][0] = 1
            for j in range(l):
                for p in range(i + 1):
                    for q in range(j + 1):
                        dp[i + 1][j + 1] += dp[p][q]

        a = [0 for _ in range(n + 1)]
        for i in range(n, 0, -1):
            a[i] = k // dp[i][l]
            k -= a[i] * dp[i][l]

        sb = ""
        for i in range(1, n + 1):
            sb += "FESTIVA"
            sb += "L" * a[i]
        return sb

    def check(self, s):
        t = "FESTIVAL"
        m = len(t)
        map = [0 for _ in range(26)]
        for i in range(m):
            map[ord(t[i]) - ord('A')] = i

        n = len(s)
        a = [0 for _ in range(n)]
        for i in range(n):
            a[i] = map[ord(s[i]) - ord('A')]

        dp = [[0 for _ in range(m + 1)] for _ in range(n + 1)]
        dp[0][0] = 1
        for i in range(n):
            for j in range(m + 1):
                dp[i + 1][j] = dp[i][