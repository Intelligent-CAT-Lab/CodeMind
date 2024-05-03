def f(s):
    while len(s) > 1:	## <state>s = CLRJ</state>
        s.clear()	## <state>s = CLRJ</state>
        s.append(len(s))	## <state>s = CLRJ</state>
    return s.pop()	## <state>s = CLRJ</state>
