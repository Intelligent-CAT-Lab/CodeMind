Below is the translated Python code for the given Java code:

```python
import sys

class FastReader:
    def __init__(self):
        self.input_stream = sys.stdin

    def _read_line(self):
        return self.input_stream.readline()

    def next_token(self):
        while True:
            self.tokens = list(input().split())
            if self.tokens:
                break

    def next_int(self):
        if not hasattr(self, 'tokens') or not self.tokens:
            self.next_token()
        return int(self.tokens.pop(0))

def codeforces_669_a():
    fr = FastReader()
    n = fr.next_int()
    total = 0
    if n == 2:
        print(1)
        return
    while n > 0:
        n -= 1
        if n > 0:
            if n >= 2:
                total += 1
            n -= 2
        total += 1
    print(total)

if __name__ == "__main__":
    codeforces_669_a()
```

This Python code mimics the functionality of the Java code while following Python's conventions and idioms. The `codeforces_669_a` is equivalent to Java's `codeforces_669_A` main method, and `FastReader` class reads input token by token, similar to the original Java class. The `FastReader` reads from the standard input and provides methods to read integers as needed. The `codeforces_669_a` function computes the value of `total` following the same logic as the Java code and prints the result. 

Note that Python's print function replaces Java's `System.out.println()` and the `if __name__ == "__main__":` guard is used to ensure that the code only runs when the script is executed directly, not when imported as a module.
