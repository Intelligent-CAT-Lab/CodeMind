Here's the equivalent Python code for the provided Java code. I've also added a sample test case to demonstrate how to run it:

```python
def main():
    n, m = map(int, input().split())  # Read input
    base = n * 100 + m * 1800
    print(base << m)  # Print output with left bitwise shift

if __name__ == "__main__":
    main()

# Sample test input: "1 1"
# Expected output for the sample test case: 3800
```

In Python, we don't need to explicitly import a Scanner object for input reading, as the built-in function `input()` can be used instead. We then cast the strings from the input to integers with `map` and `split`. The rest of the logic, including the bit shift operation, is directly translated from the Java code.
