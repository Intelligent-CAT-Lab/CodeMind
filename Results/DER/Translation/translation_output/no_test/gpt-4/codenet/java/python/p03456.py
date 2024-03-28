Below is the translated code from Java to Python:

```python
import math

class FastScanner:
    def __init__(self):
        self.tokens = []
    
    def read_tokens(self):
        line = input()
        self.tokens = line.split()
    
    def next(self):
        while not self.tokens:
            self.read_tokens()
        return self.tokens.pop(0)
    
    def next_int(self):
        return int(self.next())

    def read_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long(self):
        return int(self.next())

if __name__ == "__main__":
    sc = FastScanner()
    s = sc.next()
    t = sc.next()
    mah = s + t
    a = int(mah)
    b = int(math.sqrt(a))
    if b * b == a:
        print("Yes")
    else:
        print("No")
```

In this Python version, `FastScanner` is recreated as a class with methods for input scanning. Note that `nextline` method from Java class doesn't have a counterpart in this Python translation because it was not used and the method body was empty. Python's `input()` function reads a line from standard input, which is the equivalent to the `BufferedReader` functionality in Java. The `math` module is used to handle square root calculations. The Python program similarly concatenates strings `s` and `t`, converts it to an integer, and then checks if its square root is an integer by comparing it after squaring it back.

Remember that Python handles big integers natively, so there's no need to worry about integer overflows.
