def f(text):
    values = text.split()	## values = CLRJ | text = CLRJ
    return '${first}y, ${second}x, ${third}r, ${fourth}p' % dict({
        'first': values[0],	## values = CLRJ
        'second': values[1],	## values = CLRJ
        'third': values[2],	## values = CLRJ
        'fourth': values[3]	## values = CLRJ
    })