Here is the Python equivalent of the Java code:

```python
n = int(input())
print(n, end=" ")
m = n
for i in range(n - 1, 0, -1):
    if m % i == 0:
        print(i, end=" ")
        m = i
```

In this Python code, we use the `input()` function to get the input from the user, convert it to an integer using `int()`, and assign it to the variable `n`. We then print `n` followed by a space using `print(n, end=" ")`.

Next, we assign `n` to the variable `m`. We then use a `for` loop to iterate from `n - 1` down to `1`. In each iteration, we check if `m` is divisible by `i` using the modulo operator `%`. If it is, we print `i` followed by a space using `print(i, end=" ")` and assign `i` to `m`. This ensures that we only print the largest divisor of `n` that is less than `n` itself.
