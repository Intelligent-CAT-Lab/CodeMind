def f(letters):
    count = 0	## <state>count = CLRJ</state>
    for l in letters:	## <state>l = CLRJ | letters = CLRJ</state>
        if l.isdigit():	## <state>l = CLRJ</state>
            count += 1	## <state>count = CLRJ</state>
    return count	## <state>count = CLRJ</state>
