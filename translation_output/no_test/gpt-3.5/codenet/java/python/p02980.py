```python
import sys

MODULO = 998244353

def solve(height, width):
    
    def comb(n, r):
        numerator = facts[n]
        denominator = (invfacts[r] * invfacts[n-r]) % MODULO
        return (numerator * denominator) % MODULO
    
    facts = [1] * (5*10**5 + 2)
    invfacts = [1] * (5*10**5 + 2)
    
    for i in range(1, 5*10**5 + 2):
        facts[i] = (facts[i-1] * i) % MODULO
        invfacts[i] = pow(facts[i], MODULO-2, MODULO)
    
    ph = [0] * (width + 1)
    ph[0] = 1
    for i in range(1, width + 1):
        ph[i] = ph[i-1] * (height + 1) % MODULO
    
    pw = [0] * (height + 1)
    pw[0] = 1
    for i in range(1, height + 1):
        pw[i] = pw[i-1] * (width + 1) % MODULO
    
    res = 0
    for common in range(min(height, width) + 1):
        ways = (comb(height, common) * comb(width, common) 
                * ph[width - common] % MODULO * pw[height - common] % MODULO)
        if common % 2 == 0:
            res += ways
        else:
            res -= ways
    
    res %= MODULO
    if res < 0:
        res += MODULO
    
    return res

if __name__ == "__main__":
    height, width = map(int, input().split())
    result = solve(height, width)
    print(result)
```
