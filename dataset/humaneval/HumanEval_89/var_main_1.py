def encrypt(s):
    d = 'abcdefghijklmnopqrstuvwxyz'	## d = CLRJ
    out = ''	## out = CLRJ
    for c in s:	## c = CLRJ|s = CLRJ
        if c in d:	## c = CLRJ|d = CLRJ
            out += d[(d.index(c)+2*2) % 26]	## out = CLRJ|d = CLRJ|c = CLRJ
        else:
            out += c
    return out	## out = CLRJ
