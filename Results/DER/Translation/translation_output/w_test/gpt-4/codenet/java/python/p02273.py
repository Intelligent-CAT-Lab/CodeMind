Here's the translated Python code that performs the equivalent operations:

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
    # For simplicity, instead of using Scanner which is Java-specific,
    # we're using input() function in Python to read user input
    # and assuming the input is a single integer in a line.
    n = int(input())

    a = Tuple(0.0, 0.0)
    b = Tuple(100.0, 0.0)

    a.print()
    koch(n, a, b)
    b.print()

if __name__ == "__main__":
    main()
```

Now, to test the input of `1`, you would simply run this Python code and input `1` when prompted. The expected output would be:

```
0.00000000 0.00000000
33.33333333 0.00000000
50.00000000 28.86751346
66.66666667 0.00000000
100.00000000 0.00000000
```
