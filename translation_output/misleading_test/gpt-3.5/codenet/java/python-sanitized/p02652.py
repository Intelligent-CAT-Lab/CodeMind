from collections import deque

def solve():
    s = input().strip()
    n = len(s)
    
    O = n + 2
    Q = O + 1
    sst = StarrySkyTree(2 * n + 5)
    sst.add(O + 1, sst.H, 99999999)
    
    for i in range(n - 1, -1, -1):
        if s[i] == '1':
            if sst.min(O, O + 1) < 90000000:
                Q -= 1
            v = sst.min(O, O + 1)
            to = sst.min(O - 1, O)
            
            sst.add(0, sst.H, 1)
            O -= 1
            if v < to:
                sst.add(O, O + 1, v - to)
            sst.add(O + 1, O + 2, 99999999)
        elif s[i] == '0':
            sst.add(0, sst.H, -1)
            O += 1
            last = sst.lastle(sst.H - 1, -1)
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
            
            sst.add(0, sst.H, -1)
            last = sst.lastle(sst.H - 1, -1)
            sst.add(0, last + 1, 1)
    
    arr = sst.to_array()
    minimum = float('inf')
    for i in range(sst.H):
        inf = i - O
        sup = arr[i]
        minimum = min(minimum, sup - inf)
    print(minimum)

class StarrySkyTree:
    def __init__(self, n):
        self.N = n
        self.M = 1 << (n - 1).bit_length() << 2
        self.H = self.M >> 1
        self.st = [0] * self.M
        self.plus = [0] * self.H
    
    def add(self, l, r, v):
        if l < r:
            self.add_recursive(l, r, v, 0, self.H, 1)
    
    def add_recursive(self, l, r, v, cl, cr, cur):
        if l <= cl and cr <= r:
            if cur >= self.H:
                self.st[cur] += v
            else:
                self.plus[cur] += v
                self.propagate(cur)
        else:
            mid = (cl + cr) >> 1
            if cl < r and l < mid:
                self.add_recursive(l, r, v, cl, mid, 2 * cur)
            if mid < r and l < cr:
                self.add_recursive(l, r, v, mid, cr, 2 * cur + 1)
            self.propagate(cur)
    
    def propagate(self, i):
        self.st[i] = min(self.st[2 * i], self.st[2 * i + 1]) + self.plus[i]
    
    def min(self, l, r):
        return self.min_recursive(l, r, 0, self.H, 1)
    
    def min_recursive(self, l, r, cl, cr, cur):
        if l <= cl and cr <= r:
            return self.st[cur]
        else:
            mid = (cl + cr) >> 1
            ret = float('inf')
            if cl < r and l < mid:
                ret = min(ret, self.min_recursive(l, r, cl, mid, 2 * cur))
            if mid < r and l < cr:
                ret = min(ret, self.min_recursive(l, r, mid, cr, 2 * cur + 1))
            return ret + self.plus[cur]
    
    def lastle(self, l, v):
        if l < 0:
            return -1
        cur = self.H + l
        j = self.H.bit_length() - 1
        while True:
            self.fall(cur, 1, j)
            self.fall(cur, -1, j)
            if self.st[cur] <= v:
                if cur >= self.H:
                    return cur - self.H
                cur = 2 * cur + 1
            else:
                if cur & (cur - 1) == 0:
                    return -1
                cur = cur >> (cur & -cur).bit_length() - 1
    
    def fall(self, i, d, j):
        if i < self.H:
            if 2 * i < self.H:
                self.plus[2 * i] += self.plus[i]
                self.plus[2 * i + 1] += self.plus[i]
            self.st[2 * i] += self.plus[i]
            self.st[2 * i + 1] += self.plus[i]
            self.plus[i] = 0
    
    def to_array(self):
        return self.to_array_recursive(1, 0, self.H, [0] * self.H)
    
    def to_array_recursive(self, cur, l, r, ret):
        if r - l == 1:
            ret[cur - self.H] = self.st[cur]
        else:
            ret = self.to_array_recursive(2 * cur, l, (l + r) >> 1, ret)
            ret = self.to_array_recursive(2 * cur + 1, (l + r) >> 1, r, ret)
            for i in range(l, r):
                ret[i] += self.plus[cur]
        return ret

# Main
solve()