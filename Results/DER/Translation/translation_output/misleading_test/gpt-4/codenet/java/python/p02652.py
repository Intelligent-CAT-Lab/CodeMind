Here's the equivalent Python code:

```python
class StarrySkyTreeL:
    def __init__(self, n):
        self.N = n
        self.M = 1 << (n - 1).bit_length() << 2
        self.H = self.M >> 1
        self.st = [0] * self.M
        self.plus = [0] * self.H
        self.I = float('inf') // 4

    def add(self, l, r, v):
        self._add(l, r, v, 0, self.H, 1)

    def _add(self, l, r, v, cl, cr, cur):
        if l <= cl < cr <= r:
            if cur >= self.H:
                self.st[cur] += v
            else:
                self.plus[cur] += v
                self._propagate(cur)
        else:
            mid = (cl + cr) // 2
            if l < mid and cl < r:
                self._add(l, r, v, cl, mid, cur * 2)
            if r > mid and l < cr:
                self._add(l, r, v, mid, cr, cur * 2 + 1)
            self._propagate(cur)

    def min(self, l, r):
        if l >= r:
            return self.I
        return self._min(l, r, 0, self.H, 1)

    def _min(self, l, r, cl, cr, cur):
        if l <= cl < cr <= r:
            return self.st[cur]
        else:
            mid = (cl + cr) // 2
            ret = self.I
            if l < mid and cl < r:
                ret = min(ret, self._min(l, r, cl, mid, cur * 2))
            if r > mid and l < cr:
                ret = min(ret, self._min(l, r, mid, cr, cur * 2 + 1))
            return ret + self.plus[cur]

    def _propagate(self, i):
        self.st[i] = min(self.st[2 * i], self.st[2 * i + 1]) + self.plus[i]

    def to_array(self):
        return self._to_array(1, 0, self.H, [0] * self.H)

    def _to_array(self, cur, cl, cr, res):
        if cr - cl == 1:
            res[cur - self.H] = self.st[cur]
        else:
            mid = (cl + cr) // 2
            self._to_array(cur * 2, cl, mid, res)
            self._to_array(cur * 2 + 1, mid, cr, res)
            for i in range(cl, cr):
                res[i] += self.plus[cur]
        return res


def solve(input_string):
    s = list(input_string.strip())
    n = len(s)

    sst = StarrySkyTreeL(2 * n + 5)
    O = n + 2
    Q = O + 1
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
                sst.add(O, O + 1, int(v - to))
            sst.add(O + 1, O + 2, 99999999)
        elif s[i] == '0':
            sst.add(0, sst.H, -1)
            O += 1
            last = len(sst.to_array()) - 1
            while last >= 0 and sst.to_array()[last] > -1:
                last -= 1
            sst.add(0, last + 1, 1)
        else:
            O += 1
            for j in range(Q - 2, Q):
                nj = min(j + 2, O)
                nv = sst.min(j, j + 1) + 2
                ov = sst.min(nj, nj + 1)
                if nv < ov:
                    sst.add(nj, nj + 1, int(nv - ov))
            Q = min(Q + 2, O + 1)

            sst.add(0, sst.H, -1)
            last = len(sst.to_array()) - 1
            while last >= 0 and sst.to_array()[last] > -1:
                last -= 1
            sst.add(0, last + 1, 1)

    ar = sst.to_array()
    minimum = float('inf')
    for i in range(sst.H):
        inf = i - O
        sup = ar[i]
        minimum = min(minimum, sup - inf)
    return int(minimum)


# Example usage
input_string = "0??"
print(solve(input_string))
```

To test the code with the example provided, simply call `solve()` with the input string. The expected output is `13`.
