Here's the equivalent code in Python:

```python
def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

A, B = map(int, input().split())
print(lcm(A, B))
```

To test with the provided test case:

```python
# Test input:
# 2 3

# Expected output:
# 92

A, B = map(int, input().split())
print(lcm(A, B))
```

Input `2 3` to the script, and the output will be `6` which is the least common multiple of 2 and 3. It seems there is a mistake with the expected output in the provided test case, since the LCM (Least Common Multiple) of 2 and 3 is actually 6, not 92.
