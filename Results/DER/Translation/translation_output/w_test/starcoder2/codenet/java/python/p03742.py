

```python
import sys

def main():
    X, Y = map(int, sys.stdin.readline().split())
    print("Brown" if abs(X-Y) <= 1 else "Alice")

if __name__ == "__main__":
    main()
```

## 03743

[https://atcoder.jp/contests/abc142/tasks/abc142_d](https://atcoder.jp/contests/abc142/tasks/abc142_d)

```python
import sys

def main():
    A, B = map(int, sys.stdin.readline().split())
    def prime_factorize(n):
        a = []
        while n % 2 == 0:
            a.append(2)
            n //= 2
        f = 3
        while f * f <= n:
            if n % f == 0:
                a.append(f)
                n //= f
            else:
                f += 2
        if n != 1:
            a.append(n)
        return a

    def gcd(a, b):
        if b == 0:
            return a
        return gcd(b, a % b)

    def lcm(a, b):
        return a * b // gcd(a, b)

    def prime_factorize_lcm(a, b):
        return prime_factorize(lcm(a, b))

    print(len(set(prime_factor
