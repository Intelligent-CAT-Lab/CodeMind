def simplify(x, n):
    a, b = x.split("/")	## a = CLRJ|b = CLRJ|x = CLRJ
    c, d = n.split("/")	## c = CLRJ|d = CLRJ|n = CLRJ
    numerator = int(a) * int(c)	## numerator = CLRJ|a = CLRJ|c = CLRJ
    denom = int(b) * int(d)	## denom = CLRJ|b = CLRJ|d = CLRJ
    if (numerator/denom == int(numerator/denom)):	## numerator = CLRJ|denom = CLRJ
        return True
    return False
