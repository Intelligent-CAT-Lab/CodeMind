Here's the Java code translated into Python:

```python
def check_date_format(s):
    yy = s // 100
    mm = s % 100

    if 1 <= yy <= 12:
        if 1 <= mm <= 12:
            return "AMBIGUOUS"
        else:
            return "MMYY"
    else:
        if 1 <= mm <= 12:
            return "YYMM"
        else:
            return "NA"

# Main part of the program
if __name__ == "__main__":
    s = int(input())
    result = check_date_format(s)
    print(result)
```

Some key differences to note:
- The method `nextInt()` is substituted with `int(input())` for reading an integer from standard input in Python.
- I encapsulated the logic in a separate function, `check_date_format`, for better readability and potential reusability.
- There is no class definition needed in Python for such a simple script.
- The `main` method is replaced by a Python idiom `if __name__ == "__main__":` to indicate the entry point of the program.
