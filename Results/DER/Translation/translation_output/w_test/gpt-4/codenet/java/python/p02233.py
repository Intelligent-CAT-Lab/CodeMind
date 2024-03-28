Here's the equivalent Python code:

```python
def fib(n, memo=None):
    if memo is None:
        memo = [0] * 100
    if memo[n] != 0:
        return memo[n]
    if n == 0 or n == 1:
        memo[n] = 1
        return memo[n]
    memo[n] = fib(n-1, memo) + fib(n-2, memo)
    return memo[n]

n = int(input())
print(fib(n))
```
This Python function, `fib`, imitates the behavior of the original Java version, using a default argument for the memoization list to avoid having it as a global variable. If you call `fib()` with just the argument `n`, it will create a new list for `memo`, which will be passed to subsequent calls. The memoization list is indexed the same way as in the Java code. 

You can run the Python code with an input of `3`, and it will give you the expected output of `3`. 

Let's explain the translation a bit:

- The Java static method `fib` is translated to a regular Python function, and we pass the memoization list `memo` as a parameter with a default value of `None`.
- A new list of zeros is created in the first call with `memo = [0] * 100`. 
- `Scanner` usage in Java is replaced with the built-in `input()` function in Python.
- Java's `System.out.println()` is equivalent to Python's `print()` function.
- In Java, we use `return memo[n] = 1;`, which assigns and returns in a single statement. This is not possible in Python, so it's separated into two lines: `memo[n] = 1` followed by `return memo[n]`. 

The rest of the code remains logically the same, carrying out the same Fibonacci calculation with memoization.
