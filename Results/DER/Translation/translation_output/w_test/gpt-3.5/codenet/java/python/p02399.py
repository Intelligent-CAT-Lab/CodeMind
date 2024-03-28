```python
a, b = map(int, input().split())

d = a // b
r = a % b
f = "{:.5f}".format(1.0 * a / b)

print(d, r, f)
```
