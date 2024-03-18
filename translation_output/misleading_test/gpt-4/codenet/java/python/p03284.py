Certainly! Here's the translation of your Java code into Python:

```python
# Read input from the user
n, k = map(int, input().split())

# Check if n is divisible by k and print the result
if n % k == 0:
    print(0)
else:
    print(1)
```

Now, you can test this Python code using the provided test case:

Test input:
```
7 3
```

Expected output:
```
1
``` 

It seems that there was a discrepancy between the provided Java code and the expected output for the test case. In the Java code, if `n` is divisible by `k`, it prints `0`, otherwise `1`. However, if the expected output is `81`, then the provided Java code doesn't match that requirement. For the test case given, the Java code would output `1` since `7 % 3` is not `0`. If `81` is indeed the expected output, you'll need to specify the logic or calculation that leads to this result.
