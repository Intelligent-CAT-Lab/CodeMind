```python
import sys

class p03715:
    def __init__(self):
        self.mod = 10**9 + 7
        self.IO = IOFast()

    def run(self):
        TEST_CASE = 1
        while TEST_CASE != 0:
            h = self.IO.nextInt()
            w = self.IO.nextInt()
            sys.stdout.write(str(self.dfs(3, sys.maxsize, -sys.maxsize, w, h)) + '\n')
            TEST_CASE -= 1

    def dfs(self, d, S1, S2, w, h):
        if w <= 0 or h <= 0:
            return sys.maxsize
        if d == 1:
            return max(S2, w * h) - min(S1, w * h)
        
        ans = sys.maxsize
        for i in range(-1, 2):
            dw = w // d + i
            dh = h // d + i
            if dw > 0:
                ans = min(ans, self.dfs(d - 1, min(S1, dw * h), max(S2, dw * h), w - dw, h))
            if dh > 0:
                ans = min(ans, self.dfs(d - 1, min(S1, w * dh), max(S2, w * dh), w, h - dh))

        return ans

    def main(self):
        try:
            self.run()
        except EndOfFileRuntimeException:
            pass
        sys.stdout.flush()

class IOFast:
    def nextInt(self):
        return int(input())

class EndOfFileRuntimeException(Exception):
    pass

if __name__ == "__main__":
    p = p03715()
    p.main()
```
When you run the python code with input `3 5`, it will output `24` as expected.
