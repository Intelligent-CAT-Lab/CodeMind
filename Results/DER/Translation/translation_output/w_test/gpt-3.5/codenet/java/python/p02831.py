```python
def calculate_lcm(A, B):
    gcd = 0
    for i in range(1, max(A, B)):
        if A % i == 0 and B % i == 0:
            gcd = i
    lcm = A * B // gcd
    return lcm

A, B = map(int, input().split())
result = calculate_lcm(A, B)
print(result)
```
