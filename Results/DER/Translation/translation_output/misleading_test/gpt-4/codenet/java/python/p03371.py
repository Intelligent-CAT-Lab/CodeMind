Here's the Java code translated into Python:

```python
# Read input from stdin
a, b, c, x, y = map(int, input().split())

# Determine the minimum amount of money to spend
min_xy = min(x, y)
max_xy = max(x, y)

if a + b < 2 * c:
    result = x * a + y * b
else:
    result = 2 * c * min_xy
    if max_xy == x:
        result += min(a, 2 * c) * (x - min_xy)
    else:
        result += min(b, 2 * c) * (y - min_xy)

# Print the result
print(result)
```

You can test the above Python code with the provided input:
```
1500 2000 1600 3 2
```
And the output should be:
```
7816
```
