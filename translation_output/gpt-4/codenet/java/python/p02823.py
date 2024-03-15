Here is the translated code from Java to Python:

```python
import sys
from functools import reduce

class In:
    def next(self):
        return sys.stdin.readline().strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next()) # long in Python 3 is just int

    def next_char_array(self, n, m):
        return [list(self.next()) for _ in range(n)]

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_int_array_op(self, n, op):
        return [op(self.next_int()) for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

    def next_long_array_op(self, n, op):
        return [op(self.next_long()) for _ in range(n)]

class Out:
    @staticmethod
    def println(*args):
        print(*args)

    @staticmethod
    def flush():
        sys.stdout.flush()

class p02823:
    mod = 1000000007
    inf = 0xfffffffffffffff

    def solve(self):
        in_ = In()
        out = Out()
        n = in_.next_long()
        a = in_.next_long()
        b = in_.next_long()

        if a > b:
            a, b = b, a
        
        if (b - a) % 2 == 1:
            ans1 = a - 1 + (b - a + 1) // 2
            a = n - a + 1
            b = n - b + 1

            if a > b:
                a, b = b, a
            
            ans2 = a - 1 + (b - a + 1) // 2
            out.println(min(ans1, ans2))
        else:
            out.println((b - a) // 2)

if __name__ == "__main__":
    solver = p02823()
    solver.solve()
    Out.flush()
```

Some notable changes and reasons for them:

1. Removed all the Java-specific imports and translated them to Python equivalents (sys module for stdin and stdout operations). Python doesn't use `BufferedReader`, `InputStreamReader`, and `StringTokenizer` like Java does for I/O operations.
2. Replaced the `In` class functions with Python equivalents for reading from the standard input. Also, removed type-specific functions since Python variables are not statically typed.
3. Adapted the `Out` class to use Python's `print` function for output.
4. Transformed the class methods and fields to be instance-based or static since Python doesn't support static local functions or variables by default.
5. Removed the `Math.min` call and replaced it with the built-in `min` function in Python.
6. Changed the `main` method to follow Python's standard `if __name__ == "__main__":` idiom for entry point.
7. Simplified array creation and processing to make use of list comprehensions and straightforward loops since Python does not use arrays in the same way Java does.
8. Removed the use of the `Function` interfaces (`IntUnaryOperator`, `LongUnaryOperator`) and the related methods, as Python uses first-class functions and can directly pass the operation as an argument.
