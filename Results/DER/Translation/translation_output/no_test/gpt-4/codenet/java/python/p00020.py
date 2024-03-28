The Java code you provided reads lines from the standard input and converts all lowercase letters to uppercase, then prints the transformed lines to the standard output. Below is the equivalent Python code using Python's built-in functions:

```python
import sys

for s in sys.stdin:
    s = s.rstrip()  # Remove trailing newline
    t = ""
    for c in s:
        if 'a' <= c <= 'z':  # Check if c is a lowercase letter
            t += chr(ord(c) - 32)
        else:
            t += c
    print(t)
```

A couple of things to note in this translation:
1. The `sys.stdin` object in Python is used to read lines from the standard input, similar to `BufferedReader` in Java.
2. Instead of using `charAt()` to get a character at a specific position, Python allows direct iteration over the string.
3. The `if 'a' <= c <= 'z'` condition checks if the character `c` is a lowercase letter.
4. The `ord` function in Python gets the ASCII (or Unicode) value of a character, and `chr` converts an ASCII (or Unicode) value back to a character.
5. Python strings are immutable, so we can't modify them in place. Instead, we build a new string `t` with uppercase letters.
