MOD = 10**9 + 7
dx = [-1, 0, 1, 0]
dy = [0, -1, 0, 1]
dx8 = [-1, -1, -1, 0, 0, 1, 1, 1]
dy8 = [-1, 0, 1, -1, 1, -1, 0, 1]
inf = float('inf')
linf = 2**63 - 1  # equivalent to Long.MAX_VALUE / 3 in Java
dinf = float('inf')
eps = 1e-10
pi = 3.141592653589793

def solve(n, m):
    if n > m:
        n, m = m, n

    if m - n > 1:
        return 0

    ans = 1
    for i in range(n):
        ans = ans * (i+1) % MOD
    for i in range(m):
        ans = ans * (i+1) % MOD

    if m == n:
        ans = ans * 2 % MOD
    
    return ans

def main():
    n, m = map(int, input().split())
    print(solve(n, m))

if __name__ == "__main__":
    main()