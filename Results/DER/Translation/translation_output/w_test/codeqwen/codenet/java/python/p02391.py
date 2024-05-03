Here is the Python equivalent of the Java code:

```python
def main():
    CMD = input()
    str = CMD.split(" ")
    x = int(str[0])
    y = int(str[1])

    if x == y:
        print("a == b")
    elif x < y:
        print("a < b")
    else:
        print("a > b")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, compares them, and prints out whether they are equal, less than, or greater than each other. The `elif` statement is used instead of multiple `if` statements to make the code more readable. The `if __name__ == "__main__":` block is used to ensure that the `main()` function is only called when the script is run directly, not when it is imported as a module.
