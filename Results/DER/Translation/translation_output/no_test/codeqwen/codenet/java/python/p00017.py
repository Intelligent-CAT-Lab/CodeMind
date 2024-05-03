Here is the Python equivalent of the Java code:

```python
import re

def compute():
    while True:
        S = input()
        if not S:
            break
        for i in range(26):
            converted = ""
            for c in S:
                if 'a' <= c <= 'z':
                    converted += chr((ord(c) - ord('a') + i) % 26 + ord('a'))
                else:
                    converted += c
            if re.search(r'\b(the|this|that)\b', converted):
                print(converted)
                break

compute()
```

This Python code does the same thing as the Java code: it reads a string from the user, shifts each letter in the string by a certain number of places (in this case, 1), and checks if the resulting string contains the words "the", "this", or "that". If it does, it prints the string and breaks out of the loop. If it doesn't find any of the words after checking all possible shifts, it just breaks out of the loop without printing anything.
