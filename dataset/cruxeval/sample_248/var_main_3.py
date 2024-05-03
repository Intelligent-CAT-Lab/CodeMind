def f(a, b):
    a.sort()	## <state>a = CLRJ</state>
    b.sort(reverse=True)	## <state>b = CLRJ</state>
    return a + b	## <state>a = CLRJ | b = CLRJ</state>
