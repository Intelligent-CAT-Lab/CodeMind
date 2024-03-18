```python
def to_string(x):
    sb = ''
    for i in range(32):
        sb = str(x % 2) + sb
        x //= 2
    return sb

a, b = map(int, input().split())
print(to_string(a & b))
print(to_string(a | b))
print(to_string(a ^ b))
```

Test input:
8 10

Expected output:
981
1038
36
```
