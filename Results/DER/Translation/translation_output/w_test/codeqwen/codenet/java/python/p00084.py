Here is the Python equivalent of the Java code:

```python
import re

while True:
    try:
        str = input()
        str = str.replace('.', ',')
        str = str.replace(',', ' ')
        tokens = str.split(" ")
        count = 0

        for token in tokens:
            n = len(token)

            if 3 <= n <= 6:
                if count > 0:
                    print(" ", end="")
                print(token[:n], end="")
                count += 1

        if count > 0:
            print()
    except EOFError:
        break
```

This Python code does the same thing as the Java code. It reads a line of input, replaces the periods with commas, replaces the commas with spaces, splits the string into tokens, and then prints out the tokens that have a length between 3 and 6. The `end=""` argument in the `print` function is used to prevent a newline character from being added after each token. The `try` and `except` blocks are used to handle the end of file (EOF) error that occurs when the user inputs an empty line and then presses Ctrl+D.
