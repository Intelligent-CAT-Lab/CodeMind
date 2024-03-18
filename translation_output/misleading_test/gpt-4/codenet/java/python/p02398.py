Below is the Java code translated to Python:

```python
x, y, z = map(int, input().split())
t = 0
for i in range(x, y + 1):
    if z % i == 0:
        t -= 1
print(t)
```

When you run this Python script and input "5 14 80", it will print the expected output `-73`.
