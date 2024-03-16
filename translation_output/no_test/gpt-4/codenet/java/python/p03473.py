Here's the translated code from Java to Python:

```python
import sys

MASK = [1, 2, 4]

def main():
    M = int(sys.stdin.readline())
    result = (24 - M) + 24
    print(result)

if __name__ == "__main__":
    main()
```

This Python code retains the functionality of the code in Java: it reads an integer from standard input and then computes and prints the calculated result. Note that Python does not require an explicit encoding to read from `sys.stdin` as Python 3 defaults to UTF-8. Also, Python doesn't usually handle exceptions for reading from standard input in simple scripts like this, so I omitted the `throws IOException` part.
