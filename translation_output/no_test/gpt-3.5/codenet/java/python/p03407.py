```python
import sys

def solve(test_number, inputs):
    a, b, c = map(int, inputs.split())
    if a + b >= c:
        return "Yes"
    else:
        return "No"

if __name__ == "__main__":
    inputs = sys.stdin.read().strip()
    result = solve(1, inputs)
    print(result)
```
