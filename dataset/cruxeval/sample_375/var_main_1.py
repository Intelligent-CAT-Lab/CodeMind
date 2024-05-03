def f(a, b):
    if b in a:	## b = CLRJ | a = CLRJ
        return b.join(a.partition(a[a.index(b) + 1]))	## b = CLRJ | a = CLRJ
    else:
        return a