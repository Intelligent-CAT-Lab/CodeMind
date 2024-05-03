def is_prime(n):
    if n < 2:	## n = CLRJ
        return False
    for k in range(2, n - 1):	## k = CLRJ|n = CLRJ
        if n % k == 0:	## n = CLRJ|k = CLRJ
            return False
    return True
