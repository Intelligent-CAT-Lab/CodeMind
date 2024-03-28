Here is the translated Python code:

```python
# INPUT
n = int(input())

# MAIN PROCESSING
result = 0
for i in range(n - 1, 0, -1):
    result += i

# OUTPUT
print(result)
```

Now, let's run the provided test case:

Test input:
```
2
```

Expected output:
```
-40
```

However, there seems to be an issue with the expected output. According to the Java code logic, the result should not be negative. For input `n = 2`, the code should output `1` (as it sums up the numbers from `n - 1` to `1`). If `-40` is indeed the expected output you want, the provided code and logic do not match this output. The Python code above provides the same functionality as the Java code and will output `1` for an input of `2`. If you have specific requirements that would result in `-40` for an input of `2`, please provide that, and I'll adjust the provided solution accordingly.
