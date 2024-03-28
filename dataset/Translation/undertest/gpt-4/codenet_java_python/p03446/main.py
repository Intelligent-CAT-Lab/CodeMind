import sys

P = 10 ** 9 + 7
C = 110
ways = [[0] * (i + 1) for i in range(C)]

def pre_calc():
    for i in range(C):
        ways[i][0] = ways[i][i] = 1
        for j in range(1, i):
            ways[i][j] = (ways[i - 1][j] + ways[i - 1][j - 1]) % P

def pow_mod(a, b, mod):
    ret = 1
    while b > 0:
        if b & 1:
            ret = (ret * a) % mod
        a = (a * a) % mod
        b >>= 1
    return ret

def one2D(a, p, b, q):
    return (pow_mod(b, p - 1, P) + pow_mod(a, q - 1, P) - 1) % P

pre_calc()

def solve(a, b, c, d, e, f):
    if d % a != 0 or e % b != 0 or f % c != 0:
        return 0
    
    p = d // a
    q = e // b
    r = f // c
    
    dp = [[0] * (q + 1) for _ in range(p + 1)]
    dp[p][q] = 1
    
    ans = 0
    
    for x in range(p - 1, 0, -1):
        for y in range(q - 1, 0, -1):
            dp[x][y] = (ways[p][x] * ways[q][y] * pow_mod(c, (p - x) * (q - y), P)) % P
            for xb in range(x, p + 1):
                for yb in range(y, q + 1):
                    if xb + yb == x + y:
                        continue
                    dp[x][y] -= (dp[xb][yb] * ways[xb][x] * ways[yb][y]) % P
                    if dp[x][y] < 0:
                        dp[x][y] += P
            
            foo = pow_mod(b, x, P)
            bar = pow_mod(a, y, P)
            
            delta = 0
            
            delta += pow_mod((foo + bar - 1) % P, r, P)
            if delta >= P:
                delta -= P
            
            delta -= pow_mod(foo, r, P)
            if delta < 0:
                delta += P
                
            delta -= pow_mod(bar, r, P)
            if delta < 0:
                delta += P
                
            delta += 1
            if delta >= P:
                delta -= P
            
            delta = (delta * dp[x][y]) % P
            ans += delta
            if ans >= P:
                ans -= P
    
    ans += (pow_mod(one2D(a, p, b, q), r, P) * pow_mod(a * b, r - 1, P)) % P
    if ans >= P:
        ans -= P
    
    ans += (pow_mod(one2D(b, q, c, r), p, P) * pow_mod(b * c, p - 1, P)) % P
    if ans >= P:
        ans -= P
    
    ans += (pow_mod(one2D(c, r, a, p), q, P) * pow_mod(c * a, q - 1, P)) % P
    if ans >= P:
        ans -= P
    
    ans -= pow_mod(a, q * r - 1, P)
    if ans < 0:
        ans += P
    
    ans -= pow_mod(b, r * p - 1, P)
    if ans < 0:
        ans += P
    
    ans -= pow_mod(c, p * q - 1, P)
    if ans < 0:
        ans += P
    
    ans += 1
    if ans >= P:
        ans -= P
    
    ans = (ans * a % P * b % P * c % P) % P
    
    return ans

# Sample Test Case: Read input and print output
input_values = [int(x) for x in input().split()]
print(solve(*input_values))