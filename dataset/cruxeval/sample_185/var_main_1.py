def f(L):
    N = len(L)	## N = CLRJ | L = CLRJ
    for k in range(1, N//2 + 1):	## k = CLRJ | N = CLRJ
        i = k - 1	## i = CLRJ | k = CLRJ
        j = N - k	## j = CLRJ | N = CLRJ | k = CLRJ
        while i < j:	## i = CLRJ | j = CLRJ
            # swap elements:
            L[i], L[j] = L[j], L[i]	## L = CLRJ | i = CLRJ | j = CLRJ
            # update i, j:
            i += 1	## i = CLRJ
            j -= 1	## j = CLRJ
    return L	## L = CLRJ
