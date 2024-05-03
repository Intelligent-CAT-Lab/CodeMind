def f(a):
    b = a.copy()	## b = CLRJ | a = CLRJ
    for k in range(0, len(a) - 1, 2):	## k = CLRJ | a = CLRJ
        b.insert(k + 1, b[k])	## b = CLRJ | k = CLRJ
    b.append(b[0])	## b = CLRJ
    return b	## b = CLRJ
