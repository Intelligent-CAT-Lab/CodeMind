def fib(n):
    memo = [0] * 100
    if memo[n] != 0:
        return memo[n]
    elif n == 0 or n == 1:
        memo[n] = 1
    else:
        memo[n] = fib(n-1) + fib(n-2)
    return memo[n]

n = int(input())
print(fib(n))