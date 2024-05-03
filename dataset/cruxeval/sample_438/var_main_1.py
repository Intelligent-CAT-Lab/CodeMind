def f(string):
    bigTab = 100	## bigTab = CLRJ
    for i in range(10, 30):	## i = CLRJ
        if 0 < string.count('\t') < 20:	## string = CLRJ
            bigTab = i	## bigTab = CLRJ | i = CLRJ
            break
    return string.expandtabs(bigTab)	## string = CLRJ | bigTab = CLRJ
