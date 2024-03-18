```python
import sys

class Task:
    def solve(self, input_data):
        N, d = map(int, input_data.split())
                
        if d == 1:
            return str(N * (N - 1) // 2)
        elif d == 2:
            return str(N * (N - 1) // 2 - 1)
        else:
            m = N - d
            ans = m * (m - 1) // 2 + 2 * m + (d - 2)
            return str(ans)

if __name__ == "__main__":
    input_data = sys.stdin.readline().strip()
    solver = Task()
    result = solver.solve(input_data)
    print(result)
```

