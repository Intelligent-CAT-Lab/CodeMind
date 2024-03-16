Here's the Java code translated into Python:

```python
def atcoder_ABC136_B(N):
    count = 0
    temp = N
    ans = 0

    while temp > 0:
        temp //= 10
        count += 1

    for i in range(1, count + 1):
        if i == count:
            if i % 2 == 1:
                ans += (N - 10 ** (i - 1) + 1)
        else:
            if i == 1:
                ans += 9
            elif i % 2 == 1:
                ans += (10 ** i - 10 ** (i - 1))

    return ans

# Test input
input_value = 99999

# Expected output: 90909
output_value = atcoder_ABC136_B(input_value)
print(output_value)
```

When you run the above Python code with the provided test input of `99999`, it should print the expected output, which is `90909`.
