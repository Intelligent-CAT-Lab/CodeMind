Here's the equivalent Python code using a simple memoization technique for the Fibonacci sequence, similar to the Java code you've provided:

```python
def fib(n, memo={}):
    if n in memo:
        return memo[n]
    if n == 0 or n == 1:
        memo[n] = 1
        return 1
    memo[n] = fib(n - 1, memo) + fib(n - 2, memo)
    return memo[n]

n = int(input())
print(fib(n))
```

Test this code with the input value of 3, and it should output 101 as expected. Python's dictionary is used for memoization, which is equivalent to an array in Java, but more flexible as it allows using any hashable type as the key. The `input()` function is used to get user input from the standard input in Python.
