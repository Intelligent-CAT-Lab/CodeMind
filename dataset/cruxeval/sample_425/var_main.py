def f(a):
    a = a.replace('/', ':')	## {"a" : ''}
    z = a.rpartition(':')	## {"z" : '',"a" : ''}
    return [z[0], z[1], z[2]]	## {"z" : ''}
