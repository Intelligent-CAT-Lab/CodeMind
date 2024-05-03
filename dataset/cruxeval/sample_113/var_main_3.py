def f(line):
    count = 0	## <state>count = CLRJ</state>
    a = []	## <state>a = CLRJ</state>
    for i in range(len(line)):	## <state>i = CLRJ | line = CLRJ</state>
        count += 1	## <state>count = CLRJ</state>
        if count%2==0:	## <state>count = CLRJ</state>
            a.append(line[i].swapcase())	## <state>a = CLRJ | line = CLRJ | i = CLRJ</state>
        else:
            a.append(line[i])	## <state>a = CLRJ | line = CLRJ | i = CLRJ</state>
    return ''.join(a)	## <state>a = CLRJ</state>
