Here is the Python equivalent of the Java code:

```python
def main():
    x = [int(input()) for _ in range(5)]
    print(15 - sum(x))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads 5 integers from the user, stores them in a list, and then prints the difference between 15 and the sum of the integers in the list. The `if __name__ == "__main__":` block is used to ensure that the `main()` function is only called when the script is run directly (not when it is imported as a module).
