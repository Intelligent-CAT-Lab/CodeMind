def f(string):
    bigTab = 100	## <state>bigTab = CLRJ</state>
    for i in range(10, 30):	## <state>i = CLRJ</state>
        if 0 < string.count('\t') < 20:	## <state>string = CLRJ</state>
            bigTab = i	## <state>bigTab = CLRJ | i = CLRJ</state>
            break
    return string.expandtabs(bigTab)	## <state>string = CLRJ | bigTab = CLRJ</state>
