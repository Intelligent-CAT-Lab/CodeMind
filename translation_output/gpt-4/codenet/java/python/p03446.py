Here's the translated Python code:

```python
import sys

P = 10**9 + 7
C = 110

def pow(a, b):
    ret = 1
    while b > 0:
        if b & 1:
            ret = ret * a % P
        a = a * a % P
        b >>= 1
    return ret

def one2D(a, p, b, q):
    return (pow(b, p - 1) + pow(a, q - 1) - 1) % P

def precalc():
    ways = [[0] * (i + 1) for i in range(C)]
    for i in range(C):
        ways[i][0] = ways[i][i] = 1
        for j in range(1, i):
            ways[i][j] = (ways[i - 1][j] + ways[i - 1][j - 1]) % P
    return ways

def submit(a, b, c, d, e, f, ways):
    if d % a != 0 or e % b != 0 or f % c != 0:
        print(0)
        return

    p = d // a
    q = e // b
    r = f // c

    dp = [[0] * (q + 1) for _ in range(p + 1)]
    dp[p][q] = 1

    ans = 0

    for x in range(p - 1, 0, -1):
        for y in range(q - 1, 0, -1):
            dp[x][y] = ways[p][x] * ways[q][y] % P * pow(c, (p - x) * (q - y)) % P

            for xb in range(x, p + 1):
                for yb in range(y, q + 1):
                    if xb + yb == x + y:
                        continue
                    dp[x][y] -= dp[xb][yb] * ways[xb][x] % P * ways[yb][y] % P
                    if dp[x][y] < 0:
                        dp[x][y] += P

            foo = pow(b, x)
            bar = pow(a, y)

            delta = 0

            delta += pow((foo + bar - 1) % P, r)
            if delta >= P:
                delta -= P

            delta -= pow(foo, r)
            if delta < 0:
                delta += P

            delta -= pow(bar, r)
            if delta < 0:
                delta += P

            delta += 1
            if delta >= P:
                delta -= P

            delta = delta * dp[x][y] % P
            ans += delta
            if ans >= P:
                ans -= P

    ans += pow(one2D(a, p, b, q), r) * pow(a * b, r - 1) % P
    if ans >= P:
        ans -= P

    ans += pow(one2D(b, q, c, r), p) * pow(b * c, p - 1) % P
    if ans >= P:
        ans -= P

    ans += pow(one2D(c, r, a, p), q) * pow(c * a, q - 1) % P
    if ans >= P:
        ans -= P

    ans -= pow(a, q * r - 1)
    if ans < 0:
        ans += P

    ans -= pow(b, r * p - 1)
    if ans < 0:
        ans += P

    ans -= pow(c, p * q - 1)
    if ans < 0:
        ans += P

    ans += 1
    if ans >= P:
        ans -= P
    ans = ans * a % P * b % P * c % P

    print(ans)

if __name__ == '__main__':
    input_data = [int(x) for x in sys.stdin.read().split()]
    a, b, c, d, e, f = input_data[:6]
    ways = precalc()
    submit(a, b, c, d, e, f, ways)
```
Please note that the original Java program uses a custom input/output mechanism and precalculates the `ways` array before calling the `submit` function. To simulate the behavior in a simple way, the Python version assumes that the input is provided from standard input all at once and processed as a list of integers. The `precalc()` function is called right before the `submit()` function within the `if __name__ == '__main__':` block to ensure we have the `ways` array available.

The translated code includes conversions from the Java modulus operation to Python's modulus operator `%`. The `pow()` and `one2D()` functions are present along with the conversion of the `submit()` method. The data structure used to hold `ways` and `dp` is a list of lists in Python instead of an array of arrays in Java. Keep in mind that the global scope in Python is different from Java's static context, so we'll need to pass `ways` as a parameter to the `submit` function.

Lastly, the translated code is a linear script that would be run directly, unlike Java's class-based structure. If you want to integrate the Python code into a larger application, you might need to wrap it inside functions or classes as appropriate for your codebase.
