Below is the converted Java code to Python 3:

```python
import math
import sys

class Methods:
    
    def print(self, *args):
        print(*args)

    def max(self, *args):
        return max(*args)

    def min(self, *args):
        return min(*args)

    def gcd(self, a, b):
        while b:
            a, b = b, a % b
        return a

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

    def is_prime(self, n):
        if n == 2:
            return True
        if n < 2 or n % 2 == 0:
            return False
        for i in range(3, int(math.sqrt(n)) + 1, 2):
            if n % i == 0:
                return False
        return True


def solve(a, b):
    volume = (4.0 / 3.0) * math.pi * b ** 3
    print(volume)


# Usage of sys.stdin and sys.stdout to simulate the behavior of FastScanner and PrintWriter in Java
if __name__ == "__main__":
    inputs = sys.stdin.readline().strip().split()
    a, b = map(float, inputs[:2])
    solve(a, b)
```

And here's how you might use it with test input in a file named `input.txt` containing `1 2` and execute it through the command line:

```bash
python script.py < input.txt
```

Please ensure that the input is formatted correctly when piping through standard input, and the output format matches that expected by the original Java code.

This Python script attempts to be as one-to-one as possible with the Java code provided and maintains the structure of methods inside the `Methods` class, even though typically you would use Python built-in functions or operators directly instead of method calls for operations like `max`, `min`, `gcd`, etc.
