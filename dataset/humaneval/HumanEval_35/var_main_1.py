def max_element(l: list):
    m = l[0]	## m = CLRJ|l = CLRJ
    for e in l:	## e = CLRJ|l = CLRJ
        if e > m:	## e = CLRJ|m = CLRJ
            m = e	## m = CLRJ|e = CLRJ
    return m	## m = CLRJ
