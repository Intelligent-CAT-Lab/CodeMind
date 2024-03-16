```python
import math

class p03913:
    def __init__(self):
        pass

    @staticmethod
    def main():
        p = p03913()
        p.run()

    def run(self):
        n, a = map(int, input().split())
        self.solver(n, a)

    def solver(self, n, a):
        ans = n
        for m in range(2, 41):
            c = int(n ** (1.0 / m))
            for i in range(max(c - 2, 2), c + 3):
                if math.log(i) * (m - 1) > 40 * math.log(2):
                    continue
                for j in range(m):
                    res = a * (m - 1)
                    res += j * i + (m - 1 - j) * (i + 1)
                    den = self.pow(i, j) * self.pow(i + 1, m - 1 - j)
                    res += (n + den - 1) // den
                    ans = min(ans, res)
        print(ans)

    def pow(self, a, n):
        ret = 1
        while n > 0:
            if n % 2 == 1:
                ret *= a
            n >>= 1
            a *= a
        return ret

if __name__ == "__main__":
    p03913.main()
```
