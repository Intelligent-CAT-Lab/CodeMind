```python
class In:
    def __init__(self):
        self.reader = open(0)
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            self.tokenizer = iter(input().split())
        return next(self.tokenizer)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

class Out:
    def __init__(self):
        self.autoFlush = False

    def println(self, *args):
        print(*args)

    def flush(self):
        pass

mod = 1000000007
inf = 0xfffffffffffffff

def check(p, n):
    while n % p == 0:
        n //= p
        if n % p == 1:
            return True
    return False

def getPrimeFactors(n):
    primeFactors = {}
    c = n
    i = 2
    while i * i <= n and 1 < c:
        count = 0
        while c % i == 0:
            count += 1
            c //= i
        if count > 0:
            primeFactors[i] = count
        i += 1
    if c > 1:
        primeFactors[c] = 1
    return primeFactors

def solve():
    n = int(input())
    ans = 0
    primeFactors2 = getPrimeFactors(n - 1)
    for p in range(2, int(n**0.5) + 1):
        if p * p == n:
            ans += 1
            continue
        if n % p == 0:
            if check(p, n):
                ans += 1
            if check(n // p, n):
                ans += 1
    a1 = 1
    for key, value in primeFactors2.items():
        a1 *= value + 1
    print(a1 + ans)

if __name__ == "__main__":
    solve()
```

