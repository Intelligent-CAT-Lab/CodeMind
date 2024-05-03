Here is the Python version of the provided Java code:

```python
import sys

class RollingHash:
    def __init__(self, s):
        self.s = s
        self.N = len(s)
        self.l = 0
        self.r = self.N - 1
        self.base1 = [1] * (self.N + 1)
        self.base2 = [1] * (self.N + 1)
        self.hash1 = [0] * self.N
        self.hash2 = [0] * self.N

        self.base1[0] = self.base2[0] = 1
        self.hash1[0] = self.hash2[0] = ord(s[0])
        for i in range(1, self.N + 1):
            self.base1[i] = (self.base1[i - 1] * 1007) % 1000000007
            self.base2[i] = (self.base2[i - 1] * 1009) % 1000000009
        for i in range(1, self.N):
            self.hash1[i] = (self.hash1[i - 1] * 1007 + ord(s[i])) % 1000000007
            self.hash2[i] = (self.hash2[i - 1] * 1009 + ord(s[i])) % 1000000009

    def contain1(self, t):
        sl = len(self.s)
        tl = len(t)
        if tl > sl:
            return False

        b = 1
        for i in range(tl):
            b = (b * 1007) % 1000000007

        sh = 0
        th = 0
        for i in range(tl):
            sh = (sh * 1007 + ord(self.s[i])) % 1000000007
            th = (th * 1007 + ord(t[i])) % 1000000007

        for i in range(sl - tl + 1):
            if sh == th
