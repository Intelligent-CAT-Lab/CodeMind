Here's the translated Python code from the Java code you've provided:

```python
import math
import sys

EPS = 2e-8

class Point:
    def __init__(self, x, y):
        self.x, self.y = x, y
    
    def __sub__(self, other):
        return Point(self.x - other.x, self.y - other.y)
    
    def __add__(self, other):
        return Point(self.x + other.x, self.y + other.y)
    
    def multiply(self, scalar):
        return Point(self.x * scalar, self.y * scalar)
    
    def det(self, other):
        return self.x * other.y - self.y * other.x


def line_intersection(p1, p2, q1, q2):
    a = (q2 - q1).det(q1 - p1)
    b = (q2 - q1).det(p2 - p1)
    return p1 + (p2 - p1).multiply(a / b)

def solve(N, K):
    a = Point(1.0, 0.0)
    b = Point(math.cos(math.pi * 2 / N), math.sin(math.pi * 2 / N))
    pa = Point(math.cos(math.pi * 2 / N * K), math.sin(math.pi * 2 / N * K))
    pb = Point(math.cos(math.pi * 2 / N * (1 - K)), math.sin(math.pi * 2 / N * (1 - K)))

    intersection = line_intersection(a, pa, b, pb)
    ai = a - intersection
    bi = b - intersection
    S = abs(ai.det(bi)) / 2
    convex = abs(a.det(b)) / 2 * N
    
    return convex - S * N

def main():
    input_line = sys.stdin.readline().strip()
    N, K = map(int, input_line.split())
    result = solve(N, K)
    print(f"{result:.8f}")

if __name__ == "__main__":
    main()
```

Test the script with the input by providing it through the standard input. The expected output for the input '5 2' should be 1.12256994. You can run the script and then enter input values manually, or you can pipe in input values using echo or a text file in a Unix-like command-line environment.

The translated Python script differs from the Java one in structure and syntax, as Java and Python each have their own idiomatic ways of writing code. The classes and methods have been replaced with Python-specific constructs. For example, in Java, there's a scanner class for input, but in Python, we often use the `input()` function or `sys.stdin` directly for reading from standard input. Similarly, the Java `PrintWriter` used for output has been replaced with a simple `print` statement in Python, formatted to match the specified floating point precision.
