def f(orig):
    copy = orig	## copy = CLRJ | orig = CLRJ
    copy.append(100)	## copy = CLRJ
    orig.pop()	## orig = CLRJ
    return copy	## copy = CLRJ
