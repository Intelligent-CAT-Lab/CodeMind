```python
import sys

class DIrohaAndAGrid:
    def mod_exp(self, x, y, mod):
        if y == 0:
            return 1 % mod
        ret = self.mod_exp(x, y >> 1, mod)
        ret = (ret * ret) % mod
        if y & 1 == 1:
            ret = (ret * (x % mod)) % mod
        return ret

    def solve(self, r, c, a, b):
        MOD = 10**9 + 7
        fact = [0] * (r + c)
        ifact = [0] * (r + c)
        fact[0] = 1
        ifact[0] = 1
        for i in range(1, r + c):
            fact[i] = (fact[i - 1] * i) % MOD
            ifact[i] = (ifact[i - 1] * self.mod_exp(i, MOD - 2, MOD)) % MOD

        res = (fact[r - 1 + c - 1] * ifact[r - 1] % MOD * ifact[c - 1] % MOD) % MOD
        sub = 0
        for x in range(b):
            v1 = (fact[r - a - 1 + x] * ifact[r - a - 1] % MOD * ifact[x] % MOD) % MOD
            v2 = (fact[a - 1 + c - 1 - x] * ifact[a - 1] % MOD * ifact[c - 1 - x] % MOD) % MOD
            sub = (sub + v1 * v2 % MOD) % MOD

        res = (res - sub + MOD) % MOD
        return res

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_data = DIrohaAndAGrid()
    t, r, c, a, b = map(int, input().split())
    result = in_data.solve(r, c, a, b)
    output_stream.write(str(result) + '\n')

if __name__ == "__main__":
    main()
```

