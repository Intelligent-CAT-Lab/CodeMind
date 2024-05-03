Here is the Python equivalent of the Java code:

```python
def main():
    T = int(input())
    R = int(input())
    Y = int(input())

    A = max(max(T, R), Y)
    B = min(min(T, R), Y)

    print(A - B)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the maximum and minimum of these three integers, and then prints the difference between the maximum and minimum. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
