def f(L):
    N = len(L)	## {"N" : '',"L" : ''}
    for k in range(1, N//2 + 1):	## {"k" : '',"N" : ''}
        i = k - 1	## {"i" : '',"k" : ''}
        j = N - k	## {"j" : '',"N" : '',"k" : ''}
        while i < j:	## {"i" : '',"j" : ''}
            # swap elements:
            L[i], L[j] = L[j], L[i]	## {"L" : '',"i" : '',"j" : ''}
            # update i, j:
            i += 1	## {"i" : ''}
            j -= 1	## {"j" : ''}
    return L	## {"L" : ''}
