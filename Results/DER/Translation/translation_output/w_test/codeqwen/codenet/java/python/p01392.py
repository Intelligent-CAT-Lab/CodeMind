Here is the Python equivalent of the Java code:

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

def main():
    A = int(input())
    B = int(input())
    L = max(A - B, 2)
    H = A + B
    primes = primes(int(math.sqrt(H)) + 1)
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

This Python code does the same thing as the Java code. It first finds all prime numbers up to the square root of the maximum of the sum and difference of the two input numbers. Then it iterates over these primes in reverse order, checking if the count of prime factors of each number in the range from L to H is less than or equal to the count of prime factors of the number itself. If it is, the number is marked as not OK. Finally, it counts the number of OK numbers and prints the result.
