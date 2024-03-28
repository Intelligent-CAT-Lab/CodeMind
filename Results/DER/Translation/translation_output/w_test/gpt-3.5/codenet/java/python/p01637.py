```python
class p01637:
    def __init__(self):
        self.M = 0
        self.rD = 0
        self.rR = 0
        self.cD = 0
        self.cR = 0

    def run(self):
        self.M, self.rD, self.rR, self.cD, self.cR = map(int, input().split())
        self.solve()

    def solve(self):
        max_value = -1
        D0 = (100 * self.cD + self.rD - 1) // self.rD
        C0 = (100 * self.cR + self.rR - 1) // self.rR

        for i in range(100):
            for j in range(100):
                changeD = D0 + i
                changeR = C0 + j
                jpn = self.M - changeD - changeR
                if jpn < 0:
                    continue
                remD = (changeD * self.rD // 100) - self.cD
                remR = (changeR * self.rR // 100) - self.cR
                jpn += (remD * 100 // self.rD) + (remR * 100 // self.rR)
                max_value = max(max_value, jpn)
        
        print(str(max_value))

if __name__ == "__main__":
    p = p01637()
    p.run()
```
```python
# Test Input
# M r

# Expected Output
# 9333
```
