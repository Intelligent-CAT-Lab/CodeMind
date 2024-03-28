Here's the translated Python code:

```python
def solve(n, a, b):
    print(min(a * n, b))

# Sample test case
if __name__ == "__main__":
    input_string = input() # assume input is a string in the format "4 2 9"
    n, a, b = map(int, input_string.split())
    solve(n, a, b)
```

To run the sample test case, you will need to input the values in the console as a space-separated string, for example: `4 2 9`. This should yield the expected output of `8`.
