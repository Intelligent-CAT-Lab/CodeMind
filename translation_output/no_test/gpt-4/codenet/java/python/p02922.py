Below is the translated code from Java to Python:

```python
def main():
    a = int(input())
    b = int(input())

    ans = (b - 1) // (a - 1)
    if (b - 1) % (a - 1) == 0:
        print(ans)
    else:
        print(ans + 1)

if __name__ == "__main__":
    main()
```

Here's a breakdown of the changes made:
- Java's `Scanner` is replaced by Python's `input()` function to read inputs.
- The syntax for defining a function has changed to Python's `def` keyword.
- Integer division in Java is done using `/` and it always truncates the decimal part, which is similar to `//` in Python for integer division.
- In Python, the `print` function is used to output the results to the console.
- Python does not need explicit import for basic input and output operations.
- There's no need for a semicolon at the end of statements in Python.
- Python uses indentation to define a block of code instead of curly braces `{}`.
