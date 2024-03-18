Here is the translated Python code for the given Java code:

```python
import re
import sys


class Result:
    def __init__(self, p, value):
        self.p = p
        self.value = value
        self.good = True
        self.update()

    def update(self):
        self.good &= 0 <= self.value < 1024


class P01542:
    INF = 1 << 28
    EPS = 1e-12

    def __init__(self):
        self.s = input()

    def run(self):
        self.s += "$"
        self.cs = list(self.s)
        self.max_value = -1
        self.dfs(0)
        print(self.max_value)

    def dfs(self, i):
        ops = ['0', '1', '+', '-', '*', '(', ')']
        if i == len(self.cs):
            self.max_value = max(self.max_value, self.calc())
            return
        if self.cs[i] == '.':
            for c in ops:
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
                while self.cs[right] != ')' or stack != 0:
                    if self.cs[right] == '(':
                        stack += 1
                    elif self.cs[right] == ')':
                        stack -= 1
                    if stack == 0:
                        op |= self.cs[right] in ['+', '-', '*']
                    right += 1
                r.good &= op
        return r.value if r.good else -1

    def E(self, p):
        r = self.F(p)
        if not r.good:
            return r
        while self.cs[r.p] in ['+', '-']:
            r2 = self.F(r.p + 1)
            if not r2.good:
                return r2
            if self.cs[r.p] == '+':
                r.value += r2.value
            else:
                r.value -= r2.value
            r.update()
            if not r.good:
                return r
            r.p = r2.p
        return r

    def F(self, p):
        r = self.T(p)
        if not r.good:
            return r
        while self.cs[r.p] == '*':
            r2 = self.T(r.p + 1)
            if not r2.good:
                return r2
            r.value *= r2.value
            r.update()
            if not r.good:
                return r
            r.p = r2.p
        return r

    def T(self, p):
        if self.cs[p] == '(':
            r = self.E(p + 1)
            if not r.good or self.cs[r.p] != ')':
                r.good = False
                return r
            r.p += 1
            return r
        elif self.cs[p] in ['0', '1']:
            r = Result(p, 0)
            while re.match(r'\d', self.cs[r.p]):
                r.value = r.value * 2 + int(self.cs[r.p]) - int('0')
                r.update()
                r.p += 1
            return r
        else:
            return Result(0, -1)


if __name__ == "__main__":
    P01542().run()
```

To use this code, simply run it in a Python environment and input the string when prompted, and the program will output the result on the console.

Please note that the Python translation preserves the structure of the Java code closely, including the algorithms and recursion. However, Python does not have built-in support for static imports like `java.util.Arrays.*`, so the `max` function is used directly without a static import. Moreover, several Java-specific constructs are adapted to Python equivalents (e.g., character array to list, print syntax, regex matching, and standard input handling).
