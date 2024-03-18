```python
class In:
    def __init__(self):
        self.reader = []
        self.tokenizer = None

    def next(self):
        return self.reader.pop(0) if self.reader else ''
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())

class Out:
    def __init__(self):
        self.output = []

    def println(self, *args):
        self.output.append(' '.join(map(str, args)))

    def flush(self):
        for line in self.output:
            print(line)


class p02722:
    def __init__(self):
        self.in_obj = In()
        self.out_obj = Out()
        self.mod = 1000000007
        self.inf = 0xfffffffffffffff

    def solve(self):
        n = self.in_obj.nextLong()
        ans = 0
        primeFactors2 = self.getPrimeFactors(n - 1)
        for p in range(2, int(n ** 0.5) + 1):
            if p * p == n:
                ans += 1
                continue
            if n % p == 0:
                if self.check(p, n):
                    ans += 1
                if self.check(n // p, n):
                    ans += 1
        a1 = 1
        for entry in primeFactors2.items():
            a1 *= entry[1] + 1
        self.out_obj.println(a1 + ans)
        self.out_obj.flush()

    def check(self, p, n):
        while n % p == 0:
            n //= p
            if n % p == 1:
                return True
        return False

    def getPrimeFactors(self, n):
        primeFactors = {}
        c = n
        for i in range(2, int(n ** 0.5) + 1):
            count = 0
            while c % i == 0:
                count += 1
                c //= i
            if count > 0:
                primeFactors[i] = count
        if c > 1:
            primeFactors[c] = 1
        return primeFactors


instance = p02722()
instance.solve()
```
```
