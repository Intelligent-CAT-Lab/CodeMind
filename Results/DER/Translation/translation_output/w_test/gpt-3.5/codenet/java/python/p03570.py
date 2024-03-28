```python
class FastScanner:
    def __init__(self, stream):
        self.in_stream = stream
        self.st = None

    def next(self):
        while self.st is None or not self.st.hasMoreTokens():
            try:
                self.st = self.in_stream.readline().split()
            except IOError as e:
                raise RuntimeError(e)
        return self.st.__next__()

class TaskD:
    def solve(self, test_number, in_stream):
        s = list(in_stream.next())
        d = [0xfffff for _ in range(1 << 26)]
        d[0] = 0
        mask = 0
        ans = len(s)
        for i in range(len(s)):
            c = ord(s[i]) - ord('a')
            mask ^= 1 << c
            for j in range(-1, 26):
                m = 0 if j < 0 else (1 << j)
                cur = 1 + d[m ^ mask]
                d[mask] = min(d[mask], cur)
                if i == len(s) - 1:
                    ans = min(ans, cur)
        print(ans)

import sys
input_stream = sys.stdin
task = TaskD()
scanner = FastScanner(input_stream)
task.solve(1, scanner)
```
```
