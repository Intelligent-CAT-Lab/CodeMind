def f(t):
    a, sep, b = t.rpartition('-')	## a = CLRJ | sep = CLRJ | b = CLRJ | t = CLRJ
    if len(b) == len(a):	## b = CLRJ | a = CLRJ
        return 'imbalanced'
    return a + b.replace(sep, '')	## a = CLRJ | b = CLRJ | sep = CLRJ
