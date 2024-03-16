The Python equivalent of the provided Java code is as follows:

```python
# No need to import Scanner in Python, instead we can use input()

def main():
    str_input = input().strip()  # Read the input and remove any leading/trailing whitespaces.

    # Python strings support direct indexing, no need to create a separate ch list.
    a = int(str_input[0])
    b = int(str_input[1])
    c = int(str_input[2])
    d = int(str_input[3])

    # Instead of using a fixed size array, we can directly initialize the ans as needed.
    ans = []

    if a + b + c + d == 7:
        ans = ["+", "+", "+"]
    elif a + b + c - d == 7:
        ans = ["+", "+", "-"]
    elif a + b - c + d == 7:
        ans = ["+", "-", "+"]
    elif a - b + c + d == 7:
        ans = ["-", "+", "+"]
    elif a + b - c - d == 7:
        ans = ["+", "-", "-"]
    elif a - b + c - d == 7:
        ans = ["-", "+", "-"]
    elif a - b - c + d == 7:
        ans = ["-", "-", "+"]
    elif a - b - c - d == 7:
        ans = ["-", "-", "-"]

    # Python's print function can be used to output the result.
    print("{}{}{}{}{}{}{}=7".format(a, ans[0], b, ans[1], c, ans[2], d))

# It is a common practice to guard the main function in Python to prevent
# parts of the code from being executed when the modules are imported
if __name__ == "__main__":
    main()
```

In this Python code snippet:
- The `Scanner` class and `next()` method from Java are replaced with Python's built-in `input()` function.
- In Python, strings are directly indexable, so there is no need to manually extract each character into a list or array.
- The print statement in Python does not require `System.out.println`, and can be made more readable using the `format` method for strings.
- The `main` function is wrapped in a "main guard" (`if __name__ == "__main__"`) to ensure that it's executed only if the script is run directly (not imported as a module).
