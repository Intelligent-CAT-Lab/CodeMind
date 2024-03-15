Here's the translated Python code:

```python
import sys

class Methods:

    def print(self, *ar):
        print(ar)

    def yesno(self, out, b):
        out.write("Yes\n" if b else "No\n")

    def YESNO(self, out, b):
        out.write("YES\n" if b else "NO\n")

    def max(self, *ar):
        return max(ar)

    def min(self, *ar):
        return min(ar)


class p02430:

    def solve(self, in_, out, ms):

        n, k = map(int, in_.split())

        for bit in range(1 << n):
            if bin(bit).count('1') != k:
                continue
            out.write(f"{bit}:")
            for j in range(n):
                if ((bit >> j) & 1) == 1:
                    out.write(f" {j}")
            out.write('\n')


if __name__ == "__main__":
    main = p02430()
    in_ = sys.stdin.readline
    out = sys.stdout
    ms = Methods()
    main.solve(in_, out, ms)
    out.flush()
```

Note that in this translation:

- We've omitted the `FastScanner` class, which is a utility for fast input in Java. In Python, this is not needed as built-in functions like `input()` and `sys.stdin.readline()` are used for input operations and are typically fast enough.
- We use `sys.stdin.readline` to read lines of input and `sys.stdout` to print output directly.
- We've replaced the Java `PrintWriter` class functionality with `sys.stdout`. In Python, we can directly use the `write` method on `sys.stdout` to print without a newline and `print` function to print with a newline.
- Python has a built-in `bin()` function to convert a number to its binary representation, and `str.count()` can be used to count occurrences of a substring in a string (in this case, '1's in a binary number).
- Python provides built-in `max` and `min` functions, so no need to sort the array like in Java.
- In Java, bitwise operations like shifting are usually performed on integers; Python handles these operations similarly.
