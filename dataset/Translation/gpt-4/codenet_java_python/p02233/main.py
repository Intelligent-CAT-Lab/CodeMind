def fib(n, memo=None):
    if memo is None:
        memo = [0] * 100
    if memo[n] != 0:
        return memo[n]
    if n == 0 or n == 1:
        memo[n] = 1
        return 1
    memo[n-1] = fib(n-1, memo)
    memo[n-2] = fib(n-2, memo)
    memo[n] = memo[n-1] + memo[n-2]
    return memo[n]

if __name__ == "__main__":
    n = int(input())
    print(fib(n))