#! /usr/bin/env python
from itertools import product, starmap, dropwhile
from math import log
n = int("25")
m = int(log(n, 3)) + 2
for a in product([-1, 0, 1], repeat=m):
    if n == sum(starmap(lambda t, x: 3 ** t * x, zip(reversed(range(m)), a))):
        print("".join(map(lambda x: "-0+"[x + 1], dropwhile(lambda x: x == 0, a))))
        break
