Here is the Python equivalent of the Java code:

```python
import re

while True:
    try:
        str = input()
        str = str.replace('.', ',')
        str = str.replace(',', ' ')
        tokens = str.split()
        count = 0

        for token in tokens:
            n = len(token)

            if 3 <= n <= 6:
                if count > 0:
                    print(' ', end='')
                print(token[:n], end='')
                count += 1

        if count > 0:
            print()
    except EOFError:
        break
```

This Python code does the same thing as the Java code. It reads a line of input from the user, replaces all periods with commas, replaces all commas with spaces, and then splits the string into tokens. It then iterates over each token, checking if its length is between 3 and 6. If it is, it prints the token (up to its length) and increments a counter. After printing all the tokens that meet the criteria, it prints a newline if any were printed. The loop continues until an EOFError is raised, which occurs when the user inputs an EOF (like pressing Ctrl+D in Unix or Ctrl+Z and Enter in Windows).
