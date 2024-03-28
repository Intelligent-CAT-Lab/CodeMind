MOD = 1000000007

def solve(n, m):
    dp = {(1, 0): 1}
    for _ in range(m):
        next = {(a+b, 0): (next.get((a+b, 0), 0) + dp.get((a, b), 0) * a) % MOD 
                for a in range(n+1) for b in range(n+1)}
        next.update({(a, b+1): (next.get((a, b+1), 0) + dp.get((a, b), 0) * (n-a-b)) % MOD 
                     for a in range(n+1) for b in range(n+1)})
        next.update({(a, b): (next.get((a, b), 0) + dp.get((a, b), 0) * b) % MOD 
                     for a in range(n+1) for b in range(n+1)})
        dp = next
    return dp[(n, 0)]

n, m = map(int, input().split())
print(solve(n, m))