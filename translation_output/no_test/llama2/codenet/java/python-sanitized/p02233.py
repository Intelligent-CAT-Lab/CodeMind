import math

def fib(n):
    if n == 0 or n == 1:
        return 1
    if n in memo:
        return memo[n]
    memo[n] = fib(n-1) + fib(n-2)
    return memo[n]


if __name__ == '__main__':
    n = int(input())
    print(fib(n))