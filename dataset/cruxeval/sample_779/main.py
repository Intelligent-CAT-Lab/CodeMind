def f(text):
    values = text.split()
    return '${first}y, ${second}x, ${third}r, ${fourth}p' % dict({
        'first': values[0],
        'second': values[1],
        'third': values[2],
        'fourth': values[3]
    })