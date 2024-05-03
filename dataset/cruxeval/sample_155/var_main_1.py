def f(ip, n):
    i = 0	## i = CLRJ
    out = ''	## out = CLRJ
    for c in ip:	## c = CLRJ | ip = CLRJ
        if i == n:	## i = CLRJ | n = CLRJ
            out += '\n'	## out = CLRJ
            i = 0	## i = CLRJ
        i += 1	## i = CLRJ
        out += c	## out = CLRJ | c = CLRJ
    return out	## out = CLRJ
