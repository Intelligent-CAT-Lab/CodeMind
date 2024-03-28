The provided Java code takes a string of digits and periods, and recursively substitutes the periods with the characters '0', '1', '+', '-', '*', '(', and ')'. After that, it computes expressions considering operator precedence and properly nested parentheses. The goal is to find the maximum decimal value that can be calculated from the resulting expressions, without exceeding 1023, and while ensuring the expressions are valid and within bounds.

Here is the equivalent Python code:

```python
import sys

class Result:
    def __init__(self, position, value):
        self.position = position
        self.value = value
        self.good = True
        self.update()

    def update(self):
        self.good &= 0 <= self.value < 1024

def calculate(s):
    def E(p):
        r = F(p)
        if not r.good:
            return r
        while s[r.position] in ('+', '-'):
            r2 = F(r.position + 1)
            if not r2.good:
                return r2
            r.value = r.value + r2.value if s[r.position] == '+' else r.value - r2.value
            r.update()
            if not r.good:
                return r
            r.position = r2.position
        return r

    def F(p):
        r = T(p)
        if not r.good:
            return r
        while s[r.position] == '*':
            r2 = T(r.position + 1)
            if not r2.good:
                return r2
            r.value *= r2.value
            r.update()
            if not r.good:
                return r
            r.position = r2.position
        return r

    def T(p):
        if s[p] == '(':
            r = E(p + 1)
            if not r.good or s[r.position] != ')':
                r.good = False
                return r
            r.position += 1
            return r
        elif s[p] in ('0', '1'):
            r = Result(p, 0)
            while p < len(s) and s[r.position] in ('0', '1'):
                r.value = r.value * 2 + int(s[r.position])
                r.position += 1
                r.update()
            return r
        else:
            return Result(0, -1)

    def calc():
        r = E(0)
        r.good &= r.position == len(s) - 1
        if r.good and '(' in s:
            stack = 0
            op = False
            for i, char in enumerate(s):
                if char == '(':
                    stack += 1
                elif char == ')':
                    stack -= 1
                    if stack == 0:
                        op |= s[i] in ('+', '-', '*')
                r.good &= stack == 0 and op
        return r.value if r.good else -1

    def dfs(i, expression):
        nonlocal max_value
        if i == len(expression):
            max_value = max(max_value, calc())
            return
        if s[i] == '.':
            for c in '01+-*()':
                s[i] = c
                dfs(i+1, expression)
                s[i] = '.'
        else:
            dfs(i+1, expression)

    s = list(s + "$")
    max_value = -sys.maxsize
    dfs(0, s)
    return max_value

s = input().strip()
print(calculate(s))
```

Here's the sample test case provided:

Test input:
```
000
```

Expected output:
```
0
```

