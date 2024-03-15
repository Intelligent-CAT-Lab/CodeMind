```python
import sys
from collections import deque

INPUT = ""
# INPUT = "?0011"
# INPUT = "000?00"
# INPUT = "?010"

def solve():
    s = list(input().strip())
    n = len(s)

    O = n+2
    Q = O+1

    H = 2*n + 5
    sst = StarrySkyTreeL(H)
    sst.add(O+1, sst.H, 99999999)

    for i in range(n-1, -1, -1):
        if s[i] == '1':
            if sst.min(O, O+1) < 90000000:
                Q -= 1
            
            v = sst.min(O, O+1)
            to = sst.min(O-1, O)

            sst.add(0, sst.H, 1)
            O -= 1

            if v < to:
                sst.add(O, O+1, v-to)
            sst.add(O+1, O+2, 99999999)
        
        elif s[i] == '0':
            sst.add(0, sst.H, -1)
            O += 1
            last = sst.lastle(sst.H-1, -1)
            sst.add(0, last+1, 1)
        
        else:
            O += 1
            for j in range(Q-2, Q):
                nj = min(j+2, O)
                nv = sst.min(j, j+1) + 2
                ov = sst.min(nj, nj+1)
                if nv < ov:
                    sst.add(nj, nj+1, nv-ov)
            Q = min(Q+2, O+1)

            sst.add(0, sst.H, -1)
            last = sst.lastle(sst.H-1, -1)
            sst.add(0, last+1, 1)
    
    ar = sst.to_array()
    min_val = sys.maxsize
    for i in range(sst.H):
        inf = i - O
        sup = ar[i]
        min_val = min(min_val, sup-inf)
    
    print(min_val)

class StarrySkyTreeL:
    def __init__(self, n):
        self.N = n
        self.M = 1 << (n - 1).bit_length() << 2
        self.H = self.M // 2
        self.st = [0] * self.M
        self.plus = [0] * self.H
        self.I = sys.maxsize >> 2

    def propagate(self, i):
        self.st[i] = min(self.st[2*i], self.st[2*i+1]) + self.plus[i]

    def add(self, l, r, v):
        if l < r:
            self.add_helper(l, r, v, 0, self.H, 1)

    def add_helper(self, l, r, v, cl, cr, cur):
        if l <= cl and cr <= r:
            if cur >= self.H:
                self.st[cur] += v
            else:
                self.plus[cur] += v
                self.propagate(cur)
        else:
            mid = (cl+cr) // 2
            if cl < r and l < mid:
                self.add_helper(l, r, v, cl, mid, 2*cur)
            if mid < r and l < cr:
                self.add_helper(l, r, v, mid, cr, 2*cur+1)
            self.propagate(cur)

    def min_val(self, l, r):
        if l >= r:
            return self.I
        return self.min_helper(l, r, 0, self.H, 1)

    def min_helper(self, l, r, cl, cr, cur):
        if l <= cl and cr <= r:
            return self.st[cur]
        else:
            mid = (cl+cr) // 2
            ret = self.I
            if cl < r and l < mid:
                ret = min(ret, self.min_helper(l, r, cl, mid, 2*cur))
            if mid < r and l < cr:
                ret = min(ret, self.min_helper(l, r, mid, cr, 2*cur+1))
            return ret + self.plus[cur]

    def fall(self, i):
        if i < self.H:
            if 2*i < self.H:
                self.plus[2*i] += self.plus[i]
                self.plus[2*i+1] += self.plus[i]
            self.st[2*i] += self.plus[i]
            self.st[2*i+1] += self.plus[i]
            self.plus[i] = 0

    def lastle(self, l, v):
        if l >= self.H:
            return -1
        cur = self.H + l
        i, j = 1, self.H.bit_length() - 1
        while i <= cur:
            self.fall(i)
            i = i*2 | cur >> j & 1

        while True:
            self.fall(cur)
            if self.st[cur] <= v:
                if cur >= self.H:
                    return cur - self.H
                cur = 2*cur
            else:
                cur += 1
                if (cur & (cur-1)) == 0:
                    return -1
                cur = cur >> cur.bit_length() & 1

    def to_array(self):
        return self.to_array_helper(1, 0, self.H, [0]*self.H)

    def to_array_helper(self, cur, l, r, ret):
        if r - l == 1:
            ret[cur - self.H] = self.st[cur]
        else:
            self.to_array_helper(2*cur, l, (l+r)//2, ret)
            self.to_array_helper(2*cur+1, (l+r)//2, r, ret)
            for i in range(l, r):
                ret[i] += self.plus[cur]
        return ret

def main():
    solve()

if __name__ == "__main__":
    main()
```

