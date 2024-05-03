def f(a, b):
    if b in a:	## <state>b = CLRJ | a = CLRJ</state>
        return b.join(a.partition(a[a.index(b) + 1]))	## <state>b = CLRJ | a = CLRJ</state>
    else:
        return a