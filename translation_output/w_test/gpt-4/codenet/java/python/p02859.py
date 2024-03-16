Here is the translated Python code:

```python
def solve(testNumber, r):
    print(r * r)

if __name__ == "__main__":
    r = int(input().strip())
    solve(1, r)
```

For the sample test case provided with input `2`, running this Python code will generate the following output:

```
4
```

In the Python translation, we use the built-in `input()` function to read from standard input and `int()` to convert the input to an integer. Since we are directly printing the result to standard output, there's no need for separate `InputReader` or `OutputWriter` classes that were present in the original Java code.
