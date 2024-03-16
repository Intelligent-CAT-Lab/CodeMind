Here is the equivalent code in Python:

```python
import sys

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = []
    
    def next(self):
        while not self.buffer:
            self.buffer = input().split()
        return self.buffer.pop(0)
    
    def next_int(self):
        return int(self.next())
    
    def next_long(self):
        return int(self.next())

def main():
    sc = FastScanner(sys.stdin)
    n = sc.next_long()
    a = sc.next_long()
    b = sc.next_long()
    ans = (n // (a + b)) * a + min(a, n % (a + b))
    print(ans)

if __name__ == "__main__":
    main()
```

Let's run through the changes:

- Python does not require explicit import statements for built-in functionalities like `sys` for reading from `stdin`.
- Unlike Java, Python classes and methods do not need to be tagged with public/private/protected. All members in a Python class are public by default.
- The class name has been changed from `p02754` to `main` to suit Python's conventions.
- Python uses indentation blocks rather than braces `{}` to define class and function bodies.
- `FastScanner` has been adapted to work with Python's standard input function `input()`, and the class is storing tokens in a `buffer` list.
- `nextInt()` and `nextLong()` methods from the Java scanner have been replaced with the corresponding Python methods `next_int()` and `next_long()`, which internally call the `next()` method.
- Instead of `System.out.println`, Python uses the built-in `print` function.
- There's no need for an explicit `toString` conversion in Python. When the `next()` method retrieves the next token, it's directly converted to an `int` with `int(self.next())` in `next_int()` and `next_long()`.
- Python uses `//` for integer division (which is what `/` does in Java).

Remember to run this Python program with Python 3, as Python 2 may not work correctly with this code.
