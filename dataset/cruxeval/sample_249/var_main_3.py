def f(s):
    count = {}	## <state>count = CLRJ</state>
    for i in s:	## <state>i = CLRJ | s = CLRJ</state>
        if i.islower():	## <state>i = CLRJ</state>
            count[i.lower()] = s.count(i.lower()) + count.get(i.lower(), 0)
        else:
            count[i.lower()] = s.count(i.upper()) + count.get(i.lower(), 0)	## <state>count = CLRJ | i = CLRJ | s = CLRJ</state>
    return count	## <state>count = CLRJ</state>
