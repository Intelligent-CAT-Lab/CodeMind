```python
P = 998244353

class p03467:
    
    def __init__(self):
        self.map = {}

    def go(self, s):
        if not s:
            return 1
        if s in self.map:
            return self.map[s]

        ret = (1 + ord(s[0]) - ord('0')) * self.go(s[1:]) % P
        for x in range(1, len(s) // 2 + 1):
            buf = list(s[:x])
            for k in range(2, len(s) // x + 1):
                for i in range(x):
                    if k * x + i < len(s) and s[k * x + i] == '0':
                        buf[i] = '0'
                ret += self.go(''.join(buf)) * self.go(s[k * x:]) % P

        iret = int(ret % P)
        self.map[s] = iret
        return iret
    
    def submit(self):
        s = self.nextToken()
        print(self.go(s))

    def preCalc(self):
        pass

    def stress(self):
        pass

    def test(self):
        pass

    def nextToken(self):
        if not hasattr(self, 'st') or not self.st:
            try:
                self.st = list(input().split())
            except Exception as e:
                raise RuntimeError(e)
        return self.st.pop(0) if self.st else None

    def nextString(self):
        try:
            return input()
        except Exception as e:
            raise RuntimeError(e)

    def nextInt(self):
        return int(self.nextToken())

    def nextLong(self):
        return int(self.nextToken())

    def nextDouble(self):
        return float(self.nextToken())


if __name__ == "__main__":
    p03467()
```
