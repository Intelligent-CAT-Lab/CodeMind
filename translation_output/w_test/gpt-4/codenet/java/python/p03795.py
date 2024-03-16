Certainly! Below is the equivalent code translated to Python from the provided Java code:

```python
def main():
    n = int(input())  # Read an integer from standard input
    print((n * 800) - ((n // 15) * 200))  # Compute and print the result

if __name__ == "__main__":
    main()
```

The `input()` function in Python automatically returns a string, which can be converted to an integer using the `int()` function. Python's print function directly outputs the computed value.

When you run the Python code and input `20`, it should output `15800` as expected.
