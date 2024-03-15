```python
import sys
from math import floor

class Task:
    def solve(self, in_data):
        N, d = map(int, in_data.split())
        
        if d == 1:
            return str(N * (N - 1) // 2)
        elif d == 2:
            return str(N * (N - 1) // 2 - 1)
        else:
            m = N - d
            ans = m * (m - 1) // 2 + 2 * m + (d - 2)
            return str(ans)

def main():
    in_data = sys.stdin.read().strip()
    task = Task()
    result = task.solve(in_data)
    print(result)

if __name__ == "__main__":
    main()
```
