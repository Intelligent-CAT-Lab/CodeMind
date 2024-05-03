def f(str):
    d = str.rpartition('ar')	## d = [] | str = []
    return ' '.join((d[0], d[1], d[2]))	## d = []
