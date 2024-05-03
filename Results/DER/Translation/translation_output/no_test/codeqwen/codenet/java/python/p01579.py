Here is the Python equivalent of the Java code you provided:

```python
import sys

class p01579:
    def run(self):
        self.s = sys.stdin.readline().strip()
        self.solve()

    def solve(self):
        n = len(self.s)
        count = [0] * (2 * n + 1)
        now = 0
        for i in range(n):
            if self.s[i] == '(':
                now += 1
            else:
                now -= 1
            count[now + n] += 1
        # self.debug(count)
        now = 0
        ans = 0
        for i in range(n):
            if self.s[i] == '(':
                now += 1
            else:
                now -= 1
            count[now + n] -= 1
            # self.debug(now, count[now + n])
            ans += count[now + n]
        print(ans)

    def println(self, s):
        print(s)

    def print(self, s):
        print(s, end='')

    def debug(self, *os):
        print(os)

if __name__ == "__main__":
    p = p01579()
    p.run()
```

Please note that Python does not have a built-in `deepToString` function like Java, so I've commented out the debugging line. If you need to print the contents of a list or other data structure, you can use the `print` function with the `*` operator to unpack the elements.
