def f(ip, n):
    i = 0	## {"i" : ''}
    out = ''	## {"out" : ''}
    for c in ip:	## {"c" : '',"ip" : ''}
        if i == n:	## {"i" : '',"n" : ''}
            out += '\n'	## {"out" : ''}
            i = 0	## {"i" : ''}
        i += 1	## {"i" : ''}
        out += c	## {"out" : '',"c" : ''}
    return out	## {"out" : ''}
