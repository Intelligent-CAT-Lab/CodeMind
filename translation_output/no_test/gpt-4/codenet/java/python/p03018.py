Here's the Python version of the Java code provided. This translation assumes Python 3.x and makes use of Python's standard `input()` for reading input data.

```python
import sys
import io

class FastScanner:
    def __init__(self):
        self.stdin = io.BytesIO(sys.stdin.buffer.read())
    
    def next(self):
        return self.stdin.readline().decode().strip()

def p(element):
    print(element)

def pp(element):
    print(element, end="")

def min_of_three(a, b, c):
    return min(min(a, b), c)

def max_of_three(a, b, c):
    return max(max(a, b), c)

if __name__ == "__main__":
    sc = FastScanner()
    str = sc.next()
    str = str.replace("BC", "X")
    a = 0
    ans = 0
    for i in reversed(range(len(str))):
        c = str[i]
        if c == 'X':
            a += 1
        elif c == 'A':
            ans += a
        else:
            a = 0
    p(ans)
```

Please note that this Python code uses `sys.stdin.buffer.read()` and `io.BytesIO` for the `FastScanner` class to mimic the functionality in Java where the input stream is buffered. However, this setup is quite atypical in Python, where `input()` is normally sufficient for competitive programming. 

Also, this version does not translate the exact behavior of the Java `FastScanner`, which is more complex and can handle different types of data than just strings. If you only needed to read strings from stdin, the `input()` function in Python would be enough.
