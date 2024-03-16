Here's the equivalent Python code for the Java code you provided:

```python
# Function to calculate the minimum number of operations
def calc(n, memo):
    if n == 0:
        return 0
    if memo[n] != -1:
        return memo[n]

    res = n
    pow6 = 1
    while pow6 <= n:
        res = min(res, calc(n - pow6, memo) + 1)
        pow6 *= 6

    pow9 = 1
    while pow9 <= n:
        res = min(res, calc(n - pow9, memo) + 1)
        pow9 *= 9

    memo[n] = res
    return memo[n]

# The main logic of the program
def main():
    n = int(input())
    memo = [-1] * (n+1)
    ans = calc(n, memo)
    print(ans)

# Sample test case
if __name__ == "__main__":
    main()
```

In the above Python code, I translated the Java logic directly into Python. The `memo` array initialization and function calls are adapted to Python's syntax and semantics. In Python, we generally don't have static initializers, so the memo array is filled with -1 directly at the time of creation. The `main` function in Python uses the `input` function instead of `Scanner` used in Java to read the input. The `calc` function is implemented as a standalone function with the `memo` array passed in as an argument, as Python doesn't support static variables in the same sense as Java.

To test the code, you can run the Python script, and then input the number `127` when prompted. The expected output would be `4`.
