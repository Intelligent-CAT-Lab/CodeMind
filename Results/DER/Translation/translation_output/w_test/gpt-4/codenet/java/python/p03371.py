Here's the translated Python code:

```python
def calculate_cost(a, b, c, x, y):
    if a + b < 2 * c:
        return x * a + y * b
    else:
        min_xy = min(x, y)
        max_xy = max(x, y)
        res = 2 * c * min_xy
        if max_xy == x:
            res += min(a, 2 * c) * (max_xy - min_xy)
        else:
            res += min(b, 2 * c) * (max_xy - min_xy)
        return res

# Sample test input
inputs = list(map(int, input().split()))
a, b, c, x, y = inputs

# Calculate and print the output
print(calculate_cost(a, b, c, x, y))
```

When you run this Python code, you should input your test case as follows (with each value separated by a space):
```
1500 2000 1600 3 2
```

The expected output for the provided test input would be:
```
7900
```
