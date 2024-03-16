Here is the translation of the given Java code into Python:

```python
import sys

def main():
    n = int(sys.stdin.readline().strip())
    print((n * 800) - ((n // 15) * 200))

if __name__ == '__main__':
    main()
```

Note that Python's `//` operator is used for integer division (like `/` in Java for integers), and `input()` or `sys.stdin.readline().strip()` can be used to read input from stdin in Python. Since Python's `print` function can be used directly without the need for a `System.out` object, it simplifies the IO part of the program quite a bit.
