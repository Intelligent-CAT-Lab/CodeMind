class main:
    MOD = 0
    
    def plus(x, y):
        return (x + y) % MOD
    
    def mul(x, y):
        return (x * y) % MOD
    
    def pick2(n):
        return mul(n, n - 1)
    
    # Memoization dictionary for function f
    memo = {}
    
    def f(i, j):
        if i == 0:
            return 1 if j == zero else 0
        if i < 0 or j >= len(f_matrix[i]) or j < 0:
            return 0
        if (i, j) in memo:
            return memo[(i, j)]
    
        val = f(i - 1, j - 1)
        val = plus(val, mul(i - 1, f(i - 2, j + 1)))
        val = plus(val, mul(pick2(i - 1), f(i - 3, j)))
        memo[(i, j)] = val
        return val
    
    if __name__ == "__main__":
        n, MOD = map(int, input().split())
        n *= 3
        zero = n
        f_matrix = [[-1] * (n + n + 1) for _ in range(n + 1)]
    
        ans = 0
        for i in range(n + 1):
            ans = plus(ans, f(n, i + zero))
    
        print(ans)