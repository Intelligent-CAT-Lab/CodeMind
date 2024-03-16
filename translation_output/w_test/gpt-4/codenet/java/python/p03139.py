Here's the equivalent Python code for the Java code provided, rewritten to use Python's `min` and `max` functions. This does not include the user input handling but I will include it as part of the code. I'm assuming the user input should be read in a way similar to that provided by the Scanner in Java.

```python
def main():
    # Read integers from input
    N, A, B = map(int, input().split())
    # Print the minimum of A and B, and the maximum of 0 and A+B-N
    print(min(A, B), max(0, A + B - N))

if __name__ == "__main__":
    main()
```

When you run this Python code and input the example test case `10 3 5`, it should give you the expected output of `3 0`.
