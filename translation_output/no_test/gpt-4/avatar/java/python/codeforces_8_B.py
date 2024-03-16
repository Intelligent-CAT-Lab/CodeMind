Here is the translated code from Java to Python:

```python
s = input()
x = y = k = 0
flag = True
co = [[0 for _ in range(101)] for _ in range(2)]

co[0][k] = x
co[1][k] = y
k += 1

for ch in s:
    if ch == 'L':
        x -= 1
    elif ch == 'R':
        x += 1
    elif ch == 'U':
        y += 1
    elif ch == 'D':
        y -= 1

    co[0][k] = x
    co[1][k] = y
    k += 1

for i in range(k - 3):
    for j in range(i + 3, k):
        dx = abs(co[0][i] - co[0][j])
        dy = abs(co[1][i] - co[1][j])
        if (dx <= 1 and dy == 0) or (dy <= 1 and dx == 0):
            flag = False
            break
    if not flag:
        break

if flag:
    print("OK")
else:
    print("BUG")
```

This Python code takes a directional string as input and uses a similar logic for mapping out coordinates and checking conditions to output "OK" or "BUG" as per the given Java code. Note that `abs()` is used in Python to get the absolute value, replacing the manual checks for negative values in the original code. Also, Python uses lists, which are more flexible than Java's fixed-size arrays, and therefore we don't have to declare the size of the string (or character array) beforehand.
