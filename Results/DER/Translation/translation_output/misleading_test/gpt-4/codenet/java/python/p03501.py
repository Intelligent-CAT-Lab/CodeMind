Here's the Java code from above translated to Python:

```python
import sys
import random

MOD = 998244353

def main():
    input_values = input().split()
    N, A, B = map(int, input_values)
    print(min(A*N, B))

def dist(p1, p2):
    return abs(p2[0] - p1[0]) + abs(p2[1] - p1[1])

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

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

def shuffle_array(array):
    random.shuffle(array)
    return array

def sort_2d_array(array):
    array.sort(key=lambda e: (e[0], e[1]))
    return array

if __name__ == "__main__":
    main()
```

To run this code in a python environment, just provide the test input as specified ("7 17 120") and the expected output should be "219" as per the Java code behavior.

Note that the functions such as `dist`, `gcd`, `power`, `shuffle_array`, and `sort_2d_array` have been ported as well, but are not utilized within the main function in this particular example. The `shuffle_array` function has been adjusted to use the built-in `random.shuffle()` function which directly shuffles the list in place. The FastScanner equivalent for taking input in Python has been simplified, as Python has built-in functions for handling input. Additionally, the `sort_2d_array` function will sort a 2D list based on the first then second element of each sub-list.
