Here's the translated Python code that performs the same calculation of the least common multiple (LCM) as the given Java code:

```python
def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

a, b = map(int, input().split())
print(lcm(a, b))
```

Test this with your input "2 3" to confirm that it outputs "6" as expected.
