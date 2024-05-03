def f(s):
    b = ''	## <state>b = CLRJ</state>
    c = ''	## <state>c = CLRJ</state>
    for i in s:	## <state>i = CLRJ | s = CLRJ</state>
        c = c + i	## <state>c = CLRJ | i = CLRJ</state>
        if s.rfind(c) > -1:	## <state>s = CLRJ | c = CLRJ</state>
            return s.rfind(c)	## <state>s = CLRJ | c = CLRJ</state>
    return 0