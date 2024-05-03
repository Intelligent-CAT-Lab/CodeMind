Here is the Python equivalent of the Java code:

```python
import sys

def main():
    s = input()
    chars = set(s.split())
    if len(chars) == 2:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, splits it into words, and adds them to a set. If the size of the set is 2, it prints "Yes", otherwise it prints "No". The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
