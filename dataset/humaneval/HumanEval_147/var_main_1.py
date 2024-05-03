def get_max_triples(n):
    A = [i*i - i + 1 for i in range(1,n+1)]	## A = CLRJ|i = CLRJ|n = CLRJ
    ans = []	## ans = CLRJ
    for i in range(n):	## i = CLRJ|n = CLRJ
        for j in range(i+1,n):	## j = CLRJ|i = CLRJ|n = CLRJ
            for k in range(j+1,n):	## k = CLRJ|j = CLRJ|n = CLRJ
                if (A[i]+A[j]+A[k])%3 == 0:	## A = CLRJ|i = CLRJ|j = CLRJ|k = CLRJ
                    ans += [(A[i],A[j],A[k])]	## ans = CLRJ|A = CLRJ|i = CLRJ|j = CLRJ|k = CLRJ
    return len(ans)	## ans = CLRJ
