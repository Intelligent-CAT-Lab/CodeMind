def f(r, w):
    a = []	## <state>a = CLRJ</state>
    if r[0] == w[0] and w[-1] == r[-1]:	## <state>r = CLRJ | w = CLRJ</state>
        a.append(r)
        a.append(w)
    else:
        a.append(w)	## <state>a = CLRJ | w = CLRJ</state>
        a.append(r)	## <state>a = CLRJ | r = CLRJ</state>
    return a	## <state>a = CLRJ</state>
