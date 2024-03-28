Here's the translated Python code:

```python
import sys
import io
import math
import bisect
import itertools

class p03219:
    @staticmethod
    def main():
        x = int(input())
        y = int(input())
        p03219.put(x + y // 2)

    @staticmethod
    def upper_bound(a, val):
        return bisect.bisect_right(a, val)

    @staticmethod
    def lower_bound(a, val):
        return bisect.bisect_left(a, val)

    @staticmethod
    def max(a, b):
        return max(a, b)

    @staticmethod
    def min(a, b):
        return min(a, b)

    @staticmethod
    def abs(a):
        return abs(a)

    @staticmethod
    def print(object):
        sys.stdout.write(str(object))

    @staticmethod
    def put(object=""):
        print(object)

    @staticmethod
    def format(string, *args):
        return string.format(*args)

class FixedPair:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def getX(self):
        return self.x

    def getY(self):
        return self.y

    def __hash__(self):
        return self.x + self.y

    def __eq__(self, other):
        if not isinstance(other, FixedPair):
            return False
        return self.x == other.x and self.y == other.y

    def __str__(self):
        return f"({self.x},{self.y})"

class Tuple:
    def __init__(self, t, v):
        self.t = t
        self.v = v

    def getT(self):
        return self.t

    def getV(self):
        return self.v

    def __hash__(self):
        return hash(self.t) + hash(self.v)

    def __eq__(self, other):
        if not isinstance(other, Tuple):
            return False
        return self.t == other.t and self.v == other.v

    def __str__(self):
        return f"<Tuple>=<{self.t},{self.v}>"

class Util:
    @staticmethod
    def gcd(a, b):
        while b:
            a, b = b, a % b
        return a

    @staticmethod
    def lcm(a, b):
        return a * b // Util.gcd(a, b)

    @staticmethod
    def kaijoMod(n, mod):
        if n < 1:
            return -1
        result = 1
        for i in range(n, 1, -1):
            result *= i
            result %= mod
        return result

    @staticmethod
    def count(lst):
        sorted_lst = sorted(lst)
        return {value: len(list(freq)) for value, freq in itertools.groupby(sorted_lst)}

    @staticmethod
    def toStringBWS(iterable):
        return ' '.join(str(x) for x in iterable)

    @staticmethod
    def toStringBWS(array):
        return ' '.join(str(x) for x in array)

# Entry point
if __name__ == "__main__":
    p03219.main()
```

Please note the following during the translation:

1. Java `Scanner` is substituted with Python's built-in functions like `input()`.
2. `ArrayList` and other Java collections don't translate directly to Python, so they have been substituted with Python equivalents such as lists and dictionaries.
3. For `upper_bound` and `lower_bound`, I have used Python's built-in `bisect` module.
4. Methods from `Math` class, have been substituted with Python's built-in functions.
5. Equality and hashing in custom objects have been appropriately defined with `__eq__` and `__hash__`.
6. I've created `Util` class methods as static methods, and you'll need to call them with `Util.method_name()`.
7. I removed the unused imports for simplicity.
8. Java's stream mechanics are not directly translatable to Python, so they have been omitted.
9. Finally, I used more idiomatic Python string formatting with f-strings.

Keep in mind that Python does not compile classes with methods as entry points (like `main`). You should call the `main` method of the `p03219` class after it's defined. The last code block ensures that the script behaves similarly to the Java version when executed as a script.
