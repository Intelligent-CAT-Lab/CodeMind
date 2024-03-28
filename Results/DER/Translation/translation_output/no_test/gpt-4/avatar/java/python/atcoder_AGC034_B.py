The given Java code can be translated to Python as follows:

```python
def solve(s):
    s = s.replace('BC', 'D')
    cnt = 0
    tmp = 0
    for char in s:
        if char == 'A':
            tmp += 1
        elif char == 'D':
            cnt += tmp
        else:
            tmp = 0
    return cnt

# Python equivalent of the main method and reading from stdin, printing to stdout
if __name__ == '__main__':
    s = input()
    result = solve(s)
    print(result)
```

In the Python code, I've encapsulated the logic inside a `solve` function which mirrors the `solve` method in the Java class. Furthermore, Python's built-in string methods are used to perform the replacement without needing to import additional modules. Reading from standard input and writing to standard output is done directly with `input()` and `print()` in Python, so no direct stream handling is necessary. The `__name__ == '__main__'` guard is used to execute the code block when the script is run directly.
