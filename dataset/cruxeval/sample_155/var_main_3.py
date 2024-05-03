def f(ip, n):
    i = 0	## <state>i = CLRJ</state>
    out = ''	## <state>out = CLRJ</state>
    for c in ip:	## <state>c = CLRJ | ip = CLRJ</state>
        if i == n:	## <state>i = CLRJ | n = CLRJ</state>
            out += '\n'	## <state>out = CLRJ</state>
            i = 0	## <state>i = CLRJ</state>
        i += 1	## <state>i = CLRJ</state>
        out += c	## <state>out = CLRJ | c = CLRJ</state>
    return out	## <state>out = CLRJ</state>
