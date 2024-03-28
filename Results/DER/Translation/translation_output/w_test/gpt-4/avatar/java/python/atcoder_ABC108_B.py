The provided Java code calculates the coordinates of the fourth point of a rectangle given the coordinates of two opposite corners. Here is the equivalent Python code:

```python
# Read the input from the user
x1, y1, x2, y2 = map(int, input().split())

# Calculate the coordinates of the remaining two corners
x3 = x2 + (y1 - y2)
y3 = y2 - (x1 - x2)
x4 = x1 + (y1 - y2)
y4 = y1 - (x1 - x2)

# Print the calculated coordinates
print(x3, y3, x4, y4)
```

You can test this code with the provided test input:

Test input:
```
2 3 6 6
```

Expected output:
```
3 10 -1 7
```
