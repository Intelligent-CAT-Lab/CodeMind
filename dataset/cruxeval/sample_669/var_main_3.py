def f(t):
    a, sep, b = t.rpartition('-')	## <state>a = CLRJ | sep = CLRJ | b = CLRJ | t = CLRJ</state>
    if len(b) == len(a):	## <state>b = CLRJ | a = CLRJ</state>
        return 'imbalanced'
    return a + b.replace(sep, '')	## <state>a = CLRJ | b = CLRJ | sep = CLRJ</state>
