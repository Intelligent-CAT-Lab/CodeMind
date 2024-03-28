import sys
import math

class p03446:
    def __init__(self):
        self.a = self.nextInt()
        self.b = self.nextInt()
        self.c = self.nextInt()
        self.d = self.nextInt()
        self.e = self.nextInt()
        self.f = self.nextInt()

        if self.d % self.a != 0 or self.e % self.b != 0 or self.f % self.c != 0:
            print(0)
            return

        self.p = self.d // self.a
        self.q = self.e // self.b
        self.r = self.f // self.c

        self.dp = [[0] * (self.q + 1) for _ in range(self.p + 1)]
        self.dp[self.p][self.q] = 1

        self.ans = 0

        for x in range(self.p - 1, 0, -1):
            for y in range(self.