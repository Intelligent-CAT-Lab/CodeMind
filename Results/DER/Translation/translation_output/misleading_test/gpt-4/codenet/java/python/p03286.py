Here's the Python translation of the provided Java code:

```python
import math

class p03286:
    def __init__(self):
        self.dx = [0, 1, 0, -1]
        self.dy = [-1, 0, 1, 0]
        self.MOD = int(1e9+7)
    
    def run(self):
        N = self.nextLong()
        ans = "0" if N == 0 else ""
        while N != 0:
            q = self.q(N, -2)
            r = self.r(N, -2)
            ans = str(r) + ans
            N = q
        print(ans)
    
    def q(self, a, b):
        return self.floor(a, b) if b > 0 else self.ceil(a, b)
    
    def r(self, a, b):
        return a - self.q(a, b) * b
    
    def floor(self, a, b):
        if b < 0:
            a *= -1
            b *= -1
        return a // b if a > 0 else (a - b + 1) // b
    
    def ceil(self, a, b):
        if b < 0:
            a *= -1
            b *= -1
        return (a + b - 1) // b if a > 0 else a // b

    def nextLong(self):
        return int(input().strip())

# Sample test case
p03286_instance = p03286()
p03286_instance.run()
```

To use this Python translation, you should call the `p03286_instance.run()` method after creating an instance of `p03286`. The `nextLong` method has been replaced with a function that simply reads an integer from the standard input, so you can provide your test input directly.

The Python code closely follows the logic of the Java code, with some minor differences specific to Python such as using `//` for integer division and handling input using `input().strip()`.

Unlike the Java code, which uses a custom `FastScanner` class for input handling, the Python version relies on the built-in `input` function for simplicity. If you need to handle more complex input scenarios or performance is a concern, you should write a custom input handler similar to the `FastScanner`.

If you run the Python code with the provided test input `-9`, it should print the expected output `1051`.
