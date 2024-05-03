Here is the Python equivalent of the Java code:

```python
def main():
    r, d, x = map(int, input().split())

    for i in range(10):
        x = r * x - d
        print(x)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, then it calculates and prints the next 10 values in the sequence. The sequence is calculated by multiplying the current value by `r` and subtracting `d`. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
