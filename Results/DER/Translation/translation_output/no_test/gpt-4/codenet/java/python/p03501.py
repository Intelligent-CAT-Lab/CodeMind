Here's the translated Python code:

```python
import sys
import math
from random import randint

MOD = 998244353

def main():
    N, A, B = map(int, input().split())
    print(min(A * N, B))

def dist(p1, p2):
    return abs(p2[0] - p1[0]) + abs(p2[1] - p1[1])

def gcd(a, b):
    return a if b == 0 else gcd(b, a % b)

def power(x, y, m):
    if y < 0:
        return 0
    ans = 1
    x %= m
    while y > 0:
        if y % 2 == 1:
            ans = (ans * x) % m
        y //= 2
        x = (x * x) % m
    return ans

def shuffle(array):
    for i in range(len(array)):
        random_position = randint(0, len(array) - 1)
        array[i], array[random_position] = array[random_position], array[i]
    return array

def sort_2d_array(array, primary_index=0, secondary_index=None):
    array.sort(key=lambda x: (x[primary_index], x[secondary_index] if secondary_index is not None else x[primary_index]))
    return array

if __name__ == "__main__":
    main()
```

Please note that this translation assumes the FastScanner class functionalties are replaced with Python's built-in `input` and `map` functions, as there is no direct equivalent in Python. The `print` function is used for output. I've also combined the two separate shuffle functions into one, as Python supports polymorphism. The sorting of 2D arrays has been updated to use Python's lambda expressions. Functions that depend on utility classes or methods not provided in the problem, such as the `FastScanner`, are reimagined with Python's standard input functions.
