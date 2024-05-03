def iscube(a):
    a = abs(a)	## a = CLRJ
    return int(round(a ** (1. / 3))) ** 3 == a	## a = CLRJ
