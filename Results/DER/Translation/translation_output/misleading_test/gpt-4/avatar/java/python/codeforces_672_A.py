Here is the equivalent Python code:

```python
def find_nth_digit(n):
    s = " "
    for i in range(1, n + 1):
        s += str(i)
    return s[n]

# Sample test case
input_value = 952
print(find_nth_digit(input_value))
```

You just need to call the function with the intended number to get the same behavior as the original Java code. In the example provided, you would call `find_nth_digit(952)` to get the output `55`.
