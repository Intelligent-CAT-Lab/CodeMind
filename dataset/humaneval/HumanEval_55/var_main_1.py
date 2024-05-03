def fib(n: int):
    if n == 0:	## n = CLRJ
        return 0
    if n == 1:	## n = CLRJ
        return 1
    return fib(n - 1) + fib(n - 2)	## n = CLRJ
