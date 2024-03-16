```python
def search(a, b):
    o = 3 if a % 1000000 == 0 else 2 if a % 10000 == 0 else 1 if a % 100 == 0 else 0
    return b == o

D, N = map(int, input().split())
A = 10000 if D == 2 else 100 if D == 1 else 1

ser = 0
count = 0

while ser < N:
    count += 1
    if search(count * A, D):
        ser += 1

print(count * A)
```
Test:
```python
# Test input
0 5

# Expected output
5
```
```
