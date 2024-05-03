def f(d1, d2):
    mmax = 0	## mmax = []
    for k1 in d1:	## k1 = [] | d1 = []
        if p := len(d1[k1])+len(d2.get(k1, [])):	## p = [] | d1 = [] | k1 = [] | d2 = []
            if p > mmax:	## p = [] | mmax = []
                mmax = p	## mmax = [] | p = []
    return mmax	## mmax = []
