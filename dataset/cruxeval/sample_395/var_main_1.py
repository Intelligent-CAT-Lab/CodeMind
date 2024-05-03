def f(s):
    for i in range(len(s)):	## i = CLRJ | s = CLRJ
        if s[i].isdecimal():	## s = CLRJ | i = CLRJ
            return i + (s[i] == '0')	## i = CLRJ | s = CLRJ
        elif s[i] == '0':
            return -1
    return -1