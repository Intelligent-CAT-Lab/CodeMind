Below is the translated Python code snippet for the given Java code:

```python
import sys

class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.stream = stream
        self.buffer = []
        self.ptr = 0

    def next(self):
        while True:
            if self.ptr == len(self.buffer):
                self.buffer = self.stream.readline().split()
                self.ptr = 0
                if not self.buffer:
                    raise ValueError("No more input.")
            token = self.buffer[self.ptr]
            self.ptr += 1
            if token:
                return token

def fact(n):
    if n == 1 or n == 0:
        return 1
    else:
        return n * fact(n - 1)

def lower_bound(x, y):
    left, right = 0, len(x)
    while left < right:
        mid = (left + right) // 2
        if x[mid] < y:
            left = mid + 1
        else:
            right = mid
    return left

def upper_bound(x, y):
    left, right = 0, len(x)
    while left < right:
        mid = (left + right) // 2
        if x[mid] <= y:
            left = mid + 1
        else:
            right = mid
    return left

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(m, n):
    return m * n // gcd(m, n)

def is_prime(n):
    if n < 2:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    
    i = 3
    while i * i <= n:
        if n % i == 0:
            return False
        i += 2
    return True

def main():
    sc = FastScanner()
    s = sc.next()
    t = ""
    for char in s:
        if char != 'B':
            t += char
        elif t:
            t = t[:-1]

    print(t)

if __name__ == "__main__":
    main()
```

Some important notes about the differences between Java and Python which are reflected in this translation:

1. In Python, the `FastScanner` class reads from standard input using `sys.stdin` by default. The method `next()` is created to mimic the `next()` function from the Java version.

2. In Python, constructors are defined with the `__init__` method.

3. Python strings are immutable; string concatenation creates a new string rather than altering the original, which can lead to inefficient code when used in a loop. For large strings or performance-critical code, Python programmers typically use `str.join()` or list comprehension.

4. Python does not have built-in lower bound and upper bound functions. However, the `bisect` module can provide similar functionality with `bisect_left` and `bisect_right` functions.

5. The `gcd` function is available in the `math` module in Python as of version 3.5+, but here we've replicated it using Euclid's algorithm.

6. For simplicity and to stay true to the functionality of the Java code, additional error handling, especially pertaining to I/O, has been omitted.
