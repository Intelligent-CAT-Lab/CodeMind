Here is the Python equivalent of the Java code:

```python
def main():
    num1, num2 = map(int, input().split())
    print((num1 + num2) // 2)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, adds them together, and then divides the sum by 2. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java. The `map` function is used to convert the input strings to integers. The `input().split()` function is used to split the input string into a list of two strings, which are then converted to integers using the `map` function. The `main` function is defined to encapsulate the code, and it is called at the end of the script.
