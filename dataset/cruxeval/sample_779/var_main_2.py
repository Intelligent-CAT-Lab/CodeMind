def f(text):
    values = text.split()	## values = [] | text = []
    return '${first}y, ${second}x, ${third}r, ${fourth}p' % dict({
        'first': values[0],	## values = []
        'second': values[1],	## values = []
        'third': values[2],	## values = []
        'fourth': values[3]	## values = []
    })