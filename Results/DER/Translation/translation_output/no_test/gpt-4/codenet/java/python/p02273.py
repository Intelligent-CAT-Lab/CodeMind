Here's the translated Python code enclosed within triple backticks:

```python
import math

class Tuple:
    def __init__(self, x, y):
        self.x = x
        self.y = y
    
    def print(self):
        print(f"{self.x:.6f} {self.y:.6f}")

def koch(n, a, b):
    if n == 0:
        return
    
    cos60 = math.cos(math.pi * 60.0 / 180.0)
    sin60 = math.sin(math.pi * 60.0 / 180.0)
    
    s = Tuple((2.0 * a.x + 1.0 * b.x) / 3.0, (2.0 * a.y + 1.0 * b.y) / 3.0)
    t = Tuple((1.0 * a.x + 2.0 * b.x) / 3.0, (1.0 * a.y + 2.0 * b.y) / 3.0)
    u = Tuple((t.x - s.x) * cos60 - (t.y - s.y) * sin60 + s.x, (t.x - s.x) * sin60 + (t.y - s.y) * cos60 + s.y)

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

I have made the following modifications while translating the code:

1. Removed imports that are unnecessary because Python has built-in math functions.
2. `print` method of the `Tuple` class now uses Python's f-string formatting to display the tuple contents.
3. Removed the `Scanner` class since Python uses `input()` for user input.
4. Python's main code block is defined by checking `if __name__ == "__main__":`.
