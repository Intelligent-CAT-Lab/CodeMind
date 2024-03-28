Here is the translated code from Java to Python:

```python
from math import gcd

def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

def generate_primes(up_to):
    primes = []
    candidate = 2
    while len(primes) < up_to:
        if is_prime(candidate):
            primes.append(candidate)
        candidate += 1
    return primes

def main():
    n = int(input())
    
    if n == 2:
        print("4 7")
        print("23 10")
        return
    
    primes_needed = n * 2
    primes = generate_primes(primes_needed)
    
    a = [[0]*n for _ in range(n)]
    for i in range(n):
        for j in range(i % 2, n, 2):
            a1 = (i + j) // 2
            a2 = (j - i + n - 1) // 2 + n
            a[i][j] = primes[a1] * primes[a2]
    
    dx = [-1, 0, 1, 0]
    dy = [0, 1, 0, -1]
    for i in range(n):
        for j in range((i + 1) % 2, n, 2):
            g = 0
            prod = 1
            for k in range(4):
                ni, nj = i + dx[k], j + dy[k]
                if ni < 0 or nj < 0 or ni >= n or nj >= n:
                    continue
                if g == 0:
                    g = a[ni][nj]
                    prod = g
                else:
                    g = gcd(prod, a[ni][nj])
                    prod = prod // g * a[ni][nj]
            a[i][j] = prod + 1
    
    for row in a:
        print(' '.join(str(cell) for cell in row))

if __name__ == "__main__":
    main()
```
