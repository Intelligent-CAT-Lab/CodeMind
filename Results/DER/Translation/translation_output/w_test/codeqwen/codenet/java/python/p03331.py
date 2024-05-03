Here is the Python equivalent of the Java code:

```python
def digit(num):
    r = 0
    while True:
        r += (num%10)
        num //= 10
        if num == 0:
            break
    return r

n = int(input())
ans = n
for a in range(2, n//2 + 1):
    b = n - a
    sum = digit(a) + digit(b)
    ans = min(sum, ans)
print(ans)
```

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the minimum sum of digits for each possible pair of numbers that add up to the input number, and prints the minimum sum.
