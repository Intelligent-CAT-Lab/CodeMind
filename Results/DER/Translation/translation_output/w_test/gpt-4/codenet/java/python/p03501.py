Below is the translated Python code, following the structure and functionality of the original Java code. The `print` function is used to output the result, and built-in functions like `min` provide the necessary operations. The `input` function is used to read the space-separated numbers from the user, similar to the `FastScanner` class in the Java code.

```python
import math
import sys
import random

MOD = 998244353
# INF = 1000000000000000007
# INF = 1000000007

def main():
    N, A, B = map(int, input().split())
    print(min(A*N, B))

def dist(p1, p2):
    return abs(p2[0] - p1[0]) + abs(p2[1] - p1[1])

def gcd(a, b):
    if a < b:
        return gcd(b, a)
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
        if y % 2:
            ans = (ans * x) % m
        y //= 2
        x = (x * x) % m
    return ans

def shuffle_array(array):
    random.shuffle(array)
    return array

def sort_array(array):
    array.sort()
    return array

if __name__ == "__main__":
    main()
``` 

Please note that in the Python version, I have flattened the shuffle and sort functions based on their expected input types since Python is dynamically typed and can handle the variations without the need for multiple implementations. Additionally, I assumed that the `sort` function should order by the first element, and in case of a tie, by the second, based on the original Java lambda expression.
