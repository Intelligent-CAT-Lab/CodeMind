Below is the translated Java code to Python:

```python
from math import gcd

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def main():
    n = int(input())
    if n == 2:
        print("4 7")
        print("23 10")
        return

    primes = []
    x = 2
    while len(primes) < n * 2:
        if is_prime(x):
            primes.append(x)
        x += 1

    a = [[0] * n for _ in range(n)]
    for i in range(n):
        for j in range(i % 2, n, 2):
            a1 = (i + j) // 2
            a2 = (j - i + n - 1) // 2 + n
            a[i][j] = primes[a1] * primes[a2]

    dx = [-1, 0, 1, 0]
    dy = [0, 1, 0, -1]
    for i in range(n):
        for j in range((i + 1) % 2, n, 2):
            common_gcd = 0
            product = 1
            for k in range(4):
                ni, nj = i + dx[k], j + dy[k]
                if ni < 0 or ni >= n or nj < 0 or nj >= n:
                    continue
                if common_gcd == 0:
                    common_gcd = a[ni][nj]
                    product = common_gcd
                else:
                    common_gcd = gcd(product, a[ni][nj])
                    product = product // common_gcd * a[ni][nj]
            a[i][j] = product + 1

    for row in a:
        print(' '.join(map(str, row)))

if __name__ == "__main__":
    main()
```

This code takes an integer `n` as input and prints the output as required. It contains the necessary helper functions `is_prime` and `gcd`, and closely follows the logic and structure of the original Java program.
