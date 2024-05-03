def f(s):
    for i in range(len(s)):	## <state>i = CLRJ | s = CLRJ</state>
        if s[i].isdecimal():	## <state>s = CLRJ | i = CLRJ</state>
            return i + (s[i] == '0')	## <state>i = CLRJ | s = CLRJ</state>
        elif s[i] == '0':
            return -1
    return -1