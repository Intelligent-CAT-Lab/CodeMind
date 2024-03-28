Below is the translated code from Java to Python. The code reads a line of input from the user, converts all lowercase letters to uppercase, and prints the result.

```python
while True:
    try:
        s = input()
        t = ""
        for c in s:
            t += c.upper()
        print(t)
    except EOFError:  # To handle the end of input
        break
```

This Python code will have the same behavior as the given Java code, reading from standard input until there's no more input (e.g., EOF is reached). Note that the `except EOFError` block is to handle the situation where the input stream is closed, which is how you typically signal the end of input in a console application.
