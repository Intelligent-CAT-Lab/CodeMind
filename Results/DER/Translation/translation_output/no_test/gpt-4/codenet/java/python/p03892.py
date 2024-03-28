Here's the translated Python code:

```python
import sys
import io
import atexit

buffer = io.BytesIO()
sys.stdout = buffer

@atexit.register
def write():
    sys.__stdout__.write(buffer.getvalue().decode("utf-8"))


def gcd(a, b):
    while b:
        a, b = b, a % b
    return a


def solve():
    a = ni()
    b = ni()
    a = abs(ni() - a)
    b = abs(ni() - b)
    g = gcd(a, b)
    ans = a // g + b // g - 1
    print(ans * g)


def lower_bound(lst, key):
    lower = -1
    upper = len(lst)
    while upper - lower > 1:
        center = (upper + lower) // 2
        if lst[center] >= key:
            upper = center
        else:
            lower = center
    return upper


def upper_bound(lst, key):
    lower = -1
    upper = len(lst)
    while upper - lower > 1:
        center = (upper + lower) // 2
        if lst[center] > key:
            upper = center
        else:
            lower = center
    return upper


def next_permutation(lst):
    def swap(i, j):
        lst[i], lst[j] = lst[j], lst[i]
    
    i = len(lst) - 2
    while i >= 0 and lst[i] >= lst[i + 1]:
        i -= 1
    if i < 0:
        return False
    j = len(lst) - 1
    while lst[i] >= lst[j]:
        j -= 1
    swap(i, j)
    i += 1
    j = len(lst) - 1
    while i < j:
        swap(i, j)
        i += 1
        j -= 1
    return True


def inrange(y, x, h, w):
    return 0 <= y < h and 0 <= x < w


def ni():
    return int(ns())


def nl():
    return int(ns())


def ns():
    return sys.stdin.readline().strip()


def nia(n):
    return [ni() for _ in range(n)]


def nla(n):
    return [nl() for _ in range(n)]


if __name__ == "__main__":
    solve()
```

I've translated the Java main logic into Python, but I've omitted some parts like the stream and byte buffer reading logic, as Python has different mechanisms for I/O. Instead, I use standard input/output directly.

The Java code has some container manipulation functions (`lower_bound`, `upper_bound`, and `next_permutation`) that are similar in functionality to what can be found in the Python `bisect` module and the `itertools` module for `next_permutation`. However, to keep consistent with the translation, I've manually translated those functions into Python as well.

The `solve` function captures the core logic of the problem. It assumes that the input is provided in a format that matches the expected input in the Java code.

Remember that Python uses 0-based indexing, while Java uses 1-based indexing for containers (lists, arrays, etc.), so adjustments have to be made when translating. In this case, however, the algorithm does not use such features, so no direct adjustment is needed.

Please note that Python’s standard input methods are blocking, and for competitive programming, it might be necessary to use faster I/O methods. The `sys.stdin.readline()` in Python is typically faster than `input()`, but if further speed is needed, you might consider using the `sys.stdin` directly attached with a buffer as the original Java code does. However, care should be taken with this approach for encoding and buffer flushing to ensure proper behavior.
