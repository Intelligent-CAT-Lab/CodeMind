def f(num, l):
    t = ""	## <state>t = CLRJ</state>
    while l > len(num):	## <state>l = CLRJ | num = CLRJ</state>
        t += '0'	## <state>t = CLRJ</state>
        l -= 1	## <state>l = CLRJ</state>
    return t + num	## <state>t = CLRJ | num = CLRJ</state>
