Here is the Python equivalent of the Java code:

```python
import re

def main():
    str = input()
    if re.match("[A-Z]", str):
        print("A")
    else:
        print("a")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, checks if the string is an uppercase letter using regular expressions, and prints "A" if it is, or "a" if it isn't.
