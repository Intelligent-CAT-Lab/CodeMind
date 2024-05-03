def f(a, b):
    if b in a:	## b = [] | a = []
        return b.join(a.partition(a[a.index(b) + 1]))	## b = [] | a = []
    else:
        return a