Here is the code translated into Python:

```python
def fib(n, memo=None):
    if memo is None:
        memo = [0] * 100
    if memo[n] != 0:
        return memo[n]
    if n == 0 or n == 1:
        memo[n] = 1
        return 1
    memo[n-1] = fib(n-1, memo)
    memo[n-2] = fib(n-2, memo)
    memo[n] = memo[n-1] + memo[n-2]
    return memo[n]

if __name__ == "__main__":
    n = int(input())
    print(fib(n))
```

Python does not have a built-in `Scanner` class like Java, so we use `input()` to read a line from standard input, and `int()` is used to convert it to an integer. The memoization array is now a default argument to the `fib` function. It's important to set the default value of `memo` to `None` and then initialize it inside the function to avoid issues with mutable default arguments.
