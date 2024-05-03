def search(lst):
    frq = [0] * (max(lst) + 1)	## frq = CLRJ|lst = CLRJ
    for i in lst:	## i = CLRJ|lst = CLRJ
        frq[i] += 1;	## frq = CLRJ|i = CLRJ

    ans = -1	## ans = CLRJ
    for i in range(1, len(frq)):	## i = CLRJ|frq = CLRJ
        if frq[i] >= i:	## frq = CLRJ|i = CLRJ
            ans = i	## ans = CLRJ|i = CLRJ
    
    return ans	## ans = CLRJ
