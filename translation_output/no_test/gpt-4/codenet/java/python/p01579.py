Here's the translated Python code:

```python
from collections import defaultdict

class p01579:
    def __init__(self):
        self.INF = 1 << 28
        self.EPS = 1e-9

    def run(self):
        self.s = input()
        self.solve()

    def solve(self):
        n = len(self.s)
        count = defaultdict(int)
        now = 0
        for char in self.s:
            if char == '(':
                now += 1
            else:
                now -= 1
            count[now + n] += 1
        
        now = 0
        ans = 0
        for char in self.s:
            if char == '(':
                now += 1
            else:
                now -= 1
            count[now + n] -= 1
            ans += count[now + n]

        print(ans)

if __name__ == "__main__":
    p = p01579()
    p.run()
```

This Python version uses the `defaultdict` from `collections` to replace Java's implicit default value assignments when accessing a map. The `int` function for `defaultdict` works as a default factory and will initialize missing values to 0, mimicking Java's default value for uninitialized array elements. The rest of the code follows Python's syntax for string manipulation and iteration. Instead of a `Scanner` in Java, we simply use `input()` to read a line from standard input in Python.
