def f(c, index, value):
    c[index] = value
    if value >= 3:
        c.update({'message' : 'xcrWt'})
    else: 
        del c['message']
    return c