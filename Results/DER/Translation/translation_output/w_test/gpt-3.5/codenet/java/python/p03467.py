```python
P = 998244353

class Solution:
    def __init__(self):
        self.map = {}

    def go(self, s):
        if not s:
            return 1
        if s in self.map:
            return self.map[s]

        ret = (1 + int(s[0])) * self.go(s[1:]) % P
        for x in range(1, len(s) // 2 + 1):
            buf = list(s[:x])
            for k in range(2, len(s) // x + 1):
                for i in range(x):
                    if s[(k-1)*x + i] == '0':
                        buf[i] = '0'
                ret += self.go(''.join(buf)) * self.go(s[k*x:]) % P

        iret = int(ret % P)
        self.map[s] = iret
        return iret

    def submit(self):
        s = input()
        print(self.go(s))

if __name__ == "__main__":
    Solution().submit()
```

