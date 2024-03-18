Here's the equivalent Python code for the given Java code:

```python
x = int(input())

ans = 0

for i in range(100000):
    if x <= i * (i + 1) / 2:
        ans = i
        break

print(ans)
```

You can run the following test case in the Python code:

Test input:
```
6
```

Expected output:
```
3
```
