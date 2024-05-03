Here is the Python equivalent of the Java code:

```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    c = round(b * 100)
    d = a * c
    print(d // 100)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, rounds the second integer to the nearest hundred, multiplies the first integer by the rounded second integer, and then prints the result after dividing by 100. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java.
