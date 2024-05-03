Here is the Python equivalent of the Java code:

```python
import sys

class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.inp = stream
        self.st = None

    def next(self):
        while self.st is None or not self.st.has_more_tokens():
            try:
                self.st = StringTokenizer(self.inp.readline())
            except IOError:
                raise RuntimeError(e)
        return self.st.nextToken()

class TaskD:
    def solve(self, testNumber, inp, out):
        s = inp.next().toCharArray()
        d = [s.length] * (1 << 26)
        d[0] = 0
        mask = 0
        ans = s.length
        for i in range(s.length):
            c = ord(s[i]) - ord('a')
            mask ^= 1 << c
            for j in range(-1, 26):
                m = j < 0 and 0 or (1 << j)
                cur = 1 + d[m ^ mask]
                d[mask] = min(d[mask], cur)
                if i == s.length - 1:
                    ans = min(ans, cur)
        out.println(ans)

if __name__ == "__main__":
    inp = FastScanner()
    out = sys.stdout
    solver = TaskD()
    solver.solve(1, inp, out)
```

Please note that Python does not have a built-in `PrintWriter` class like Java, so I've used `sys.stdout` instead. Also, Python does not have a built-in `StringTokenizer` class like Java, so I've used the `split()` method instead. The `ord()` function is used to get the ASCII value of a character.
