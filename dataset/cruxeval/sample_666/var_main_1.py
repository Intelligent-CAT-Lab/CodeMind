def f(d1, d2):
    mmax = 0	## mmax = CLRJ
    for k1 in d1:	## k1 = CLRJ | d1 = CLRJ
        if p := len(d1[k1])+len(d2.get(k1, [])):	## p = CLRJ | d1 = CLRJ | k1 = CLRJ | d2 = CLRJ
            if p > mmax:	## p = CLRJ | mmax = CLRJ
                mmax = p	## mmax = CLRJ | p = CLRJ
    return mmax	## mmax = CLRJ
