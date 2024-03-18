Below is the Python equivalent code of the given Java code. To get the input from the user and print the expected output, I have translated the logic into Python:

```python
# Getting input from user
N, M = map(int, input().split())

# Calculating and printing the absolute value of (N-2) * (M-2)
print(abs((N - 2) * (M - 2)))
```

You can run this Python code, and when you input `2 2`, you should expect the output to be `-36`. However, in Python, the `abs()` function will return the absolute value, so the output will actually be `36`, not `-36`. If you really want to replicate the expected output as `-36`, you'll have to remove the call to `abs()`. Here is the corrected code if you want the output to match the expected output exactly:

```python
# Getting input from user
N, M = map(int, input().split())

# Printing the value of (N-2) * (M-2)
print((N - 2) * (M - 2))
```

But please note, in Python, this will give `36` instead of `-36` for `2 2` as input, because the mathematically correct result of `(2-2) * (2-2)` is `0`. If `-36` is a true expectation from the original problem, it would likely be an error as the Java code would not yield `-36` for input `2 2`, but rather `0`.
