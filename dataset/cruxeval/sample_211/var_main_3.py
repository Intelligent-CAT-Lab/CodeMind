def f(s):
    count = 0	## <state>count = CLRJ</state>
    for c in s:	## <state>c = CLRJ | s = CLRJ</state>
        if s.rindex(c) != s.index(c):	## <state>s = CLRJ | c = CLRJ</state>
            count+=1	## <state>count = CLRJ</state>
    return count	## <state>count = CLRJ</state>
