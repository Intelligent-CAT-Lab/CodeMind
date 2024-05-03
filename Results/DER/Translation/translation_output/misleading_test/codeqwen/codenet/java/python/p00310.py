Here is the Python equivalent of the Java code:

```python
def main():
    p, m, c = map(int, input().split())
    print(p + m + c)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads three integers from the user, adds them together, and prints the result. The `map` function is used to convert the input strings to integers, and the `input().split()` function is used to split the input string into a list of strings, which are then converted to integers using the `map` function. The `if __name__ == "__main__":` block is used to ensure that the `main` function is only called when the script is run directly, not when it is imported as a module.
