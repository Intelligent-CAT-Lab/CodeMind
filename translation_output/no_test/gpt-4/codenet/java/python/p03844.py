Here is the equivalent Python code:

```python
# Python doesn't require explicit imports for basic functionality like input and print
def main():
    a = int(input())
    s = input()
    b = int(input())

    if s == "+":
        c = a + b
    elif s == "-":
        c = a - b

    print(c, end='')

# Invoke the main function
if __name__ == "__main__":
    main()
```

Note that in Python:
- We don't need to import a separate module to grab user input or to print to standard output.
- We use `input()` to capture input from the user.
- We use `int(input())` to capture an integer input.
- We don't need to declare `c` before using it.
- Instead of `System.out.print()`, Python uses `print()`.
- Python does not require semicolons at the end of each statement.
