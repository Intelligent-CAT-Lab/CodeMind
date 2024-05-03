def f(s1, s2):
    for k in range(0, len(s2)+len(s1)):	## <state>k = CLRJ | s2 = CLRJ | s1 = CLRJ</state>
        s1 += s1[0]	## <state>s1 = CLRJ</state>
        if s1.find(s2) >= 0:	## <state>s1 = CLRJ | s2 = CLRJ</state>
            return True
    return False