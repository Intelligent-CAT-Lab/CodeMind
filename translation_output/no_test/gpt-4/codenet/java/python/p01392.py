Here is the equivalent Python code for the provided Java code:

```python
from math import sqrt

def primes(N):
    ret = []
    bs = set()  # Using a set to store the non-prime numbers (acting as the bit set)
    for i in range(2, N + 1):
        if i not in bs:
            ret.append(i)
            for j in range(i * 2, N + 1, i):
                bs.add(j)
    return ret

def main():
    A = int(input().strip())
    B = int(input().strip())
    L = max(A - B, 2)
    H = A + B
    prime_list = primes(int(sqrt(H) + 1))
    count = [0] * (int(H - L + 1))
    ok = [True] * (int(H - L + 1))

    for i in range(len(prime_list) - 1, -1, -1):
        p = prime_list[i]
        div = (L + (p - 1)) // p
        pos = div * p
        while pos <= H:
            cc = 1
            v = div
            while v % p == 0:
                cc += 1
                v //= p
            if count[pos - L] > cc:
                ok[pos - L] = False
            count[pos - L] = cc
            pos += p
            div += 1

    ret = sum(1 for i in ok if i)
    print(ret)

if __name__ == "__main__":
    main()
```

Please note that the translation involved adapting the Java code to Pythonic practices. For example, the `BitSet` usage is replaced with a Python set, and loops and input handling implemented differently in Python. Additionally, the `Scanner` class is not available in Python, so reading input is done using the `input()` function and then converting to an integer where necessary. Integer division is performed using the `//` operator in Python, and the code is encapsulated inside a `main` function to prevent it from being executed when imported as a module.
