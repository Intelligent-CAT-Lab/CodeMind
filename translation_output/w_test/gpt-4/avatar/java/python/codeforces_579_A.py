Here's the equivalent Python code for the given Java code:

```python
def count_set_bits(n):
    s = ""

    while n > 0:
        x = n % 2
        n //= 2
        s += str(x) + " "

    ans = 0

    for i in range(len(s)):
        if s[i] == '1':
            ans += 1

    return ans

# Test input
n = 9

# Expected output
print(count_set_bits(n))
```

This function counts the number of set bits (number of '1's in the binary representation) of a given integer (`n`). The test case provided will output `2`, as the binary representation of `9` is `1001`, which contains two '1's.
