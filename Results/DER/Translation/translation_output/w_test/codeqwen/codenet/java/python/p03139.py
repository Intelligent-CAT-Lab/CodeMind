Here is the Python equivalent of the Java code:

```python
def main():
    N = int(input())
    A = int(input())
    B = int(input())
    print(min(A, B), max(0, A + B - N))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the minimum of A and B, and the maximum of 0 and A + B - N, and then prints them out. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
