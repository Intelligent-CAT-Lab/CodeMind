def f(chars):
    s = ""	## s = CLRJ
    for ch in chars:	## ch = CLRJ | chars = CLRJ
        if chars.count(ch) % 2 == 0:	## chars = CLRJ | ch = CLRJ
            s += ch.upper()	## s = CLRJ | ch = CLRJ
        else:
            s += ch	## s = CLRJ | ch = CLRJ
    return s	## s = CLRJ
