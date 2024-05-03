def f(str):
    d = str.rpartition('ar')	## d = CLRJ | str = CLRJ
    return ' '.join((d[0], d[1], d[2]))	## d = CLRJ
