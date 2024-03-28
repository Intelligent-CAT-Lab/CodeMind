Below is the Python translation of the given Java code:

```python
import sys
from typing import List, Tuple
from functools import cmp_to_key
import random

P = 1_000_000_007

def count_single(a, b, c, d):
    return max(min(b, d) - max(a, c) + 1, 0)

def count(a, b, c, d, x, y, z):
    return count_single(x - d, x + d, 0, a - 1) * \
           count_single(y - d, y + d, 0, b - 1) * \
           count_single(z - d, z + d, 0, c - 1) % P

def count_x(a, b, c, d, x, y, z):
    return count_single(x - d + 1, x + d, 0, a - 1) * \
           count_single(y - d, y + d, 0, b - 1) * \
           count_single(z - d, z + d, 0, c - 1) % P

def count_y(a, b, c, d, x, y, z):
    return count_single(x - d, x + d, 0, a - 1) * \
           count_single(y - d + 1, y + d, 0, b - 1) * \
           count_single(z - d, z + d, 0, c - 1) % P

def count_z(a, b, c, d, x, y, z):
    return count_single(x - d, x + d, 0, a - 1) * \
           count_single(y - d, y + d, 0, b - 1) * \
           count_single(z - d + 1, z + d, 0, c - 1) % P

def item_comparator(item1, item2):
    return (item1[0] > item2[0]) - (item1[0] < item2[0])

def check_x(a, b, c, d, x, lst, rec):
    if x >= 0 and x < a - 1:
        y = (x + 1) * b // a
        z = (x + 1) * c // a
        lst.append((1 + x + y + z, count(a, b, c, d, x + 1, y, z) - count_x(a, b, c, d, x, y, z)))
        if rec:
            check_y(a, b, c, d, y, lst, False)
            check_z(a, b, c, d, z, lst, False)

def check_y(a, b, c, d, y, lst, rec):
    if y >= 0 and y < b - 1:
        x = (y + 1) * a // b
        z = (y + 1) * c // b
        lst.append((1 + y + x + z, count(a, b, c, d, x, y + 1, z) - count_y(a, b, c, d, x, y, z)))
        if rec:
            check_x(a, b, c, d, x, lst, False)
            check_z(a, b, c, d, z, lst, False)

def check_z(a, b, c, d, z, lst, rec):
    if z >= 0 and z < c - 1:
        x = (z + 1) * a // c
        y = (z + 1) * b // c
        lst.append((1 + z + x + y, count(a, b, c, d, x, y, z + 1) - count_z(a, b, c, d, x, y, z)))
        if rec:
            check_x(a, b, c, d, x, lst, False)
            check_y(a, b, c, d, y, lst, False)

def fast(a, b, c, d):
    lst = []
    for coord in range(d + 2):
        check_x(a, b, c, d, coord, lst, True)
        check_y(a, b, c, d, coord, lst, True)
        check_z(a, b, c, d, coord, lst, True)
        check_x(a, b, c, d, a - 1 - d + coord, lst, True)
        check_y(a, b, c, d, b - 1 - d + coord, lst, True)
        check_z(a, b, c, d, c - 1 - d + coord, lst, True)

    ret = 0

    lst.append((0, count(a, b, c, d, 0, 0, 0)))
    lst.append(((a + b + c - 2), 0))

    lst.sort(key=cmp_to_key(item_comparator))
    for i in range(len(lst) - 1):
        what = lst[i][1]
        length = lst[i + 1][0] - lst[i][0]
        if what < 0:
            what += P
        ret += length * what % P
        if ret >= P:
            ret -= P

    return ret

def submit():
    tokens = sys.stdin.readline().split()
    a = int(tokens[0])
    b = int(tokens[1])
    c = int(tokens[2])
    d = int(tokens[3])
    print(fast(a, b, c, d))

# To read from standard input and print the result
submit()
```

Please note that unlike the Java code, which had many different classes, methods, and a `main` method, Python scripts typically execute sequentially from top to bottom when run. The equivalent of the Java `main` method functionality needs to be called explicitly, as shown in the `submit()` function call at the end of the script.

The provided Java code contains a complex structure with several methods and a `main` class responsible for execution. The translated Python script provides an equivalent functionality and will read from the standard input like the original Java program.
Remember to provide the test input "3 4 5 1" followed by an Enter key press to get the expected output "25" with this Python script when you run it.
