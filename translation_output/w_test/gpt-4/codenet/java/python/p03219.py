Here's the Python translation of the given Java program:

```python
import sys
import bisect
import math

def main():
    x, y = map(int, input().split())
    put(x + y // 2)

def upper_bound(a, val):
    return bisect.bisect_right(a, val)

def lower_bound(a, val):
    return bisect.bisect_left(a, val)

def max(a, b):
    return max(a, b)

def min(a, b):
    return min(a, b)

def abs(a):
    return abs(a)

def print_it(object):
    print(object, end='')

def put(object=""):
    print(object)

def format_it(string, *args):
    return string.format(*args)

class FixedPair:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def get_x(self):
        return self.x

    def get_y(self):
        return self.y

    def __hash__(self):
        return hash((self.x, self.y))

    def __eq__(self, other):
        if not isinstance(other, FixedPair):
            return False
        return self.x == other.x and self.y == other.y

    def __str__(self):
        return "({}, {})".format(self.x, self.y)

class Tuple:
    def __init__(self, t, v):
        self.t = t
        self.v = v

    def get_t(self):
        return self.t

    def get_v(self):
        return self.v

    def __hash__(self):
        return hash((self.t, self.v))

    def __eq__(self, other):
        if not isinstance(other, Tuple):
            return False
        return self.t == other.t and self.v == other.v

    def __str__(self):
        return "<Tuple>=<{0},{1}>".format(self.t, self.v)

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a
    
def lcm(a, b):
    return a // gcd(a, b) * b

def kaijo_mod(n, mod):
    if n < 1:
        return -1
    result = 1
    for i in range(n, 1, -1):
        result = (result * i) % mod
    return result

def count_sortable(iterable):
    sorted_iterable = sorted(iterable)
    result = {}
    l = 0
    len_iterable = len(sorted_iterable)
    while l < len_iterable:
        r = l
        while r < len_iterable - 1 and sorted_iterable[r] == sorted_iterable[r + 1]:
            r += 1
        result[sorted_iterable[l]] = r - l + 1
        l = r + 1
    return result

def count_array(array):
    sorted_array = sorted(array)
    result = {}
    l = 0
    len_array = len(array)
    while l < len_array:
        r = l
        while r < len_array - 1 and sorted_array[r] == sorted_array[r + 1]:
            r += 1
        result[sorted_array[l]] = r - l + 1
        l = r + 1
    return result

def toStringBWS(iterable):
    return ' '.join(str(x) for x in iterable)

if __name__ == "__main__":
    main()
```

Please note:
1. Java code has a custom `Scanner` class which we don't need in Python because of the built-in `input()` function.
2. Some functions in the Java code are not necessary since Python already has built-in functions (`max`, `min`, `abs`) or modules (`bisect`) which achieve the same functionality.
3. The `FixedPair` and `Tuple` classes are translated to keep the structure the same.
4. I renamed some methods (like `print` and `format`) to avoid conflict with Python's built-in functions.
5. Some of the imported Java classes in the original code snippet are not used in the translation, as their functionality is either built into Python or not applicable.
