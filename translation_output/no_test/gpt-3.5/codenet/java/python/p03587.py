```python
import sys

class AAccepted:
    def solve(self, in_data, out):
        s = in_data.strip()
        n = s.count('1')
        out.write(str(n) + '\n')

if __name__ == '__main__':
    solver = AAccepted()
    for line in sys.stdin:
        solver.solve(line, sys.stdout)
```
