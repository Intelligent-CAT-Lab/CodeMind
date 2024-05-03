def f(line, char):
    count = line.count(char)	## <state>count = CLRJ | line = CLRJ | char = CLRJ</state>
    for i in range(count+1, 0, -1):	## <state>i = CLRJ | count = CLRJ</state>
        line = line.center(len(line)+i // len(char), char)	## <state>line = CLRJ | i = CLRJ | char = CLRJ</state>
    return line	## <state>line = CLRJ</state>
