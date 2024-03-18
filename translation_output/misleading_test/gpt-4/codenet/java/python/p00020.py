Sure, here is the translated code from Java to Python:

```python
import sys

def main():
    for line in sys.stdin:
        t = ""
        for c in line.strip():
            if ord('a') <= ord(c) <= ord('z'):
                t += chr(ord(c) - 32)
            else:
                t += c
        print(t)

if __name__ == '__main__':
    main()
```

In Python, we use the `sys.stdin` to read from standard input. This code reads every line until the end of the input. For each character in the line, if it is a lowercase letter (between 'a' and 'z'), it converts it to uppercase by subtracting 32 from its ASCII value (since the difference between the ASCII values of 'a' and 'A' is 32). Otherwise, it leaves the character as is. Then, it prints the converted line. Note that the `strip()` function is used to remove the newline character from the end of the input line.
