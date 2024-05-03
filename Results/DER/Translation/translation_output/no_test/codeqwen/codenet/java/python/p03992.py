Here is the Python equivalent of the Java code:

```python
import sys

X = sys.stdin.readline().strip()
sb = ""
for i in range(len(X)):
    if i == 4:
        sb += " " + X[i]
    else:
        sb += X[i]

print(sb)
```

This Python code does the same thing as the Java code: it reads a line from the standard input, inserts a space every 5th character, and then prints the resulting string.
