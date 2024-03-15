Here is your translated code from Java to Python:

```python
import time

class RollingHash:
    def __init__(self):
        self.B1 = 1007
        self.B2 = 1009
        self.H1 = 1000000007
        self.H2 = 1000000009
    
    def init(self, s):
        self.S = s
        self.N = len(s)
        self.l = 0
        self.r = len(s) - 1
        self.Base1 = [0] * (self.N + 1)
        self.Base2 = [0] * (self.N + 1)
        self.Hash1 = [0] * self.N
        self.Hash2 = [0] * self.N
        
        self.Base1[0] = self.Base2[0] = 1
        self.Hash1[0] = self.Hash2[0] = ord(s[0])
        for i in range(1, self.N + 1):
            self.Base1[i] = (self.Base1[i - 1] * self.B1) % self.H1
            self.Base2[i] = (self.Base2[i - 1] * self.B2) % self.H2
        for i in range(1, self.N):
            self.Hash1[i] = (self.Hash1[i - 1] * self.B1 + ord(s[i])) % self.H1
            self.Hash2[i] = (self.Hash2[i - 1] * self.B2 + ord(s[i])) % self.H2
    
    def getHash1(self, l, r):
        res = self.Hash1[r] - ((0 if l == 0 else self.Hash1[l - 1] * self.Base1[r - l + 1]))
        if res < 0:
            res = (res + ((-res // self.H1) + 1) * self.H1) % self.H1
        return res
    
    def getHash2(self, l, r):
        res = self.Hash2[r] - ((0 if l == 0 else self.Hash2[l - 1] * self.Base2[r - l + 1]))
        if res < 0:
            res = (res + ((-res // self.H2) + 1) * self.H2) % self.H2
        return res

def run():
    s = input().strip()
    N = len(s)
    rh = RollingHash()
    rh.init(s)
    ans = float('inf')
    res = "mitomerarenaiWA"
    l = 0
    r = 0
    
    for i in range(N):
        t = N - (i + 1) * 3
        if t > 0 and t % 2 == 0:
            A = i + 1
            B = t // 2
            a1 = rh.getHash2(0, A - 1)
            b1 = rh.getHash2(A, A + B - 1)
            a2 = rh.getHash2(A + B, A + B + A - 1)
            b2 = rh.getHash2(A + B + A, A + B + A + B - 1)
            a3 = rh.getHash2(A + B + A + B, N - 1)
            if a1 == a2 and a2 == a3 and b1 == b2:
                ans = min(ans, i + t)
                l = A
                r = B
    
    if l != 0 and r != 0:
        res = "Love {}{}!".format(s[:l], s[l:l+r])
    
    print(res)

if __name__ == "__main__":
    run()
```

Please note that Python does not have the `Scanner` class as Java does. Instead, input in Python is acquired using the `input()` function. Also, Python does not have JVM's long computation time and built-in arrays. Python lists and hashing are typically used in place of those. Additionally, the utilities like `debug` and scanner functions (`nextInt()`, `nextDouble()`, etc.) have been removed as they are not required in Python. 

This translated Python code takes user input from the command line during execution. Depending on how the original Java code's `MyScanner` class worked, further changes might be necessary for taking inputs in Python.
