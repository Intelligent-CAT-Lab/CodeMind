Here is the Python translation of the provided Java code. It reads an integer from the standard input, performs the calculation, and prints the result to the standard output.

```python
def solve(n):
    x = n // 1000
    y = n % 1000
    if y == 0:
        print(0)
    else:
        ans = 1000 * (x + 1) - n
        print(ans)

if __name__ == "__main__":
    n = int(input())
    solve(n)
```

Now, if we use the provided test input of `1900`, we should expect an output of `186` if the code is working correctly. You can run this Python code and provide the input `1900` to test it.
