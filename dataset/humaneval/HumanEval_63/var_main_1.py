def fibfib(n: int):
    if n == 0:	## n = CLRJ
        return 0
    if n == 1:	## n = CLRJ
        return 0
    if n == 2:	## n = CLRJ
        return 1
    return fibfib(n - 1) + fibfib(n - 2) + fibfib(n - 3)
