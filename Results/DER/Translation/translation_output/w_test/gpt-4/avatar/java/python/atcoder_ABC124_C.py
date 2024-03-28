Here is the equivalent Python code for the given Java code snippet:

```python
def atcoder_ABC124_C(s):
    ans1, ans2 = 0, 0

    for i, c in enumerate(s):
        if i % 2 == 0:
            if c == '0':
                ans1 += 1
            else:
                ans2 += 1
        else:
            if c == '1':
                ans1 += 1
            else:
                ans2 += 1

    return min(ans1, ans2)

# Test input
print(atcoder_ABC124_C("0"))

# You can include more test cases if needed
```

The Python code includes a function that takes a string as an argument and prints the minimum of `ans1` and `ans2`, where `ans1` and `ans2` are incremented based on whether the current character should be `'0'` or `'1'` in a properly alternating string while minimizing the number of changes.
