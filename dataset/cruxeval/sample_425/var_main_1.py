def f(a):
    a = a.replace('/', ':')	## a = CLRJ
    z = a.rpartition(':')	## z = CLRJ | a = CLRJ
    return [z[0], z[1], z[2]]	## z = CLRJ
