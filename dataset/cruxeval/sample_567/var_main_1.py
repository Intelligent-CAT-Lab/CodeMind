def f(s, n):
    ls = s.rsplit()	## ls = CLRJ | s = CLRJ
    out = []	## out = CLRJ
    while len(ls) >= n:	## ls = CLRJ | n = CLRJ
        out += ls[-n:]	## out = CLRJ | ls = CLRJ | n = CLRJ
        ls = ls[:-n]	## ls = CLRJ | n = CLRJ
    return ls + ['_'.join(out)]	## ls = CLRJ | out = CLRJ
