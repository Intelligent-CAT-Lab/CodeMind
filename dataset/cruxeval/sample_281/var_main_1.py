def f(c, index, value):
    c[index] = value	## c = CLRJ | index = CLRJ | value = CLRJ
    if value >= 3:	## value = CLRJ
        c.update({'message' : 'xcrWt'})
    else: 
        del c['message']	## c = CLRJ
    return c	## c = CLRJ
