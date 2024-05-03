def f(s1, s2):
    position = 1	## <state>position = CLRJ</state>
    count = 0	## <state>count = CLRJ</state>
    while position > 0:	## <state>position = CLRJ</state>
        position = s1.find(s2, position)	## <state>position = CLRJ | s1 = CLRJ | s2 = CLRJ</state>
        count += 1	## <state>count = CLRJ</state>
        position += 1	## <state>position = CLRJ</state>
    return count	## <state>count = CLRJ</state>
