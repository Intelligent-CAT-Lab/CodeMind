Here is the Python equivalent of the Java code:

```python
def main():
    for i in range(3):
        print(input()[0].upper(), end="")
    print()

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads three strings from the user, converts the first character of each string to uppercase, and prints them out. The `end=""` argument in the `print` function is used to prevent a newline character from being printed after each character. The `if __name__ == "__main__":` block is used to ensure that the `main` function is only called when the script is run directly (not when it is imported as a module).
