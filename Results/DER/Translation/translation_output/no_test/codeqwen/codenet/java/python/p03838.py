Here is the Python version of the Java code:

```python
import sys

class p03838:
    x, y = 0, 0

    def solve(self):
        self.x = self.nextInt()
        self.y = self.nextInt()

        if self.x >= 0:
            if self.y >= 0:
                if self.x > self.y:
                    if self.y == 0:
                        print(self.x - self.y + 1)
                    else:
                        print(self.x - self.y + 2)
                else:
                    print(self.y - self.x)
            else:
                print(abs(abs(self.y) - self.x) + 1)
        else:
            if self.y >= 0:
                if self.y == 0:
                    print(abs(abs(self.x) - self.y))
                else:
                    print(abs(abs(self.x) - self.y) + 1)
            else:
                if self.x > self.y:
                    print(self.x - self.y + 2)
                else:
                    print(self.y - self.x)

    def __init__(self):
        self.out = sys.stdout

    def nextInt(self):
        return int(self.next())

    def next(self):
        while True:
            ch = sys.stdin.read(1)
            if ch.isprintable():
                break
        return ch

p03838().solve()
```

Please note that Python does not have a built-in equivalent to Java's `System.in` and `System.out`, so I've used `sys.stdin` and `sys.stdout` instead. Also, Python does not have a built-in equivalent to Java's `NoSuchElementException`, so I've removed it from the code.
