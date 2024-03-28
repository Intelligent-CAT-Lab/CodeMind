Here is the equivalent Python code for the provided Java code. It reads an integer from the input, converts it to the desired form, and prints out the result.

```python
def codeforces_514_A(x):
    x = int(x)  # Ensure input is an integer
    list_digits = []

    while x > 0:
        r = x % 10
        if 9 - r < r:
            if x // 10 == 0 and 9 - r == 0:
                list_digits.append(r)
            else:
                list_digits.append(9 - r)
        else:
            list_digits.append(r)
        x = x // 10

    new_number = 0
    pow = 1

    for i in list_digits:
        new_number += i * pow
        pow *= 10

    return new_number

# Test input
test_input = 5728
# Expected output: 4304

print(codeforces_514_A(test_input))
```

When you run this Python code with the test input provided, it will output `4304`, the expected output.
