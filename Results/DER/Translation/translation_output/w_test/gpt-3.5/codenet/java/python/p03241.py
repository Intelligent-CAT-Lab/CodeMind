```python
def find_divisor(n, m):
    for i in range(m // n, 0, -1):
        if m % i == 0:
            return i

n, m = map(int, input().split())
print(find_divisor(n, m))
```
