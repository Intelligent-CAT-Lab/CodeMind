Here's the Java code translated into Python:

```python
N = int(input())

X = N

fx = 0

while N >= 10:
    fx += N % 10
    N //= 10

fx += N

if X % fx == 0:
    print("Yes")
else:
    print("No")
```

To check with the provided test case:
```python
# Test input
N = 12

# Expected output: Yes

X = N
fx = 0

while N >= 10:
    fx += N % 10
    N //= 10

fx += N

if X % fx == 0:
    print("Yes")
else:
    print("No")
```
