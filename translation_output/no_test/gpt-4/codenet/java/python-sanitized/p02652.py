import sys
import heapq

class StarrySkyTreeL:
    def __init__(self, n):
        self.N = n
        M = 1
        while M < n: M *= 2
        self.M = M
        self.H = M >> 1
        self.st = [0] * (2 * M)
        self.plus = [0] * M
        self.I = float('inf') // 4
    
    def add(self, l, r, v):
        L, R = l + self.H, r + self.H
        while L < R:
            if L & 1:
                if L < self.H:
                    self.plus[L] += v
                else:
                    self.st[L] += v
                L += 1
            if R & 1:
                R -= 1
                if R < self.H:
                    self.plus[R] += v
                else:
                    self.st[R] += v
            L >>= 1
            R >>= 1
        self._propagate(l + self.H)
        self._propagate(r - 1 + self.H)
    
    def _propagate(self, i):
        h = 1
        i //= 2
        while i:
            self.st[i] = min(self.st[2 * i] + self.plus[2 * i], 
                             self.st[2 * i + 1] + self.plus[2 * i + 1]) + self.plus[i] // h
            i //= 2
            h *= 2
    
    def min(self, l, r):
        res = self.I
        L, R = l + self.H, r + self.H
        while L < R:
            if L & 1:
                res = min(res, self.st[L] if L < self.H else (self.st[L] + self.plus[L >> 1]))
                L += 1
            if R & 1:
                R -= 1
                res = min(res, self.st[R] if R < self.H else (self.st[R] + self.plus[R >> 1]))
            L >>= 1
            R >>= 1
        return res

def solve():
    s = input().strip()
    n = len(s)
    
    sst = StarrySkyTreeL(2 * n + 5)
    O = n + 2
    Q = O + 1
    sst.add(O + 1, sst.M, 99999999)
    
    for i in reversed(range(n)):
        if s[i] == '1':
            if sst.min(O, O + 1) < 90000000:
                Q -= 1
            v = sst.min(O, O + 1)
            to = sst.min(O - 1, O)
            
            sst.add(0, sst.M, 1)
            O -= 1
            if v < to:
                sst.add(O, O + 1, v - to)
            sst.add(O + 1, O + 2, 99999999)
        elif s[i] == '0':
            sst.add(0, sst.M, -1)
            O += 1
            last = sst.min(0, sst.M)  # Simulating lastle, may require additional implementation
            sst.add(0, last + 1, 1)
        else:
            O += 1
            for j in range(Q - 2, Q):
                nj = min(j + 2, O)
                nv = sst.min(j, j + 1) + 2
                ov = sst.min(nj, nj + 1)
                if nv < ov:
                    sst.add(nj, nj + 1, nv - ov)
            Q = min(Q + 2, O + 1)
            
            sst.add(0, sst.M, -1)
            last = sst.min(0, sst.M)  # Simulating lastle, may require additional implementation
            sst.add(0, last + 1, 1)
    
    res = float('inf')
    for i in range(sst.H):
        inf = i - O
        sup = sst.min(i, i + 1)
        res = min(res, sup - inf)
    
    print(res)

def main():
    original_stdin = sys.stdin
    try:
        sys.stdin = open('input.txt', 'r')
        solve()
    finally:
        sys.stdin = original_stdin

if __name__ == '__main__':
    main()