```python
import sys

class TaskD:
    def solve(self, test_number, in_stream, out_stream):
        s = in_stream.readline().strip()
        d = [len(s)] * (1 << 26)
        d[0] = 0
        mask = 0
        ans = len(s)
        for i in range(len(s)):
            c = ord(s[i]) - ord('a')
            mask ^= 1 << c
            for j in range(-1, 26):
                m = 0 if j < 0 else 1 << j
                cur = 1 + d[m ^ mask]
                d[mask] = min(d[mask], cur)
                if i == len(s) - 1:
                    ans = min(ans, cur)
        out_stream.write(str(ans) + "\n")
    
if __name__ == "__main__":
    solver = TaskD()
    solver.solve(1, sys.stdin, sys.stdout)
```

