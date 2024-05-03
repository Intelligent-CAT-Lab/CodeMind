def f(a, b, n):
    result = m = b	## result = CLRJ | m = CLRJ | b = CLRJ
    for _ in range(n):	## _ = CLRJ | n = CLRJ
        if m:	## m = CLRJ
            a, m = a.replace(m, '', 1), None	## a = CLRJ | m = CLRJ
            result = m = b	## result = CLRJ | m = CLRJ | b = CLRJ
    return result.join(a.split(b))	## result = CLRJ | a = CLRJ | b = CLRJ
