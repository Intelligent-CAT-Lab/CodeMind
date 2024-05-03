Here is the Python version of the Java code:

```python
import math

def primes(N):
    ret = []
    bs = [True] * (N + 1)
    for i in range(2, N + 1):
        if bs[i]:
            ret.append(i)
            for j in range(i * 2, N + 1, i):
                bs[j] = False
    return ret

L, H = 0, 0
primes = []
ans = 0

def main():
    global L, H, primes, ans
    A = int(input())
    B = int(input())
    L = max(A - B, 2)
    H = A + B
    primes = primes((int(math.sqrt(H)) + 1))
    count = [0] * (H - L + 1)
    ok = [True] * (H - L + 1)
    for i in range(len(primes) - 1, -1, -1):
        p = primes[i]
        div = (L + (p - 1)) // p
        for pos in range(div * p, H + 1, p):
            div += 1
            cc = 1
            v = div
            while v % p == 0:
                cc += 1
                v //= p
            if count[pos - L] > cc:
                ok[pos - L] = False
            count[pos - L] = cc
    ret = 0
    for i in range(len(ok)):
        if ok[i]:
            ret += 1
    print(ret)

if __name__ == "__main__":
    main()
```

Please note that the Python version of the code is a direct translation of the Java code. The only difference is that Python uses `input()` instead of `sc.nextLong()` to read input from the user. Also, Python uses `range()` instead of `nextClearBit()` and `set()` methods of BitSet class.
