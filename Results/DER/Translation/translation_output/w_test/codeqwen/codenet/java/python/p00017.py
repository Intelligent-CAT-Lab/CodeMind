Here is the Python version of the Java code:

```python
import re

def compute():
    while True:
        S = input()
        if S == '':
            break
        for i in range(26):
            converted = ''
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

This Python code does the same thing as the Java code. It reads a line of input, then for each possible shift of the alphabet, it converts the line to the shifted version and checks if it contains the words "the", "this", or "that". If it does, it prints the shifted line and breaks out of the loop. If it doesn't find any matches after checking all possible shifts, it just breaks out of the loop and moves on to the next line of input.
