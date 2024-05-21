import sys

class StarrySkyTreeL:
    def __init__(self, n):
        self.N = n
        self.M = 1 << (n.bit_length() + 1)
        self.H = self.M >> 1
        self.st = [float('inf')] * self.M
        self.plus = [0] * self.H

    def add(self, l, r, v):
        if l < r:
            self.add(l, r, v, 0, self.H, 1)

    def add(self, l, r, v, cl, cr, cur):
        if l <= cl and cr <= r:
            if cur >= self.H:
                self.st[cur] += v
            else:
                self.plus[cur] += v
                self.propagate(cur)
        else:
            mid = cl + (cr - cl) // 2
            if cl < r and l < mid:
                self.add(l, r, v, cl, mid, 2 * cur)
            if mid < r and l < cr:
                self.add(l, r, v, mid, cr, 2 * cur + 1)
            self.propagate(cur)

    def propagate(self, i):
        self.st[i] = min(self.st[2 * i], self.st[2 * i + 1]) + self.plus[i]

    def min(self, l, r):
        return self.min(l, r, 0, self.H, 1)

    def min(self, l, r, cl, cr, cur):
        if l <= cl and cr <= r:
            return self.st[cur]
        else:
            mid = cl + (cr - cl) // 2
            ret = float('inf')
            if cl < r and l < mid:
                ret = min(ret, self.min(l, r, cl, mid, 2 * cur))
            if mid < r and l < cr: