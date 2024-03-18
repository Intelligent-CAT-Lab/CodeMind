Below is the Python translation of the given Java code:

```python
# Reading integers from input
x1, y1, x2, y2 = map(int, input().split())

# Calculating the coordinates for x3, y3, x4, y4
x3 = x2 + (y1 - y2)
y3 = y2 - (x1 - x2)
x4 = x1 + (y1 - y2)
y4 = y1 - (x1 - x2)

# Printing the results
print(x3, y3, x4, y4)
```

You can use the following test case to check if the translation is correct:

Test input:
```
2 3 6 6
```

Expected output:
```
3 10 -1 7
```
