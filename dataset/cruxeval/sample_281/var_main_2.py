def f(c, index, value):
    c[index] = value	## c = [] | index = [] | value = []
    if value >= 3:	## value = []
        c.update({'message' : 'xcrWt'})
    else: 
        del c['message']	## c = []
    return c	## c = []
