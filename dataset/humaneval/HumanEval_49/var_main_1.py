def modp(n: int, p: int):
    ret = 1	## ret = CLRJ
    for i in range(n):	## i = CLRJ|n = CLRJ
        ret = (2 * ret) % p	## ret = CLRJ|p = CLRJ
    return ret	## ret = CLRJ
