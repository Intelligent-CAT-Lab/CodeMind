Here is the equivalent Python code for the provided Java example:

```python
import math


class Tuple:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def print(self):
        print(f"{self.x:.8f} {self.y:.8f}")


def koch(n, a, b):
    if n == 0:
        return

    cos60 = math.cos(math.pi * 60.0 / 180.0)
    sin60 = math.sin(math.pi * 60.0 / 180.0)
    s = Tuple((2.0 * a.x + 1.0 * b.x) / 3.0, (2.0 * a.y + 1.0 * b.y) / 3.0)
    t = Tuple((1.0 * a.x + 2.0 * b.x) / 3.0, (1.0 * a.y + 2.0 * b.y) / 3.0)
    u = Tuple((t.x - s.x) * cos60 - (t.y - s.y) * sin60 + s.x,
              (t.x - s.x) * sin60 + (t.y - s.y) * cos60 + s.y)

    koch(n - 1, a, s)
    s.print()
    koch(n - 1, s, u)
    u.print()
    koch(n - 1, u, t)
    t.print()
    koch(n - 1, t, b)


def main():
    n = int(input())
    a = Tuple(0.0, 0.0)
    b = Tuple(100.0, 0.0)

    a.print()
    koch(n, a, b)
    b.print()


if __name__ == "__main__":
    main()
```

I have kept the structure of the code similar to the Java version. Note that in Python we use `print` instead of `System.out.printf`, and that the formatting of floating-point numbers uses the Python f-string formatting syntax. The mathematical functions come from the `math` module, which is imported at the beginning. The class `Tuple` and its methods translate quite directly from Java to Python, and the recursion inside the `koch` function is identical in logic to the Java version.
