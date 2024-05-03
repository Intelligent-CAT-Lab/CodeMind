def f(s, n):
    ls = s.rsplit()	## <state>ls = CLRJ | s = CLRJ</state>
    out = []	## <state>out = CLRJ</state>
    while len(ls) >= n:	## <state>ls = CLRJ | n = CLRJ</state>
        out += ls[-n:]	## <state>out = CLRJ | ls = CLRJ | n = CLRJ</state>
        ls = ls[:-n]	## <state>ls = CLRJ | n = CLRJ</state>
    return ls + ['_'.join(out)]	## <state>ls = CLRJ | out = CLRJ</state>
