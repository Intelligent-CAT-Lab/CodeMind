Here's the provided Java code translated into Python:

```python
x, y, a, b = map(int, input().split())
res = []
for i in range(a, x + 1):
    for j in range(b, y + 1):
        if i <= j:
            continue
        res.append(f"{i} {j}")

print(len(res))
for pair in res:
    print(pair)
```

This Python code will take an input string (`5 5 3 2`), split it into integers by spaces, and store them in the variables `x`, `y`, `a`, and `b`. It then iterates through the specified range and creates a list of strings formatted as pairs, which are then printed out, preceded by the count of total pairs.

Run this code to process your test input, and you will get the expected output.
