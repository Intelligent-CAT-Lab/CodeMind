def f(names):
    count = len(names)	## <state>count = CLRJ | names = CLRJ</state>
    numberOfNames = 0	## <state>numberOfNames = CLRJ</state>
    for i in names:	## <state>i = CLRJ | names = CLRJ</state>
        if i.isalpha():	## <state>i = CLRJ</state>
            numberOfNames += 1	## <state>numberOfNames = CLRJ</state>
    return numberOfNames	## <state>numberOfNames = CLRJ</state>
