Here's the converted code from Java to Python:

```python
import sys

class p01905:
    def __init__(self):
        self.N, self.M = 0, 0
        self.a = []

    def solve(self):
        self.N = self.next_int()
        self.M = self.next_int()

        self.a = [self.next_int() for _ in range(self.M)]

        b = [True] * (self.N * 2 - 1)
        for i in range(self.M):
            b[self.a[i] + self.N - 1] = False
        
        for i in range(self.N * 2 - 2, 0, -2):
            if b[i] and b[i - 1]:
                b[(i - 2) // 2] = True
            elif b[i] or b[i - 1]:
                b[(i - 2) // 2] = True
            else:
                b[(i - 2) // 2] = False

        ans = sum(1 for i in range(self.N - 1) if b[i * 2 + 1] and b[i * 2 + 2])

        print(ans)

    def next_token(self):
        return input().split()

    def next_int(self):
        return int(next(self.token_gen))

    def main(self):
        self.token_gen = iter(self.next_token())
        self.solve()

if __name__ == '__main__':
    p01905().main()
```

I replaced the input system with Python's `input()` function and assumed that input will be provided via standard input. The print statements are used to output the result. A generator-based approach (`self.token_gen`) is used to produce the next token on each call to `next_int`, which now reads the next value from the generator.

Please note that the behavior and exception handling of functions like `nextInt()` in Java have been simplified, as Python's `int()` constructor will throw a `ValueError` if the conversion cannot be performed.

Additionally, due to differences between Java and Python such as garbage collection and exception handling, some methods from the original Java code are removed or simplified in the Python version, especially in regards to input reading, because Python's built-in `input()` function is more convenient for such purposes.

Lastly, in Python, it is common to use `if __name__ == '__main__':` to make sure that code isn't run when the module is imported, but only when it is executed as the main program.

