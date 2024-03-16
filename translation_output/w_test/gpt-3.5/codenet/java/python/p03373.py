```python
import sys

def solve(a, b, c, x, y):
    min_cost = sys.maxsize
    for i in range(max(x, y) + 1):
        tmp = a * max(0, x - i) + b * max(0, y - i) + c * i * 2
        min_cost = min(min_cost, tmp)
    return min_cost

if __name__ == "__main__":
    input_vals = input().split()
    a, b, c, x, y = map(int, input_vals)
    result = solve(a, b, c, x, y)
    print(result)
```

