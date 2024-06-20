def fib(n: int):
    if n == 0:
        return 0
    if n == 1:
        return 1
    if n == 2:
        return 2
    return fib(n - 1) + fib(n - 2)
