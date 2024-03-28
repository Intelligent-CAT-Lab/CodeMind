class main:
    def fib(n, memo=None):
        if memo is None:
            memo = [0] * 100
        if memo[n] != 0:
            return memo[n]
        if n == 0 or n == 1:
            memo[n] = 1
            return memo[n]
        memo[n] = fib(n-1, memo) + fib(n-2, memo)
        return memo[n]
    
    n = int(input())
    print(fib(n))