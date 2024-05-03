def f(L):
    N = len(L)	## <state>N = CLRJ | L = CLRJ</state>
    for k in range(1, N//2 + 1):	## <state>k = CLRJ | N = CLRJ</state>
        i = k - 1	## <state>i = CLRJ | k = CLRJ</state>
        j = N - k	## <state>j = CLRJ | N = CLRJ | k = CLRJ</state>
        while i < j:	## <state>i = CLRJ | j = CLRJ</state>
            # swap elements:
            L[i], L[j] = L[j], L[i]	## <state>L = CLRJ | i = CLRJ | j = CLRJ</state>
            # update i, j:
            i += 1	## <state>i = CLRJ</state>
            j -= 1	## <state>j = CLRJ</state>
    return L	## <state>L = CLRJ</state>
