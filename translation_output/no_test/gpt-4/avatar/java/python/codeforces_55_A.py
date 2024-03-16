Here is the equivalent Python code for the Java code you've provided:

```python
def is_power_of_two(n):
    return (n & (n - 1)) == 0

n = int(input())
if is_power_of_two(n):
    print("YES")
else:
    print("NO")
```

This code defines a function to check if a number is a power of two by using a bitwise AND operation between the number `n` and `n - 1`. This trick works because powers of two have only one bit set in binary representation, and `n - 1` has all the lower bits set. When you AND these together, the result will be zero only if `n` is a power of two. The program then reads an integer from the standard input, checks if it's a power of two, and prints "YES" or "NO" accordingly.
