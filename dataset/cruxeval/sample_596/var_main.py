def f(txt, alpha):
    txt = sorted(txt)	## {"txt" : ''}
    if txt.index(alpha) % 2 == 0:	## {"txt" : '',"alpha" : ''}
        return txt[::-1]
    return txt	## {"txt" : ''}
