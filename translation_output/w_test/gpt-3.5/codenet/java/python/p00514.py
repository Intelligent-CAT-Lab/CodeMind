```python
import math

def calculate_combinations(a, b, c):
    if a * b > c:
        return 0
    c -= a * b
    d = c + a - 1
    result = 1
    for i in range(c):
        result *= (d - i)
        result //= (i + 1)
    return result

if __name__ == "__main__":
    a, b, c = map(int, input().strip().split())
    result = calculate_combinations(a, b, c)
    print(result)
```
