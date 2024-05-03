Here is the Python equivalent of the Java code:

```python
import math

def solve(inp, out, ms):
    a, b = map(float, inp.readline().split())
    out.write(str(4.0/3.0*math.pi*b*b*b) + '\n')

if __name__ == "__main__":
    inp = open(0)
    out = open(1, 'w')
    ms = Methods()
    solve(inp, out, ms)
    inp.close()
    out.close()

class Methods:
    def print(self, *args):
        print(*args)

    def max(self, *args):
        return max(*args)

    def min(self, *args):
        return min(*args)

    def gcd(self, a, b):
        if b == 0:
            return a
        else:
            return self.gcd(b, a % b)

    def lcm(self, a, b):
        return a // self.gcd(a, b) * b

    def factorial(self, i):
        if i == 1:
            return 1
        else:
            return i * self.factorial(i - 1)

    def manhat(self, x1, y1, x2, y2):
        return abs(x1 - x2) + abs(y1 - y2)

    def euclid(self, x1, y1, x2, y2):
        return math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)

    def isPrime(self, n):
        if n == 2:
            return True
        if n < 2 or n % 2 == 0:
            return False
        for i in range(3, int(math.sqrt(n)) + 1, 2):
            if n % i == 0:
                return False
        return True
```

Please note that in Python, we don't have a built-in `FastScanner` class like in Java. Instead, we
