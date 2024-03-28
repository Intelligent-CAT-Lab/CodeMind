Here is the translated Java code into Python:

```python
def p00435():
    s = input()
    result = ""
    for c in s:
        result += chr((ord(c) - 42) % 26 + 65)
    print(result)

if __name__ == "__main__":
    p00435()
```

Explanation of the translation process:
- In Python, there's no need to import a Scanner for standard input; `input()` is used instead.
- The `for` loop iterates through the string directly, without conversion to a character array as in Java.
- The `ord()` and `chr()` functions are used in Python to convert between characters and their ASCII values.
- The `main` method signature in Java is replaced by a check for `__name__ == "__main__"`, a standard Python practice to run code when the script is executed directly.
- The `class` structure from Java is not needed in this case as Python functions do not need to be encapsulated within a class for such a simple script.
