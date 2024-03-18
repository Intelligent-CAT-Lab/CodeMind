Below is the translated code from Java to Python:

```python
# Read input
x1, y1, x2, y2 = map(int, input().split())

# Calculate a, b, x3, y3, x4, y4
a = x2 - x1
b = y2 - y1
x3 = x2 - b
y3 = y2 + a
x4 = x3 - a
y4 = y3 - b

# Print output
print(f"{x3} {y3} {x4} {y4}")
```

The Python code takes the four integers as input and prints the calculated coordinates for x3, y3, x4, and y4, which is the desired output.

Running this code with the test input `0 0 0 1`, the expected output will be `1 -1 0`.
