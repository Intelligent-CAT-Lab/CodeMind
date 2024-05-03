Here is the Python version of the Java code:

```python
import sys

class Result:
    def __init__(self, p, value):
        self.p = p
        self.value = value
        self.good = True
        self.update()

    def update(self):
        self.good &= 0 <= self.value and self.value < 1024

class p01542:
    def __init__(self):
        self.INF = 1 << 28
        self.EPS = 1e-12
        self.s = sys.stdin.readline().strip()
        self.max = -1
        self.cs = list(self.s)
        self.cs.append('$')

    def run(self):
        self.solve()

    def solve(self):
        self.dfs(0)
        print(self.max)

    def dfs(self, i):
        op = ['0', '1', '+', '-', '*', '(', ')']
        if i == len(self.cs):
            self.max = max(self.max, self.calc())
            return
        if self.cs[i] == '.':
            for c in op:
                self.cs[i] = c
                self.dfs(i + 1)
                self.cs[i] = '.'
        else:
            self.dfs(i + 1)

    def calc(self):
        r = self.E(0)
        r.good &= r.p == len(self.cs) - 1
        if r.good:
            n = len(self.cs)
            for i in range(n):
                if self.cs[i] != '(':
                    continue
                left = i
                right = left + 1
                stack = 0
                op = False
                while cs[right] != ')' or stack != 0:
                    if self.cs[right] == '(':
                        stack += 1
                    elif self.cs[right] == ')':
                        stack -= 
