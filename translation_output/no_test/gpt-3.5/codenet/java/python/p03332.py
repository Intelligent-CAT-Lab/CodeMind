```python
import sys
input = sys.stdin.readline

def modI(a, m):
    if a <= 1:
        return 1
    return ((1 - modI(m % a, a) * m) // a + m) % m

def main():
    M = 998244353
    n, a, b, k = map(int, input().split())
    ans = 0
    nck = [0] * (n + 1)
    nck[0] = 1
    for i in range(1, n+1):
        nck[i] = nck[i-1] * (n-i+1) % M * modI(i, M) % M
    
    for i in range(n + 1):
        if a * i <= k and (k - a*i) % b == 0 and (k - a*i) // b <= n:
            ans += nck[i] * nck[(k - a*i) // b] % M
    
    print(ans % M)

if __name__ == "__main__":
    main()
```
