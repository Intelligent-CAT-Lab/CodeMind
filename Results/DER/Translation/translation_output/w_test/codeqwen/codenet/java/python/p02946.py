Here is the Python equivalent of the Java code:

```python
def main():
    K, X = map(int, input().split())

    for i in range(X - K + 1, X + K):
        print(i, end=" ")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, K and X, and then prints out a sequence of integers from X - K + 1 to X + K - 1, inclusive. The `end=" "` argument in the `print` function is used to print the numbers on the same line separated by a space instead of on separate lines. The `if __name__ == "__main__":` block is used to call the `main` function when the script is run directly.
