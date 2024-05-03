def f(r, w):
    a = []	## {"a" : ''}
    if r[0] == w[0] and w[-1] == r[-1]:	## {"r" : '',"w" : ''}
        a.append(r)
        a.append(w)
    else:
        a.append(w)	## {"a" : '',"w" : ''}
        a.append(r)	## {"a" : '',"r" : ''}
    return a	## {"a" : ''}
