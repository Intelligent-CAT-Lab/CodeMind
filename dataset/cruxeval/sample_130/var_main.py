def f(m):
    items = list(m.items())	## {"items" : '',"m" : ''}
    for i in range(len(items)-2, -1, -1):	## {"i" : '',"items" : ''}
        tmp = items[i]	## {"tmp" : '',"items" : '',"i" : ''}
        items[i] = items[i+1] 	## {"items" : '',"i" : ''}
        items[i+1] = tmp	## {"items" : '',"i" : '',"tmp" : ''}
    return ['{}={}', '{1}={0}'][len(items) % 2].format(	## {"items" : ''}
        *m.keys(), **m	## {"m" : ''}
    )