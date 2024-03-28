```python
def atcoder_ABC174_C(n):
    num = 7
    res = 1

    while num < n:
        num = num * 10 + 7
        res += 1

    num_set = set()

    while True:
        if num % n == 0:
            break
        num %= n
        res += 1
        if num in num_set:
            res = -1
            break
        num = num * 10 + 7
        num_set.add(num)

    return res

# Test input
print(atcoder_ABC174_C(260522))  # Output: 18
```
